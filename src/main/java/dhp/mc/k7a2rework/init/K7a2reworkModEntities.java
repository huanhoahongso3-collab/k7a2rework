
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package dhp.mc.k7a2rework.init;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

import dhp.mc.k7a2rework.entity.TNTBowProjectileEntity;
import dhp.mc.k7a2rework.entity.PhanEntity;
import dhp.mc.k7a2rework.entity.K7A2ProjectileEntity;
import dhp.mc.k7a2rework.entity.DinhEntity;
import dhp.mc.k7a2rework.K7a2reworkMod;

public class K7a2reworkModEntities {
	public static EntityType<DinhEntity> DINH;
	public static EntityType<K7A2ProjectileEntity> K_7_A_2_PROJECTILE;
	public static EntityType<TNTBowProjectileEntity> TNT_BOW_PROJECTILE;
	public static EntityType<PhanEntity> PHAN;

	public static void load() {
		DINH = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(K7a2reworkMod.MODID, "dinh"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, DinhEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).fireImmune().trackRangeBlocks(2).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		DinhEntity.init();
		FabricDefaultAttributeRegistry.register(DINH, DinhEntity.createAttributes());
		K_7_A_2_PROJECTILE = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(K7a2reworkMod.MODID, "k_7_a_2_projectile"), createArrowEntityType(K7A2ProjectileEntity::new));
		TNT_BOW_PROJECTILE = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(K7a2reworkMod.MODID, "tnt_bow_projectile"), createArrowEntityType(TNTBowProjectileEntity::new));
		PHAN = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(K7a2reworkMod.MODID, "phan"),
				FabricEntityTypeBuilder.create(MobCategory.MISC, PhanEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).trackRangeBlocks(7).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		PhanEntity.init();
		FabricDefaultAttributeRegistry.register(PHAN, PhanEntity.createAttributes());
	}

	private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory) {
		return FabricEntityTypeBuilder.create(MobCategory.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(1).trackedUpdateRate(64).build();
	}
}
