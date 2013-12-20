package com.exo.blocks

import com.exo.lib.helper.LocalizationHelper

import cpw.mods.fml.common.registry.GameRegistry
import cpw.mods.fml.common.registry.LanguageRegistry
import net.minecraft.block.Block

object Blocks{
  val BLOCK_ASSEMBLER: Block = new BlockAssembler(3000);
  val BLOCK_ASSEMBLER_DUMMY: Block = new BlockAssemblerDummy(3001);
  
  def registerBlocks(){
    this.registerBlock(BLOCK_ASSEMBLER);
    this.registerBlock(BLOCK_ASSEMBLER_DUMMY);
  }
  
  private def registerBlock(block: Block){
    GameRegistry.registerBlock(block, "exo:" + block.getUnlocalizedName());
  }
  
  def addBlockNames(){
    this.addName(BLOCK_ASSEMBLER, "block.assembler");
  }
  
  private def addName(block: Block, tag: String){
    LanguageRegistry.addName(block, LocalizationHelper.translate(tag + ".name"));
  }
}