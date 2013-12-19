package com.exo.api

import java.util.LinkedList
import java.util.List

import net.minecraft.item.ItemStack

object AssemblerRecipes{
  class AssemblerRecipe(items: Array[ItemStack], cat: ItemStack, output: ItemStack){
    def getRecipeOutput(): ItemStack={
      return this.output;
    }
  }
  
  private val ASSEMBLER_RECIPES: List[AssemblerRecipe] = new LinkedList[AssemblerRecipe]();
  
  def addRecipe(recipe: AssemblerRecipe){
    this.ASSEMBLER_RECIPES.add(recipe);
  }
  
  def getRecipes(): List[AssemblerRecipe]={
    return this.ASSEMBLER_RECIPES;
  }
}