package com.exo.blocks;

import net.minecraft.block.Block;

import com.exo.core.data.EXOSessionData;
import com.exo.core.helper.EXOLocalizationHelper;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public enum EXOBlocks{
	INSTANCE;
	
	public static final Block BLOCK_ASSEMBLER = new BlockAssembler(EXOSessionData.BLOCK_ASSEMBLER_ID);
	public static final Block BLOCK_CONSTRUCTOR = new BlockConstructor(EXOSessionData.BLOCK_CONSTRUCTOR_ID);
	
	public void addBlockNames(){
		LanguageRegistry.addName(BLOCK_ASSEMBLER, EXOLocalizationHelper.translate("block.assembler.name"));
		LanguageRegistry.addName(BLOCK_CONSTRUCTOR, EXOLocalizationHelper.translate("block.constructor.name"));
	}
	
	public void registerBlocks(){
		GameRegistry.registerBlock(BLOCK_ASSEMBLER, "exo:" + BLOCK_ASSEMBLER.getUnlocalizedName());
		GameRegistry.registerBlock(BLOCK_CONSTRUCTOR, "exo:" + BLOCK_CONSTRUCTOR.getUnlocalizedName());
	}
}