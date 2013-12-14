package com.exo.client;

import net.minecraftforge.client.MinecraftForgeClient;

import com.exo.blocks.EXOBlocks;
import com.exo.render.iir.IIRAssembler;
import com.exo.render.iir.IIRConstructor;
import com.exo.render.tesr.TESRAssembler;
import com.exo.render.tesr.TESRConstructor;
import com.exo.server.CommonProxy;
import com.exo.tile.TileAssembler;
import com.exo.tile.TileConstructor;

import cpw.mods.fml.client.registry.ClientRegistry;

public final class ClientProxy extends CommonProxy{
	@Override
	public void initRenders(){
		MinecraftForgeClient.registerItemRenderer(EXOBlocks.BLOCK_ASSEMBLER.blockID, new IIRAssembler());
		MinecraftForgeClient.registerItemRenderer(EXOBlocks.BLOCK_CONSTRUCTOR.blockID, new IIRConstructor());
	}
	
	@Override
	public void initTiles(){
		ClientRegistry.registerTileEntity(TileAssembler.class, "tileAssembler", new TESRAssembler());
		ClientRegistry.registerTileEntity(TileConstructor.class, "tileConstructor", new TESRConstructor());
	}
	
	@Override
	public void init(){
		
	}
}