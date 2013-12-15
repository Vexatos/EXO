package com.exo.api;

import java.util.LinkedList;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.exo.gui.inventory.InventoryAssembler;
import com.exo.items.EXOItems;

public enum AssemblerRecipeManager {
	INSTANCE;
	
	private List<AssemblerRecipe> recipes = new LinkedList<AssemblerRecipe>();
	
	private AssemblerRecipeManager(){}
	
	public ItemStack findMatchingRecipe(InventoryAssembler crafting, World world){
		for(AssemblerRecipe recipe : this.recipes){
			if(recipe.canBeDone(crafting)){
				return recipe.getRecipeOutput().copy();
			}
		}
		
		return null;
	}
	
	public void addRecipe(AssemblerRecipe recipe){
		this.recipes.add(recipe);
	}
	
	public List<AssemblerRecipe> getRecipeList(){
		return this.recipes;
	}
}