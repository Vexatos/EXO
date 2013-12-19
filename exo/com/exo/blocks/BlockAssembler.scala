package com.exo.blocks

import net.minecraft.block.BlockContainer
import net.minecraft.block.material.Material
import net.minecraft.item.ItemStack
import net.minecraft.entity.EntityLivingBase
import net.minecraft.world.World
import net.minecraft.util.Icon
import net.minecraft.client.renderer.texture.IconRegister
import net.minecraft.tileentity.TileEntity
import com.exo.tile.TileAssembler

class BlockAssembler(id: Int) extends BlockContainer(id, Material.iron){
  this.setUnlocalizedName("exoBlockAssembler");
  this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.7F, 1.0F);
  
  override def onBlockPlacedBy(world: World, x: Int, y: Int, z: Int, living: EntityLivingBase, stac: ItemStack){
    
  }
  
  override def getIcon(side: Int, meta: Int): Icon={
    return this.blockIcon;
  }
  
  override def registerIcons(register: IconRegister){
    
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
    return new TileAssembler;
  }
}