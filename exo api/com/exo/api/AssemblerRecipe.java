package com.exo.api;

import net.minecraft.item.ItemStack;

import com.exo.gui.inventory.InventoryAssembler;

public class AssemblerRecipe{
	private final int recipeWidth;
	private final int recipeHeight;
	private final ItemStack[] items;
	private final ItemStack core;
	private final ItemStack output;
	
	public AssemblerRecipe(int width, int height, ItemStack[] items, ItemStack core, ItemStack output){
		this.recipeWidth = width;
		this.recipeHeight = height;
		this.items = items;
		this.core = core;
		this.output = output;
	}
	
	public ItemStack getRecipeOutput(){
		return this.output;
	}
	
	public boolean canBeDone(InventoryAssembler inv){
		for(int i = 0; i < 8; i++){
			if(!ItemStack.areItemStacksEqual(this.items[i], inv.getStackInSlot(i))){
				return false;
			}
		}
		
		return ItemStack.areItemStacksEqual(core, inv.getStackInSlot(9));
	}
}