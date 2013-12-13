package com.exo.client;

import com.exo.render.tesr.TESRAssembler;
import com.exo.server.CommonProxy;
import com.exo.tile.TileAssembler;

import cpw.mods.fml.client.registry.ClientRegistry;

public final class ClientProxy extends CommonProxy{
	@Override
	public void initRenders(){
		
	}
	
	@Override
	public void initTiles(){
		ClientRegistry.registerTileEntity(TileAssembler.class, "tileAssembler", new TESRAssembler());
	}
	
	@Override
	public void init(){
		
	}
}