package com.exo.gui.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

import com.exo.items.ItemCore;

public final class InventoryAssembler implements IInventory{
	private ItemStack[] stackList;
	private int width;
	
	private Container container;
	
	public InventoryAssembler(Container container){
		this.container = container;
		this.width =  (3 * 3) + 2;
		this.stackList = new ItemStack[(3 * 3) + 2];
	}
	
	public ItemStack[] stackList(){
		return this.stackList;
	}
	
	@Override
	public int getSizeInventory(){
		return this.stackList.length;
	}
	
	@Override
	public ItemStack getStackInSlot(int slot){
		return slot >= this.getSizeInventory() ? null : this.stackList[slot];
	}
	
	public ItemStack getStackInRowAndColumn(int x, int y){
		if(x >= 0 && x < this.width){
			return this.getStackInSlot(x + y * this.width);
		} else{
			return null;
		}
	}
	
	@Override
	public String getInvName(){
		return "container.assembler";
	}
	
	@Override
	public boolean isInvNameLocalized(){
		return false;
	}
	
	@Override
	public ItemStack getStackInSlotOnClosing(int slot){
		if(this.stackList[slot] != null){
			ItemStack stack = this.stackList[slot];
			this.stackList[slot] = null;
			return stack;
		} else{
			return null;
		}
	}
	
	@Override
	public ItemStack decrStackSize(int slot, int amount){
		if(this.stackList[slot] != null){
			ItemStack stack;
			
			if(this.stackList[slot].stackSize <= amount){
				stack = this.stackList[slot];
				this.stackList[slot] = null;
				this.container.onCraftMatrixChanged(this);
				return stack;
			} else{
				stack = this.stackList[slot].splitStack(amount);
				
				if(this.stackList[slot].stackSize == 0){
					this.stackList[slot] = null;
				}
				
				this.container.onCraftMatrixChanged(this);
				return stack;
			}
		} else{
			return null;
		}
	}
	
	@Override
	public void setInventorySlotContents(int slot, ItemStack stack){
		this.stackList[slot] = stack;
		this.container.onCraftMatrixChanged(this);
	}
	
	@Override
	public int getInventoryStackLimit(){
		return 64;
	}
	
	@Override public void onInventoryChanged(){}
	@Override public void openChest(){}
	@Override public void closeChest(){}
	
	@Override
	public boolean isUseableByPlayer(EntityPlayer player){
		return true;
	}
	
	@Override
	public boolean isItemValidForSlot(int slot, ItemStack stack){
		return slot == 10 ? stack.getItem() instanceof ItemCore ? true : false : true;
	}
}