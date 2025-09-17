
package dhp.mc.k7a2rework.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ProjectileWeaponItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import java.util.List;

import dhp.mc.k7a2rework.procedures.K7A2BowRangedItemUsedProcedure;
import dhp.mc.k7a2rework.init.K7a2reworkModTabs;
import dhp.mc.k7a2rework.entity.K7A2ProjectileEntity;

import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap;

public class K7A2BowItem extends Item {
	public K7A2BowItem() {
		super(new Item.Properties().durability(5610).fireResistant().rarity(Rarity.RARE));
		ItemGroupEvents.modifyEntriesEvent(K7a2reworkModTabs.TAB_K_7_A_2).register(content -> content.accept(this));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.BOW;
	}

	@Override
	public int getEnchantmentValue() {
		return 47;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 72000;
	}

	@Override
	public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot equipmentSlot) {
		if (equipmentSlot == EquipmentSlot.MAINHAND) {
			ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
			builder.putAll(super.getDefaultAttributeModifiers(equipmentSlot));
			builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Item modifier", 3d, AttributeModifier.Operation.ADDITION));
			builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Item modifier", -2.4, AttributeModifier.Operation.ADDITION));
			return builder.build();
		}
		return super.getDefaultAttributeModifiers(equipmentSlot);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = InteractionResultHolder.success(entity.getItemInHand(hand));
		entity.startUsingItem(hand);
		return ar;
	}
@Override
public void onUseTick(Level world, LivingEntity entity, ItemStack itemstack, int count) {
	if (!world.isClientSide() && entity instanceof ServerPlayer player) {
		ItemStack stack = ProjectileWeaponItem.getHeldProjectile(entity, e -> e.getItem() == K7A2ProjectileEntity.PROJECTILE_ITEM.getItem());
		if (stack == ItemStack.EMPTY) {
			for (int i = 0; i < player.getInventory().items.size(); i++) {
				ItemStack teststack = player.getInventory().items.get(i);
				if (teststack != null && teststack.getItem() == K7A2ProjectileEntity.PROJECTILE_ITEM.getItem()) {
					stack = teststack;
					break;
				}
			}
		}
		if (player.getAbilities().instabuild || stack != ItemStack.EMPTY) {
			K7A2ProjectileEntity projectile = K7A2ProjectileEntity.shoot(world, entity, world.getRandom());
			itemstack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
			if (player.getAbilities().instabuild) {
				projectile.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
			} else {
				if (stack.isDamageableItem()) {
					if (stack.hurt(1, world.getRandom(), player)) {
						stack.shrink(1);
						stack.setDamageValue(0);
						if (stack.isEmpty())
							player.getInventory().removeItem(stack);
					}
				} else {
					stack.shrink(1);
					if (stack.isEmpty())
						player.getInventory().removeItem(stack);
				}
			}

			// ✅ FIXED: define x, y, z from entity position
			double x = entity.getX();
			double y = entity.getY();
			double z = entity.getZ();

			K7A2BowRangedItemUsedProcedure.execute(world, x, y, z);
		}
		entity.releaseUsingItem();
	}
}

}
