package com.exo.client

import com.exo.server.ServerProxy
import cpw.mods.fml.client.registry.ClientRegistry
import com.exo.client.render.RenderAssembler
import com.exo.tile.TileAssembler

class ClientProxy extends ServerProxy{
  override def init(){
    
  }
  
  override def initRenders(){
    
  }
  
  override def initTiles(){
    ClientRegistry.registerTileEntity(classOf[TileAssembler], "tileAssembler", new RenderAssembler.TESRAssembler());
  }
}