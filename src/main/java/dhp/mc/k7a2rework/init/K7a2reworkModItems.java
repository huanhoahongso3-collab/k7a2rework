/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package dhp.mc.k7a2rework.init;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import dhp.mc.k7a2rework.item.TNTBowItem;
import dhp.mc.k7a2rework.item.TNTArrowItem;
import dhp.mc.k7a2rework.item.K7A2SwordItem;
import dhp.mc.k7a2rework.item.K7A2SuperIngotItem;
import dhp.mc.k7a2rework.item.K7A2SpammableSwordItem;
import dhp.mc.k7a2rework.item.K7A2ShovelItem;
import dhp.mc.k7a2rework.item.K7A2ShieldItem;
import dhp.mc.k7a2rework.item.K7A2ProjectileItemItem;
import dhp.mc.k7a2rework.item.K7A2PickaxeItem;
import dhp.mc.k7a2rework.item.K7A2IngotItem;
import dhp.mc.k7a2rework.item.K7A2HoeItem;
import dhp.mc.k7a2rework.item.K7A2EnchantedAppleItem;
import dhp.mc.k7a2rework.item.K7A2CarrotItem;
import dhp.mc.k7a2rework.item.K7A2BowItem;
import dhp.mc.k7a2rework.item.K7A2AxeItem;
import dhp.mc.k7a2rework.item.K7A2ArmorArmorItem;
import dhp.mc.k7a2rework.item.K7A2AppleItem;
import dhp.mc.k7a2rework.K7a2reworkMod;

public class K7a2reworkModItems {
	public static Item K_7_A_2_BLOCK;
	public static Item K_7_A_2_INGOT;
	public static Item K_7_A_2_SUPER_INGOT;
	public static Item K_7_A_2_SPAMMABLE_SWORD;
	public static Item K_7_A_2_SHIELD;
	public static Item K_7_A_2_ARMOR_ARMOR_HELMET;
	public static Item K_7_A_2_ARMOR_ARMOR_CHESTPLATE;
	public static Item K_7_A_2_ARMOR_ARMOR_LEGGINGS;
	public static Item K_7_A_2_ARMOR_ARMOR_BOOTS;
	public static Item K_7_A_2_BOW;
	public static Item K_7_A_2_PROJECTILE_ITEM;
	public static Item K_7_A_2_PICKAXE;
	public static Item K_7_A_2_AXE;
	public static Item K_7_A_2_SHOVEL;
	public static Item K_7_A_2_HOE;
	public static Item K_7_A_2_SWORD;
	public static Item K_7_A_2_APPLE;
	public static Item K_7_A_2_ENCHANTED_APPLE;
	public static Item K_7_A_2_CARROT;
	public static Item DINH_SPAWN_EGG;
	public static Item K_7_A_2_FLOWER;
	public static Item K_7_A_2_RAINBOW_BLOCK;
	public static Item TNT_ARROW;
	public static Item TNT_BOW;
	public static Item PHAN_SPAWN_EGG;

	public static void load() {
		K_7_A_2_BLOCK = register("k_7_a_2_block", new BlockItem(K7a2reworkModBlocks.K_7_A_2_BLOCK, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(K7a2reworkModTabs.TAB_K_7_A_2).register(content -> content.accept(K_7_A_2_BLOCK));
		K_7_A_2_INGOT = register("k_7_a_2_ingot", new K7A2IngotItem());
		K_7_A_2_SUPER_INGOT = register("k_7_a_2_super_ingot", new K7A2SuperIngotItem());
		K_7_A_2_SPAMMABLE_SWORD = register("k_7_a_2_spammable_sword", new K7A2SpammableSwordItem());
		K_7_A_2_SHIELD = register("k_7_a_2_shield", new K7A2ShieldItem());
		K_7_A_2_ARMOR_ARMOR_HELMET = register("k_7_a_2_armor_armor_helmet", new K7A2ArmorArmorItem.Helmet());
		K_7_A_2_ARMOR_ARMOR_CHESTPLATE = register("k_7_a_2_armor_armor_chestplate", new K7A2ArmorArmorItem.Chestplate());
		K_7_A_2_ARMOR_ARMOR_LEGGINGS = register("k_7_a_2_armor_armor_leggings", new K7A2ArmorArmorItem.Leggings());
		K_7_A_2_ARMOR_ARMOR_BOOTS = register("k_7_a_2_armor_armor_boots", new K7A2ArmorArmorItem.Boots());
		K_7_A_2_BOW = register("k_7_a_2_bow", new K7A2BowItem());
		K_7_A_2_PROJECTILE_ITEM = register("k_7_a_2_projectile_item", new K7A2ProjectileItemItem());
		K_7_A_2_PICKAXE = register("k_7_a_2_pickaxe", new K7A2PickaxeItem());
		K_7_A_2_AXE = register("k_7_a_2_axe", new K7A2AxeItem());
		K_7_A_2_SHOVEL = register("k_7_a_2_shovel", new K7A2ShovelItem());
		K_7_A_2_HOE = register("k_7_a_2_hoe", new K7A2HoeItem());
		K_7_A_2_SWORD = register("k_7_a_2_sword", new K7A2SwordItem());
		K_7_A_2_APPLE = register("k_7_a_2_apple", new K7A2AppleItem());
		K_7_A_2_ENCHANTED_APPLE = register("k_7_a_2_enchanted_apple", new K7A2EnchantedAppleItem());
		K_7_A_2_CARROT = register("k_7_a_2_carrot", new K7A2CarrotItem());
		DINH_SPAWN_EGG = register("dinh_spawn_egg", new SpawnEggItem(K7a2reworkModEntities.DINH, -3407821, -1, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(K7a2reworkModTabs.TAB_K_7_A_2).register(content -> content.accept(DINH_SPAWN_EGG));
		K_7_A_2_FLOWER = register("k_7_a_2_flower", new BlockItem(K7a2reworkModBlocks.K_7_A_2_FLOWER, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(K7a2reworkModTabs.TAB_K_7_A_2).register(content -> content.accept(K_7_A_2_FLOWER));
		K_7_A_2_RAINBOW_BLOCK = register("k_7_a_2_rainbow_block", new BlockItem(K7a2reworkModBlocks.K_7_A_2_RAINBOW_BLOCK, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(K7a2reworkModTabs.TAB_K_7_A_2).register(content -> content.accept(K_7_A_2_RAINBOW_BLOCK));
		TNT_ARROW = register("tnt_arrow", new TNTArrowItem());
		TNT_BOW = register("tnt_bow", new TNTBowItem());
		PHAN_SPAWN_EGG = register("phan_spawn_egg", new SpawnEggItem(K7a2reworkModEntities.PHAN, -10092493, -26215, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(K7a2reworkModTabs.TAB_K_7_A_2).register(content -> content.accept(PHAN_SPAWN_EGG));
	}

	public static void clientLoad() {
		registerBlockingProperty(K_7_A_2_SHIELD);
	}

	private static Item register(String registryName, Item item) {
		return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(K7a2reworkMod.MODID, registryName), item);
	}

	private static void registerBlockingProperty(Item item) {
		ItemProperties.register(item, new ResourceLocation("blocking"), (ClampedItemPropertyFunction) ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
	}
}
