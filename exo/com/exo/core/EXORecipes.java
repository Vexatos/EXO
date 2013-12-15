package com.exo.core;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.exo.api.AssemblerRecipe;
import com.exo.api.AssemblerRecipeManager;
import com.exo.items.EXOItems;

import cpw.mods.fml.common.registry.GameRegistry;

public final class EXORecipes{
	public static void addRecipes(){
		GameRegistry.addRecipe(EXOItems.STACK_CRAFTING_METAL_ROD, new Object[]{
				"III",
				Character.valueOf('I'), Item.ingotIron
		});
		GameRegistry.addRecipe(EXOItems.STACK_CRAFTING_METAL_SHEET, new Object[]{
			"RRR",
			"RIR",
			"RRR",
			Character.valueOf('R'), EXOItems.STACK_CRAFTING_METAL_ROD,
			Character.valueOf('I'), Item.ingotIron
		});
		GameRegistry.addRecipe(EXOItems.STACK_COMPONENT_TOES, new Object[]{
			" S ",
			"R R",
			Character.valueOf('S'), EXOItems.STACK_CRAFTING_METAL_SHEET,
			Character.valueOf('R'), EXOItems.STACK_CRAFTING_REINFORCED_METAL_SHEET
		});
		GameRegistry.addRecipe(EXOItems.STACK_COMPONENT_SHINS, new Object[]{
			"R R",
			"S S",
			Character.valueOf('S'), EXOItems.STACK_CRAFTING_METAL_SHEET,
			Character.valueOf('R'), EXOItems.STACK_CRAFTING_REINFORCED_METAL_SHEET
		});
		GameRegistry.addRecipe(EXOItems.STACK_COMPONENT_CORE_NODE_EMPTY, new Object[]{
			"SIS",
			"SRS",
			"SIS",
			Character.valueOf('S'), EXOItems.STACK_CRAFTING_METAL_SHEET,
			Character.valueOf('R'), EXOItems.STACK_COMPONENT_RESISTOR,
			Character.valueOf('I'), EXOItems.STACK_CRAFTING_REINFORCED_METAL_SHEET
		});
		GameRegistry.addRecipe(new ItemStack(EXOItems.ITEM_SUIT_UNCHARGED_BOOTS, 1), new Object[]{
				"RCR",
				"S S",
				Character.valueOf('R'), EXOItems.STACK_CRAFTING_METAL_SHEET,
				Character.valueOf('S'), EXOItems.STACK_CRAFTING_REINFORCED_METAL_SHEET,
				Character.valueOf('C'), EXOItems.STACK_COMPONENT_CORE_CONTAINMENT
		});
		GameRegistry.addRecipe(EXOItems.STACK_CRAFTING_METAL_GEAR, new Object[]{
				" R ",
				"RIR",
				" R ",
				Character.valueOf('R'), EXOItems.STACK_CRAFTING_METAL_ROD,
				Character.valueOf('I'), Item.ingotIron
		});
		GameRegistry.addRecipe(new ItemStack(EXOItems.ITEM_SUIT_UNCHARGED_CHEST, 1), new Object[]{
			"S S",
			"JCJ",
			"RPR",
			Character.valueOf('S'), EXOItems.STACK_CRAFTING_REINFORCED_METAL_SHEET,
			Character.valueOf('J'), EXOItems.STACK_COMPONENT_JOINT,
			Character.valueOf('C'), EXOItems.STACK_COMPONENT_CORE_CONTAINMENT,
			Character.valueOf('R'), EXOItems.STACK_COMPONENT_SUPPORT_BAR,
			Character.valueOf('P'), EXOItems.STACK_COMPONENT_CHESTPLATE
		});
		GameRegistry.addRecipe(new ItemStack(EXOItems.ITEM_SUIT_UNCHARGED_HELM, 1), new Object[]{
			"RCR",
			"B B",
			Character.valueOf('R'), EXOItems.STACK_CRAFTING_REINFORCED_METAL_SHEET,
			Character.valueOf('C'), EXOItems.STACK_COMPONENT_CORE_CONTAINMENT,
			Character.valueOf('B'), EXOItems.STACK_CRAFTING_METAL_ROD
		});
		GameRegistry.addRecipe(new ItemStack(EXOItems.ITEM_SUIT_UNCHARGED_LEGS, 1), new Object[]{
			"JCJ",
			"S S",
			"R R",
			Character.valueOf('J'), EXOItems.STACK_COMPONENT_JOINT,
			Character.valueOf('C'), EXOItems.STACK_COMPONENT_CORE_CONTAINMENT,
			Character.valueOf('S'), EXOItems.STACK_CRAFTING_SUSPENSION,
			Character.valueOf('R'), EXOItems.STACK_CRAFTING_REINFORCED_METAL_SHEET
		});
		GameRegistry.addRecipe(EXOItems.STACK_CRAFTING_REINFORCED_METAL_SHEET, new Object[]{
			"SSS",
			"III",
			"SSS", 
			Character.valueOf('S'), EXOItems.STACK_CRAFTING_METAL_SHEET,
			Character.valueOf('I'), EXOItems.STACK_CRAFTING_METAL_ROD
		});
		GameRegistry.addRecipe(EXOItems.STACK_COMPONENT_JOINT, new Object[]{
			"RHR",
			Character.valueOf('R'), EXOItems.STACK_CRAFTING_METAL_ROD,
			Character.valueOf('H'), EXOItems.STACK_CRAFTING_HINGE
		});
		GameRegistry.addRecipe(EXOItems.STACK_COMPONENT_SUPPORT_BAR, new Object[]{
			"R R",
			"R R",
			"R R",
			Character.valueOf('R'), EXOItems.STACK_CRAFTING_METAL_ROD
		});
		GameRegistry.addRecipe(EXOItems.STACK_CRAFTING_RING_ROD, new Object[]{
				"RRR",
				" R ",
				" S ",
				Character.valueOf('R'), EXOItems.STACK_CRAFTING_METAL_ROD,
				Character.valueOf('S'), EXOItems.STACK_CRAFTING_METAL_SHEET
		});
		GameRegistry.addRecipe(EXOItems.STACK_CRAFTING_FUSE, new Object[]{
				"DDD",
				"CDC",
				"R R",
				Character.valueOf('D'), new ItemStack(Item.dyePowder, 1, 0),
				Character.valueOf('C'), EXOItems.STACK_CRAFTING_RING_ROD,
				Character.valueOf('R'), EXOItems.STACK_CRAFTING_METAL_ROD
		});
		GameRegistry.addRecipe(EXOItems.STACK_CRAFTING_HINGE, new Object[]{
				"SRS",
				Character.valueOf('S'), EXOItems.STACK_CRAFTING_METAL_SHEET,
				Character.valueOf('R'), EXOItems.STACK_CRAFTING_METAL_ROD
		});
		GameRegistry.addRecipe(EXOItems.STACK_CRAFTING_SUSPENSION, new Object[]{
				"RS ",
				" SR",
				"RS ",
				Character.valueOf('S'), EXOItems.STACK_CRAFTING_REINFORCED_METAL_SHEET,
				Character.valueOf('R'), EXOItems.STACK_CRAFTING_METAL_ROD
		});
	}
	
	public static void addAssemblerRecipes(){
		AssemblerRecipeManager.INSTANCE.addRecipe(new AssemblerRecipe(new ItemStack[]{
				new ItemStack(Item.enderPearl, 1), new ItemStack(Item.redstone, 1), new ItemStack(Item.enderPearl, 1),
				new ItemStack(Item.glowstone, 1), new ItemStack(Item.diamond, 1), new ItemStack(Item.glowstone),
				new ItemStack(Item.ghastTear, 1), new ItemStack(Item.enderPearl, 1), new ItemStack(Item.ghastTear, 1)
		}, EXOItems.STACK_COMPONENT_CORE_NODE_EMPTY, EXOItems.STACK_CORE_REFLEX));
	}
}