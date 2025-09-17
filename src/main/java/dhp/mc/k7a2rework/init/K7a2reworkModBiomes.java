
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package dhp.mc.k7a2rework.init;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.biome.MultiNoiseBiomeSource;
import net.minecraft.world.level.biome.FeatureSorter;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.server.MinecraftServer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import java.util.List;
import java.util.ArrayList;

import dhp.mc.k7a2rework.mixins.NoiseGeneratorSettingsAccess;
import dhp.mc.k7a2rework.K7a2reworkMod;

import com.mojang.datafixers.util.Pair;

import com.google.common.base.Suppliers;

public class K7a2reworkModBiomes {
	public static ResourceKey<Biome> AETHER_BIOME = ResourceKey.create(Registries.BIOME, new ResourceLocation(K7a2reworkMod.MODID, "aether_biome"));

	public static void loadEndBiomes() {
	}

	public static void load(MinecraftServer server) {
		Registry<DimensionType> dimensionTypeRegistry = server.registryAccess().registryOrThrow(Registries.DIMENSION_TYPE);
		Registry<LevelStem> levelStemTypeRegistry = server.registryAccess().registryOrThrow(Registries.LEVEL_STEM);
		Registry<Biome> biomeRegistry = server.registryAccess().registryOrThrow(Registries.BIOME);
		for (LevelStem levelStem : levelStemTypeRegistry.stream().toList()) {
			DimensionType dimensionType = levelStem.type().value();
			if (dimensionType == dimensionTypeRegistry.getOrThrow(BuiltinDimensionTypes.OVERWORLD)) {
				ChunkGenerator chunkGenerator = levelStem.generator();
				// Inject biomes to biome source
				if (chunkGenerator.getBiomeSource() instanceof MultiNoiseBiomeSource noiseSource) {
					List<Pair<Climate.ParameterPoint, Holder<Biome>>> parameters = new ArrayList<>(noiseSource.parameters().values());
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(0.3f, 1f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.point(0.0f),
							Climate.Parameter.span(-1f, 1f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("k7a2rework", "aether_biome")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(0.3f, 1f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.point(1.0f),
							Climate.Parameter.span(-1f, 1f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("k7a2rework", "aether_biome")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(0.3f, 1f), Climate.Parameter.span(-0.5f, 0.5f),
							Climate.Parameter.span(0.2f, 0.9f), Climate.Parameter.span(-1f, 1f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("k7a2rework", "aether_biome")))));
					chunkGenerator.biomeSource = MultiNoiseBiomeSource.createFromList(new Climate.ParameterList<>(parameters));
					chunkGenerator.featuresPerStep = Suppliers
							.memoize(() -> FeatureSorter.buildFeaturesPerStep(List.copyOf(chunkGenerator.biomeSource.possibleBiomes()), biome -> chunkGenerator.generationSettingsGetter.apply(biome).features(), true));
				}

				// Inject surface rules
				if (chunkGenerator instanceof NoiseBasedChunkGenerator noiseGenerator) {
					NoiseGeneratorSettings noiseGeneratorSettings = noiseGenerator.settings.value();
					((NoiseGeneratorSettingsAccess) (Object) noiseGeneratorSettings).addSurfaceRules(SurfaceRules.sequence(K7a2reworkModSurfaceRules.makeOverworldRules(), noiseGeneratorSettings.surfaceRule()));
				}
			}

		}
	}
}
