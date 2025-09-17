
package dhp.mc.k7a2rework.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import java.util.List;

import dhp.mc.k7a2rework.init.K7a2reworkModTabs;
import dhp.mc.k7a2rework.init.K7a2reworkModItems;

public class K7A2SpammableSwordItem extends SwordItem {
	public K7A2SpammableSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(K7a2reworkModItems.K_7_A_2_INGOT));
			}
		}, 3, 96f, new Item.Properties().fireResistant());
		ItemGroupEvents.modifyEntriesEvent(K7a2reworkModTabs.TAB_K_7_A_2).register(content -> content.accept(this));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
