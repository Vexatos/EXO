package com.exo.blocks;

import com.exo.core.EXOLocalizationHelper;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;

public enum EXOBlocks{
	INSTANCE;
	
	public static final Block BLOCK_ASSEMBLER = new BlockAssembler(3000);
	
	public void addBlockNames(){
		LanguageRegistry.addName(BLOCK_ASSEMBLER, EXOLocalizationHelper.translate("block.assembler.name"));
	}
	
	public void registerBlocks(){
		GameRegistry.registerBlock(BLOCK_ASSEMBLER, "exo:" + BLOCK_ASSEMBLER.getUnlocalizedName());
	}
}