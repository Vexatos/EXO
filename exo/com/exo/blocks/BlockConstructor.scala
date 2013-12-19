package com.exo.blocks

import com.exo.lib.EXOTab
import net.minecraft.block.BlockContainer
import net.minecraft.block.material.Material
import net.minecraft.item.ItemStack
import net.minecraft.entity.EntityLivingBase
import net.minecraft.world.World
import net.minecraft.tileentity.TileEntity
import com.exo.tile.TileConstructor

class BlockConstructor(id: Int) extends BlockContainer(id, Material.iron){
  this.setUnlocalizedName("exoBlockConstructor");
  this.setCreativeTab(EXOTab.tabCrafting);
  this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.4F, 1.0F);
  
  override def onBlockPlacedBy(world: World, x: Int, y: Int, z: Int, living: EntityLivingBase, stack: ItemStack){
    
  }
  
  override def isOpaqueCube(): Boolean={
    return false;
  }
  
  override def renderAsNormalBlock(): Boolean={
    return false;
  }
  
  override def getRenderType(): Int={
    return -1;
  }
  
  override def getRenderBlockPass(): Int={
    return 1;
  }
  
  override def createNewTileEntity(world: World): TileEntity={
    return new TileConstructor();
  }
}