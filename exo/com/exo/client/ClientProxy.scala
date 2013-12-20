package com.exo.client

import com.exo.server.ServerProxy
import cpw.mods.fml.client.registry.ClientRegistry
import com.exo.client.render.RenderAssembler
import com.exo.client.render.RenderConstructor
import com.exo.tile.TileAssembler
import com.exo.tile.TileConstructor

class ClientProxy extends ServerProxy{
  override def init(){
    
  }
  
  override def initRenders(){
    
  }
  
  override def initTiles(){
    ClientRegistry.registerTileEntity(classOf[TileAssembler], "tileAssembler", new RenderAssembler.TESRAssembler());
    ClientRegistry.registerTileEntity(classOf[TileConstructor], "tileConstructor", new RenderConstructor.TESRConstructor());
  }
}