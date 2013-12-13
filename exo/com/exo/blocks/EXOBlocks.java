package com.exo.blocks;

import com.exo.core.data.EXOSessionData;
import com.exo.core.helper.EXOLocalizationHelper;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;

public enum EXOBlocks{
	INSTANCE;
	
	public static final Block BLOCK_ASSEMBLER = new BlockAssembler(EXOSessionData.BLOCK_ASSEMBLER_ID);
	
	public void addBlockNames(){
		LanguageRegistry.addName(BLOCK_ASSEMBLER, EXOLocalizationHelper.translate("block.assembler.name"));
	}
	
	public void registerBlocks(){
		GameRegistry.registerBlock(BLOCK_ASSEMBLER, "exo:" + BLOCK_ASSEMBLER.getUnlocalizedName());
	}
}