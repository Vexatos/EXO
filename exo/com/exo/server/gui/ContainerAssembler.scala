package com.exo.server.gui

import com.exo.tile.TileAssembler
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.entity.player.InventoryPlayer
import com.exo.api.inventory.InventoryAssembler
import net.minecraft.inventory.IInventory
import com.exo.blocks.Blocks
import net.minecraft.inventory.InventoryCraftResult
import net.minecraft.inventory.Slot

class ContainerAssembler(playerInv: InventoryPlayer, tile: TileAssembler) extends ContainerMachine{
  private val craftMatrix: InventoryAssembler = new InventoryAssembler(this);
  private val craftResult: InventoryCraftResult = new InventoryCraftResult();
  
  this.bindPlayerInventory(playerInv);
  this.createCraftingMatrix();
  this.onCraftMatrixChanged(this.craftMatrix);
  
  override def onCraftMatrixChanged(inventory: IInventory){
    
  }
  
  override def canInteractWith(player: EntityPlayer): Boolean={
    return true;
  }
  
  private def createCraftingMatrix(){
    for(row <- 0 to 3){
      for(col <- 0 to 3){
        this.addSlotToContainer(new Slot(this.craftMatrix, col + row * 3, 17 + col * 18, 17 + row * 18));
      }
    }
    
    this.addSlotToContainer(new Slot(this.craftMatrix, 9, 84, 35));
    this.addSlotToContainer(new Slot(this.craftResult, 0, 142, 35));
  }
}