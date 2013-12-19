package com.exo.items

import net.minecraft.item.Item
import cpw.mods.fml.common.registry.GameRegistry
import cpw.mods.fml.common.registry.LanguageRegistry
import com.exo.lib.helper.LocalizationHelper

object Items{
  val ITEM_COMPONENT: Item = new EXOItemComponent.ItemComponent(5000);
  val ITEM_CRAFTING: Item = new EXOItemCrafting.ItemCrafting(5001);
  
  def registerItems(){
    
  }
  
  private def registerItem(item: Item){
    GameRegistry.registerItem(item, "exo:" + item.getUnlocalizedName());
  }
  
  def addItemNames(){
    
  }
  
  private def addName(item: Item, tag: String){
    LanguageRegistry.addName(item, LocalizationHelper.translate(tag));
  }
}