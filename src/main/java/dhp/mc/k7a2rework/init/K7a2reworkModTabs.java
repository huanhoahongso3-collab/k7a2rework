
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package dhp.mc.k7a2rework.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import dhp.mc.k7a2rework.K7a2reworkMod;

public class K7a2reworkModTabs {
	public static ResourceKey<CreativeModeTab> TAB_K_7_A_2 = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(K7a2reworkMod.MODID, "k_7_a_2"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_K_7_A_2,
				FabricItemGroup.builder().title(Component.translatable("item_group." + K7a2reworkMod.MODID + ".k_7_a_2")).icon(() -> new ItemStack(K7a2reworkModItems.K_7_A_2_INGOT)).build());
	}
}
