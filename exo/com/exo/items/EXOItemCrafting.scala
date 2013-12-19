package com.exo.items

import java.util.List

import com.exo.lib.EXOTab

import net.minecraft.client.renderer.texture.IconRegister
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.util.Icon

object EXOItemCrafting{
  val CRAFTING_NAMES: Array[String] = Array(
      "fuse", "hinge", "metalGear",
      "metalRod", "metalSheet", "padLock",
      "reenforcedMetalSheet", "ringRod", "storageDrive",
      "suspension", "valve"
  );
  
  class ItemCrafting(id: Int) extends Item(id){
    private var textures: Array[Icon] = null;
    
    this.setUnlocalizedName("exoItemCrafting");
    this.setHasSubtypes(true);
    this.setCreativeTab(EXOTab.tabCrafting);
    
    override def getIconFromDamage(damage: Int): Icon={
      return this.textures(damage);
    }
    
    override def getUnlocalizedName(stack: ItemStack): String={
      return "itemCrafting" + EXOItemCrafting.CRAFTING_NAMES(stack.getItemDamage);
    }
    
    override def registerIcons(register: IconRegister){
      for(i <- 0 to EXOItemCrafting.CRAFTING_NAMES.length){
        this.textures(i) = register.registerIcon("exo:crafting/" + EXOItemCrafting.CRAFTING_NAMES(i));
      }
    }
    
    override def getSubItems(id: Int, tab: CreativeTabs, list$: List[_]){
      val list = list$.asInstanceOf[List[ItemStack]];
      
      for(i <- 0 to EXOItemCrafting.CRAFTING_NAMES.length){
        list.add(new ItemStack(id, 1, i));
      }
    }
  }
}