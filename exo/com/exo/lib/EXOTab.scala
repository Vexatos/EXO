package com.exo.lib

import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item
import net.minecraft.item.ItemStack

object EXOTab{
  val tabCrafting: CreativeTabs = new Tab("Exoskeleton Crafting").setIcon(Item.diamond.itemID, 0);
  val tabCore: CreativeTabs = new Tab("Exoskeleton").setIcon(Item.diamond.itemID, 0);
  
  private class Tab(label: String) extends CreativeTabs(label){
    var itemID: Int = _;
    var meta: Int = _;
    
  	def setIcon(id: Int, meta: Int): Tab={
      this.itemID = id;
      this.meta = meta;
      return this;
    }
  	
  	override def getIconItemStack(): ItemStack={
  	  return new ItemStack(this.itemID, 1, this.meta);
  	}
  	
  	override def getTranslatedTabLabel(): String={
  	  return super.getTabLabel();
  	}
  }
}