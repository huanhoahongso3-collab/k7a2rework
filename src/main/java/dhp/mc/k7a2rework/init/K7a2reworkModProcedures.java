
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package dhp.mc.k7a2rework.init;

import dhp.mc.k7a2rework.procedures.TNTBowProjectileProjectileHitsLivingEntityProcedure;
import dhp.mc.k7a2rework.procedures.TNTBowProjectileProjectileHitsBlockProcedure;
import dhp.mc.k7a2rework.procedures.K7A2PotionEffectEffectStartedappliedProcedure;
import dhp.mc.k7a2rework.procedures.K7A2EnchantedApplePlayerFinishesUsingItemProcedure;
import dhp.mc.k7a2rework.procedures.K7A2CarrotPlayerFinishesUsingItemProcedure;
import dhp.mc.k7a2rework.procedures.K7A2BowRangedItemUsedProcedure;
import dhp.mc.k7a2rework.procedures.K7A2ApplePlayerFinishesUsingItemProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class K7a2reworkModProcedures {
	public static void load() {
		new K7A2ApplePlayerFinishesUsingItemProcedure();
		new K7A2PotionEffectEffectStartedappliedProcedure();
		new K7A2EnchantedApplePlayerFinishesUsingItemProcedure();
		new K7A2CarrotPlayerFinishesUsingItemProcedure();
		new K7A2BowRangedItemUsedProcedure();
		new TNTBowProjectileProjectileHitsBlockProcedure();
		new TNTBowProjectileProjectileHitsLivingEntityProcedure();
	}
}
