package com.exo.lib

import net.minecraftforge.event.ForgeSubscribe
import net.minecraftforge.event.EventPriority
import net.minecraftforge.client.event.RenderGameOverlayEvent
import cpw.mods.fml.client.FMLClientHandler

object EXOEvents{
  private class OverlayRenderHandler{
    @ForgeSubscribe(priority=EventPriority.NORMAL)
    def drawOverlay(event: RenderGameOverlayEvent){
      if(event.isCancelable() || FMLClientHandler.instance().getClient().gameSettings.showDebugInfo){
        return;
      }
      
      
    }
  }
}