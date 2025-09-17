
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package dhp.mc.k7a2rework.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import dhp.mc.k7a2rework.block.K7A2RainbowBlockBlock;
import dhp.mc.k7a2rework.block.K7A2FlowerBlock;
import dhp.mc.k7a2rework.block.K7A2BlockBlock;
import dhp.mc.k7a2rework.K7a2reworkMod;

public class K7a2reworkModBlocks {
	public static Block K_7_A_2_BLOCK;
	public static Block K_7_A_2_FLOWER;
	public static Block K_7_A_2_RAINBOW_BLOCK;

	public static void load() {
		K_7_A_2_BLOCK = register("k_7_a_2_block", new K7A2BlockBlock());
		K_7_A_2_FLOWER = register("k_7_a_2_flower", new K7A2FlowerBlock());
		K_7_A_2_RAINBOW_BLOCK = register("k_7_a_2_rainbow_block", new K7A2RainbowBlockBlock());
	}

	public static void clientLoad() {
		K7A2BlockBlock.clientInit();
		K7A2FlowerBlock.clientInit();
		K7A2RainbowBlockBlock.clientInit();
	}

	private static Block register(String registryName, Block block) {
		return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(K7a2reworkMod.MODID, registryName), block);
	}
}
