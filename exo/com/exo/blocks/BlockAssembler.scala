package com.exo.blocks

import com.exo.lib.EXOTab
import com.exo.tile.TileAssembler

import net.minecraft.block.BlockContainer
import net.minecraft.block.material.Material
import net.minecraft.client.renderer.texture.IconRegister
import net.minecraft.entity.EntityLivingBase
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.item.ItemStack
import net.minecraft.tileentity.TileEntity
import net.minecraft.util.ChatMessageComponent
import net.minecraft.util.Icon
import net.minecraft.world.World

class BlockAssembler(id: Int) extends BlockContainer(id, Material.iron){
  this.setUnlocalizedName("exoBlockAssembler");
  this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.8F, 1.0F);
  this.setCreativeTab(EXOTab.tabCrafting);
  
  override def onBlockPlacedBy(world: World, x: Int, y: Int, z: Int, living: EntityLivingBase, stac: ItemStack){
    world.setBlock(x, y + 1, z, Blocks.BLOCK_ASSEMBLER_DUMMY.blockID);
  }
  
  override def onBlockActivated(world: World, x: Int, y: Int, z: Int, player: EntityPlayer, i: Int, f: Float, j: Float, k: Float): Boolean={
    player.sendChatToPlayer(ChatMessageComponent.createFromText("Hello World"));
    return true;
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