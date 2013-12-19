package com.exo.items

import net.minecraft.item.Item
import cpw.mods.fml.common.registry.GameRegistry
import cpw.mods.fml.common.registry.LanguageRegistry
import com.exo.lib.helper.LocalizationHelper
import com.exo.items.EXOItemCrafting.ItemCrafting
import com.exo.items.EXOItemComponent.ItemComponent
import com.exo.lib.{EXOMetadata=>meta}
import net.minecraft.item.ItemStack

object Items{
  val ITEM_CRAFTING: Item = new ItemCrafting(5000);
  val ITEM_COMPONENT: Item = new ItemComponent(5001);
  
  def registerItems(){
    this.registerItem(ITEM_CRAFTING);
    this.registerItem(ITEM_COMPONENT);
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
    this.addName(meta.STACK_CRAFTING_STORAGE_DRIVE, "item.crafting.storageDrive");
    
    this.addName(meta.STACK_COMPONENT_CHESTPLATE, "item.component.chestplate");
    this.addName(meta.STACK_COMPONENT_CHESTPLATE_LEFT, "item.component.chestplate.left");
    this.addName(meta.STACK_COMPONENT_CHESTPLATE_RIGHT, "item.component.chestplate.right");
    this.addName(meta.STACK_COMPONENT_CONCUSSION_CELL, "item.component.concussionCell");
    this.addName(meta.STACK_COMPONENT_JOINT, "item.component.joint");
    this.addName(meta.STACK_COMPONENT_POWER_CELL, "item.component.powerCell");
    this.addName(meta.STACK_COMPONENT_RESISTOR, "item.component.resistor");
    this.addName(meta.STACK_COMPONENT_SHINS, "item.component.shins");
    this.addName(meta.STACK_COMPONENT_SUPPORT_BAR, "item.component.supportBar");
    this.addName(meta.STACK_COMPONENT_TOES, "item.component.toes");
  }
  
  private def addName(item: Item, tag: String){
    LanguageRegistry.addName(item, LocalizationHelper.translate(tag + ".name"));
  }
  
  private def addName(stack: ItemStack, tag: String){
    LanguageRegistry.addName(stack, LocalizationHelper.translate(tag + ".name"));
  }
}