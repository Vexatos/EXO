package com.exo.blocks

import net.minecraft.block.Block
import cpw.mods.fml.common.registry.LanguageRegistry
import com.exo.lib.helper.LocalizationHelper
import cpw.mods.fml.common.registry.GameRegistry

object Blocks{
  def registerBlocks(){
    
  }
  
  private def registerBlock(block: Block){
    GameRegistry.registerBlock(block, "exo:" + block.getUnlocalizedName());
  }
  
  def addBlockNames(){
    
  }
  
  private def addName(block: Block, tag: String){
    LanguageRegistry.addName(block, LocalizationHelper.translate(tag));
  }
}