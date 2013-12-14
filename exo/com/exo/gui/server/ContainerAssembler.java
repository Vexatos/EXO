package com.exo.gui.server;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

import com.exo.api.AssemblerRecipeManager;
import com.exo.blocks.EXOBlocks;
import com.exo.gui.inventory.InventoryAssembler;
import com.exo.tile.TileAssembler;

public class ContainerAssembler extends Container{
	private TileAssembler tile;
	private InventoryAssembler craftMatrix = new InventoryAssembler(this);
	private InventoryCraftResult craftResult = new InventoryCraftResult();
	
	public ContainerAssembler(InventoryPlayer player, TileAssembler tile){
		this.tile = tile;
		int x = 0;
		int y = 0;
		
		for(x = 0; x < 3; x++){
			for(y = 0; y < 3; y++){
				this.addSlotToContainer(new Slot(this.craftMatrix, y + x * 3,  17 + y * 18, 17 +  x * 18));
			}
		}
		
		for(x = 0; x < 3; x++){
			for(y = 0; y < 9; y++){
				this.addSlotToContainer(new Slot(player, y + x * 9 + 9, 8 + y * 18, 84 + x * 18));
			}
		}
		
		for(x = 0; x < 9; x++){
			this.addSlotToContainer(new Slot(player, x, x * 18 + 8, 142));
		}
		
		this.addSlotToContainer((new Slot(craftMatrix, 9, 84, 35)));
		this.addSlotToContainer((new Slot(craftResult, 0, 142, 35)));
		
		this.onCraftMatrixChanged(this.craftMatrix);
	}
	
	@Override
	public void onCraftMatrixChanged(IInventory inventory){
		ItemStack output = AssemblerRecipeManager.INSTANCE.findMatchingRecipe(this.craftMatrix, this.tile.worldObj);
		
		if(output != null){
			this.craftResult.setInventorySlotContents(0, output);
			for(int i = 0; i < 9; i++){
				this.craftMatrix.decrStackSize(i, 1);
			}
			this.craftMatrix.setInventorySlotContents(9, null);
		}
	}
	
	 public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2){
	        ItemStack itemstack = null;
	        Slot slot = (Slot)this.inventorySlots.get(par2);

	        if (slot != null && slot.getHasStack()){
	            ItemStack itemstack1 = slot.getStack();
	            itemstack = itemstack1.copy();

	            if (par2 == 0){
	                if (!this.mergeItemStack(itemstack1, 10, 46, true)){
	                    return null;
	                }

	                slot.onSlotChange(itemstack1, itemstack);
	            }
	            else if (par2 >= 10 && par2 < 37){
	                if (!this.mergeItemStack(itemstack1, 37, 46, false)){
	                    return null;
	                }
	            }
	            else if (par2 >= 37 && par2 < 46){
	                if (!this.mergeItemStack(itemstack1, 10, 37, false)){
	                    return null;
	                }
	            }
	            else if (!this.mergeItemStack(itemstack1, 10, 46, false)){
	                return null;
	            }

	            if (itemstack1.stackSize == 0){
	                slot.putStack((ItemStack)null);
	            }
	            else{
	                slot.onSlotChanged();
	            }

	            if (itemstack1.stackSize == itemstack.stackSize){
	                return null;
	            }

	            slot.onPickupFromSlot(par1EntityPlayer, itemstack1);
	        }

	        return itemstack;
	    }
	
	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return this.tile.worldObj.getBlockId(this.tile.xCoord, this.tile.yCoord, this.tile.zCoord) != EXOBlocks.BLOCK_ASSEMBLER.blockID ? false : player.getDistanceSq((double)this.tile.xCoord+ 0.5D, (double) this.tile.yCoord + 0.5D, (double) this.tile.zCoord + 0.5D) <= 64.0D;
	}
}