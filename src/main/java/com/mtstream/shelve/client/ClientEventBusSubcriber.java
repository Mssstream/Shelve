package com.mtstream.shelve.client;

import com.mtstream.shelve.Shelve;
import com.mtstream.shelve.init.BlockInit;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Shelve.MOD_ID,bus = Bus.MOD,value = Dist.CLIENT)
public class ClientEventBusSubcriber {
	@SubscribeEvent
	public static void clienSetup(FMLClientSetupEvent event) {
		ItemBlockRenderTypes.setRenderLayer(BlockInit.HARVESTER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CRYSTAL_BALL.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.MEGA_GLOW_BERRY.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CREEPSHROOM.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BEAR_TRAP.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.RHEOSTAT.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.COPPER_BARS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.SHEARER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GLASS_TUBE.get(), RenderType.cutout());
	}
}
