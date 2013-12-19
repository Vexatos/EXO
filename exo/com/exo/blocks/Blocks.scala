package com.exo.blocks

import com.exo.lib.helper.LocalizationHelper

import cpw.mods.fml.common.registry.GameRegistry
import cpw.mods.fml.common.registry.LanguageRegistry
import net.minecraft.block.Block

object Blocks{
  val BLOCK_CONSTRUCTOR: Block = new BlockConstructor(3000);
  
  def registerBlocks(){
    this.registerBlock(BLOCK_CONSTRUCTOR);
  }
  
  private def registerBlock(block: Block){
    GameRegistry.registerBlock(block, "exo:" + block.getUnlocalizedName());
  }
  
  def addBlockNames(){
    this.addName(BLOCK_CONSTRUCTOR, "block.constructor");
  }
  
  private def addName(block: Block, tag: String){
    LanguageRegistry.addName(block, LocalizationHelper.translate(tag + ".name"));
  }
}