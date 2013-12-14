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
	
	private AssemblerRecipeManager(){
		this.addRecipe(new AssemblerRecipe(3, 3, new ItemStack[]{
				new ItemStack(Item.diamond), new ItemStack(Item.diamond), new ItemStack(Item.diamond),
				new ItemStack(Item.diamond), new ItemStack(Item.diamond), new ItemStack(Item.diamond),
				new ItemStack(Item.diamond), new ItemStack(Item.diamond), new ItemStack(Item.diamond)
		}, new ItemStack(EXOItems.ITEM_CORE, 1, 0), new ItemStack(EXOItems.ITEM_CORE, 1, 1)));
	}
	
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