package com.exo.items

import com.exo.lib.EXOTab

import net.minecraft.client.renderer.texture.IconRegister
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.util.Icon

object EXOItemComponent{
  val COMPONENT_NAMES: Array[String] = Array();
  
  class ItemComponent(id: Int) extends Item(id){
    var textures: Array[Icon] = _;
    
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
      for(i <- 0 to (EXOItemComponent.COMPONENT_NAMES.length - 1)){
        this.textures(i) = register.registerIcon("exo:component/" + EXOItemComponent.COMPONENT_NAMES(i));
      }
    }
  }
}