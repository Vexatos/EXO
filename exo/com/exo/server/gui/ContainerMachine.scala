package com.exo.server.gui

import net.minecraft.entity.player.InventoryPlayer
import net.minecraft.inventory.Container
import net.minecraft.inventory.Slot

abstract class ContainerMachine extends Container{
  protected def bindPlayerInventory(playerInv: InventoryPlayer){
    for(i <- 0 to 3){
      for(j <- 0 to 9){
        this.addSlotToContainer(new Slot(playerInv, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
      }
    }
    
    for(i <- 0 to 9){
      this.addSlotToContainer(new Slot(playerInv, i, 8 + i * 18, 142));
    }
  }
}