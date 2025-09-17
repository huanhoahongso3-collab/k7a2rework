
package dhp.mc.k7a2rework.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import java.util.List;

import dhp.mc.k7a2rework.procedures.K7A2EnchantedApplePlayerFinishesUsingItemProcedure;
import dhp.mc.k7a2rework.init.K7a2reworkModTabs;

public class K7A2EnchantedAppleItem extends Item {
	public K7A2EnchantedAppleItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE).food((new FoodProperties.Builder()).nutrition(20).saturationMod(1.5f).alwaysEat()

				.build()));
		ItemGroupEvents.modifyEntriesEvent(K7a2reworkModTabs.TAB_K_7_A_2).register(content -> content.accept(this));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 10;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		K7A2EnchantedApplePlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}
