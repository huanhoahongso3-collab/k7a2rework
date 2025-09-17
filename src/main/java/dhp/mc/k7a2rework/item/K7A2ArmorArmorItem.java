
package dhp.mc.k7a2rework.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.List;

import java.lang.reflect.Type;

import dhp.mc.k7a2rework.init.K7a2reworkModTabs;
import dhp.mc.k7a2rework.init.K7a2reworkModItems;

public abstract class K7A2ArmorArmorItem extends ArmorItem {
	public K7A2ArmorArmorItem(Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 506;
			}

			@Override
			public int getDefenseForType(Type type) {
				return new int[]{56, 56, 56, 56}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 42;
			}

			@Override
			public SoundEvent getEquipSound() {
				return BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("item.armor.equip_netherite"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(K7a2reworkModItems.K_7_A_2_SUPER_INGOT));
			}

			@Environment(EnvType.CLIENT)
			@Override
			public String getName() {
				return "k7a2armor";
			}

			@Override
			public float getToughness() {
				return 4f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.5f;
			}
		}, type, properties);
	}

	public static class Helmet extends K7A2ArmorArmorItem {
		public Helmet() {
			super(Type.HELMET, new Item.Properties().fireResistant());
			ItemGroupEvents.modifyEntriesEvent(K7a2reworkModTabs.TAB_K_7_A_2).register(content -> content.accept(this));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
		}
	}

	public static class Chestplate extends K7A2ArmorArmorItem {

		public Chestplate() {
			super(Type.CHESTPLATE, new Item.Properties().fireResistant());
			ItemGroupEvents.modifyEntriesEvent(K7a2reworkModTabs.TAB_K_7_A_2).register(content -> content.accept(this));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
		}
	}

	public static class Leggings extends K7A2ArmorArmorItem {

		public Leggings() {
			super(Type.LEGGINGS, new Item.Properties().fireResistant());
			ItemGroupEvents.modifyEntriesEvent(K7a2reworkModTabs.TAB_K_7_A_2).register(content -> content.accept(this));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
		}
	}

	public static class Boots extends K7A2ArmorArmorItem {

		public Boots() {
			super(Type.BOOTS, new Item.Properties().fireResistant());
			ItemGroupEvents.modifyEntriesEvent(K7a2reworkModTabs.TAB_K_7_A_2).register(content -> content.accept(this));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
		}
	}
}
