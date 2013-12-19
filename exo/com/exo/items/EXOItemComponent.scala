package com.exo.items

import com.exo.lib.EXOTab

import net.minecraft.client.renderer.texture.IconRegister
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.util.Icon

import java.util.List

object EXOItemComponent{
  val COMPONENT_NAMES: Array[String] = Array(
      "chestplate", "chestplateLeft", "chestplateRight",
      "concusionCell", "joint", "powerCell",
      "resistor", "shins", "supportBar",
      "toes"
  );
  
  class ItemComponent(id: Int) extends Item(id){
    private var textures: Array[Icon] = null;
    
    this.setUnlocalizedName("exoItemComponent");
    this.setHasSubtypes(true);
    this.setCreativeTab(EXOTab.tabCrafting);
    
    override def getIconFromDamage(damage: Int): Icon={
      return this.textures(damage);
    }
    
    override def getUnlocalizedName(stack: ItemStack): String={
      return "itemComponent" + EXOItemComponent.COMPONENT_NAMES(stack.getItemDamage());
    }
    
    override def registerIcons(register: IconRegister){
      this.textures = new Array[Icon](EXOItemComponent.COMPONENT_NAMES.length);
      for(i <- 0 to EXOItemComponent.COMPONENT_NAMES.length - 1){
        this.textures(i) = register.registerIcon("exo:component/" + EXOItemComponent.COMPONENT_NAMES(i));
      }
    }
    
    override def getSubItems(id: Int, tab: CreativeTabs, list$: List[_]){
      val list = list$.asInstanceOf[List[ItemStack]];
      
      for(i <- 0 to EXOItemComponent.COMPONENT_NAMES.length - 1){
        list.add(new ItemStack(id, 1, i));
      }
    }
  }
}