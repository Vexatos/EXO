package com.exo.blocks

import com.exo.lib.EXOTab
import net.minecraft.block.BlockContainer
import net.minecraft.block.material.Material
import net.minecraft.item.ItemStack
import net.minecraft.entity.EntityLivingBase
import net.minecraft.world.World
import net.minecraft.tileentity.TileEntity
import com.exo.tile.TileConstructor
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.util.ChatMessageComponent
import net.minecraft.client.renderer.texture.IconRegister
import net.minecraft.util.Icon

class BlockConstructor(id: Int) extends BlockContainer(id, Material.iron){
  this.setUnlocalizedName("exoBlockConstructor");
  this.setCreativeTab(EXOTab.tabCrafting);
  this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.4F, 1.0F);
  
  override def onBlockPlacedBy(world: World, x: Int, y: Int, z: Int, living: EntityLivingBase, stack: ItemStack){
    world.setBlock(x, y + 1, z, Blocks.BLOCK_CONSTRUCTOR_DUMMY.blockID);
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
    return new TileConstructor();
  }
}