package com.exo.lib

import net.minecraftforge.event.ForgeSubscribe
import net.minecraftforge.event.EventPriority
import net.minecraftforge.client.event.RenderGameOverlayEvent
import cpw.mods.fml.client.FMLClientHandler
import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.event.EventBus

object EXOEvents{
  private val BUS: EventBus = MinecraftForge.EVENT_BUS;
  
  def registerHandlers(){
    BUS.register(new OverlayRenderHandler());
  }
  
  private class OverlayRenderHandler{
    @ForgeSubscribe(priority=EventPriority.NORMAL)
    def drawOverlay(event: RenderGameOverlayEvent){
      if(event.isCancelable() || FMLClientHandler.instance().getClient().gameSettings.showDebugInfo){
        return;
      }
      
      
    }
  }
}