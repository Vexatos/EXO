package com.exo.items

import net.minecraft.item.Item
import cpw.mods.fml.common.registry.GameRegistry
import cpw.mods.fml.common.registry.LanguageRegistry
import com.exo.lib.helper.LocalizationHelper
import com.exo.items.EXOItemCrafting.ItemCrafting
import com.exo.lib.{EXOMetadata=>meta}
import net.minecraft.item.ItemStack

object Items{
  val ITEM_CRAFTING: Item = new ItemCrafting(5000);
  
  def registerItems(){
    this.registerItem(ITEM_CRAFTING);
  }
  
  private def registerItem(item: Item){
    GameRegistry.registerItem(item, "exo:" + item.getUnlocalizedName());
  }
  
  def addItemNames(){
    this.addName(meta.STACK_CRAFTING_FUSE, "item.crafting.fuse");
    this.addName(meta.STACK_CRAFTING_HINGE, "item.crafting.hinge");
    this.addName(meta.STACK_CRAFTING_METAL_GEAR, "item.crafting.metalGear");
    this.addName(meta.STACK_CRAFTING_METAL_ROD, "item.crafting.metalRod");
    this.addName(meta.STACK_CRAFTING_METAL_SHEET, "item.crafting.metalSheet");
    this.addName(meta.STACK_CRAFTING_PAD_LOCK, "item.crafting.padLock");
    this.addName(meta.STACK_CRAFTING_METAL_SHEET_R, "item.crafting.metalSheetReenforced");
    this.addName(meta.STACK_CRAFTING_RING_ROD, "item.crafting.ringRod");
    this.addName(meta.STACK_CRAFTING_SUSPENSION, "item.crafting.suspension");
    this.addName(meta.STACK_CRAFTING_VALVE, "item.crafting.valve");
  }
  
  private def addName(item: Item, tag: String){
    LanguageRegistry.addName(item, LocalizationHelper.translate(tag));
  }
  
  private def addName(stack: ItemStack, tag: String){
    LanguageRegistry.addName(stack, LocalizationHelper.translate(tag));
  }
}