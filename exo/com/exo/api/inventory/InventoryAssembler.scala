package com.exo.api.inventory

import net.minecraft.inventory.IInventory
import net.minecraft.inventory.Container
import net.minecraft.item.ItemStack
import net.minecraft.entity.player.EntityPlayer

class InventoryAssembler(container: Container) extends IInventory{
  private val width: Int = (3 * 3) + 2;
  private val stacks: Array[ItemStack] = new Array[ItemStack](this.width);
  
  def stackList(): Array[ItemStack]={
    return this.stacks;
  }
  
  def getStackInRowAndColumn(row: Int, col: Int): ItemStack={
    if((row >= 0) && (row < this.width)){
      return this.getStackInSlot(row + col * this.width);
    } else{
      return null;
    }
  }
  
  override def isItemValidForSlot(slot: Int, stack: ItemStack): Boolean={
    return true;
  }
  
  override def getSizeInventory(): Int={
    return this.stacks.length;
  }
  
  override def getStackInSlot(slot: Int): ItemStack={
    if(slot > this.getSizeInventory()){
      return null;
    } else{
      return this.stacks(slot);
    }
  }
  
  override def getInvName(): String={
    return "container.assembler";
  }
  
  override def isInvNameLocalized(): Boolean={
    return false;
  }
  
  override def getStackInSlotOnClosing(slot: Int): ItemStack={
    if(this.stacks(slot) != null){
      var stack: ItemStack = this.stacks(slot);
      this.stacks(slot) = null;
      return stack;
    } else{
      return null;
    }
  }
  
  override def decrStackSize(slot: Int, amount: Int): ItemStack={
   if(this.stacks(slot) != null){
     var stack: ItemStack = null;
     
     if(this.stacks(slot).stackSize <= amount){
       stack = this.stacks(slot);
       this.container.onCraftMatrixChanged(this);
       return stack;
     } else{
       stack = this.stacks(slot).splitStack(amount);
       
       if(this.stacks(slot).stackSize == 0){
         this.stacks(slot) = null;
       }
       
       this.container.onCraftMatrixChanged(this);
       return stack;
     }
   } else{
     return null;
   }
  }
  
  override def setInventorySlotContents(slot: Int, stack: ItemStack){
    this.stacks(slot) = stack;
    this.container.onCraftMatrixChanged(this);
  }
  
  override def getInventoryStackLimit(): Int={
    return 64;
  }
  
  override def isUseableByPlayer(player: EntityPlayer): Boolean={
    return true;
  }
  
  override def onInventoryChanged(){}
  override def openChest(){}
  override def closeChest(){}
}