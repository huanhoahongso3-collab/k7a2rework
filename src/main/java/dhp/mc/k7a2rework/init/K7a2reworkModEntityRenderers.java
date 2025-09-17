
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package dhp.mc.k7a2rework.init;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import dhp.mc.k7a2rework.client.renderer.PhanRenderer;
import dhp.mc.k7a2rework.client.renderer.DinhRenderer;

@Environment(EnvType.CLIENT)
public class K7a2reworkModEntityRenderers {
	public static void load() {
		EntityRendererRegistry.register(K7a2reworkModEntities.DINH, DinhRenderer::new);
		EntityRendererRegistry.register(K7a2reworkModEntities.K_7_A_2_PROJECTILE, ThrownItemRenderer::new);
		EntityRendererRegistry.register(K7a2reworkModEntities.TNT_BOW_PROJECTILE, ThrownItemRenderer::new);
		EntityRendererRegistry.register(K7a2reworkModEntities.PHAN, PhanRenderer::new);
	}
}
