package com.exo.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.client.MinecraftForgeClient;

import com.exo.core.data.EXOSessionData;
import com.exo.core.helper.EXOLocalizationHelper;
import com.exo.render.iir.IIRAssembler;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public enum EXOBlocks{
	INSTANCE;
	
	public static final Block BLOCK_ASSEMBLER = new BlockAssembler(EXOSessionData.BLOCK_ASSEMBLER_ID);
	
	public void addBlockNames(){
		LanguageRegistry.addName(BLOCK_ASSEMBLER, EXOLocalizationHelper.translate("block.assembler.name"));
	}
	
	public void registerBlocks(){
		GameRegistry.registerBlock(BLOCK_ASSEMBLER, "exo:" + BLOCK_ASSEMBLER.getUnlocalizedName());
	}
	
	public void registerItemRenders(){
		MinecraftForgeClient.registerItemRenderer(BLOCK_ASSEMBLER.blockID, new IIRAssembler());
	}
}