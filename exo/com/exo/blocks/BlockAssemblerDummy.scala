package com.exo.blocks

import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.item.ItemStack
import net.minecraft.world.World

class BlockAssemblerDummy(id: Int) extends Block(id, Material.air){
  this.setUnlocalizedName("exoBlockAssemblerDummy");
  this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.8F, 1.0F);

  override def onBlockActivated(world: World, x: Int, y: Int, z: Int, player: EntityPlayer, i: Int, f: Float, j: Float, k: Float): Boolean={
    if(world.getBlockTileEntity(x, y - 1, z) != null){
      val assembler: BlockAssembler = Block.blocksList(world.getBlockId(x, y - 1, z)).asInstanceOf[BlockAssembler];
      return assembler.onBlockActivated(world, x, y - 1, z, player, i, f, j, k);
    }
    
    return false;
  }
  
  override def onBlockDestroyedByPlayer(world: World, x: Int, y: Int, z: Int, meta: Int){
    world.destroyBlock(x, y - 1, z, true);
  }
  
  override def onNeighborBlockChange(world: World, x: Int, y: Int, z: Int, id: Int){
    if(world.getBlockTileEntity(x, y - 1, z) == null){
      world.setBlockToAir(x, y, z);
    }
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
}