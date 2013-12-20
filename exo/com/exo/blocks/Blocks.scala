package com.exo.blocks

import com.exo.lib.helper.LocalizationHelper

import cpw.mods.fml.common.registry.GameRegistry
import cpw.mods.fml.common.registry.LanguageRegistry
import net.minecraft.block.Block

object Blocks{
  val BLOCK_ASSEMBLER: Block = new BlockAssembler(3000);
  val BLOCK_ASSEMBLER_DUMMY: Block = new BlockAssemblerDummy(3001);
  val BLOCK_CONSTRUCTOR: Block = new BlockConstructor(3002);
  val BLOCK_CONSTRUCTOR_DUMMY: Block = new BlockConstructor(3003);
  
  def registerBlocks(){
    this.registerBlock(BLOCK_ASSEMBLER);
    this.registerBlock(BLOCK_ASSEMBLER_DUMMY);
    this.registerBlock(BLOCK_CONSTRUCTOR);
    this.registerBlock(BLOCK_CONSTRUCTOR_DUMMY);
  }
  
  private def registerBlock(block: Block){
    GameRegistry.registerBlock(block, "exo:" + block.getUnlocalizedName());
  }
  
  def addBlockNames(){
    this.addName(BLOCK_ASSEMBLER, "block.assembler");
    this.addName(BLOCK_CONSTRUCTOR, "block.constructor");
  }
  
  private def addName(block: Block, tag: String){
    LanguageRegistry.addName(block, LocalizationHelper.translate(tag + ".name"));
  }
}