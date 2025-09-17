package dhp.mc.k7a2rework.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.server.level.ServerLevel;

import dhp.mc.k7a2rework.init.K7a2reworkModItems;

public class K7A2BowRangedItemUsedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level) {
			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(K7a2reworkModItems.K_7_A_2_PROJECTILE_ITEM));
			entityToSpawn.setPickUpDelay(0);
			_level.addFreshEntity(entityToSpawn);
		}
	}
}
