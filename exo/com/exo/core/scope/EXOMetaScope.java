package com.exo.core.scope;

import net.minecraft.item.ItemStack;

import com.exo.items.EXOItems;

public interface EXOMetaScope{
	public static final ItemStack STACK_UPGRADE_LINK_DEAD = new ItemStack(EXOItems.ITEM_UPGRADE_LINK, 1, 0);
	public static final ItemStack STACK_UPGRADE_LINK_CHARGED = new ItemStack(EXOItems.ITEM_UPGRADE_LINK, 1, 1);
	
	public static final ItemStack STACK_CORE_DEAD = new ItemStack(EXOItems.ITEM_CORE, 1, 0);
	public static final ItemStack STACK_CORE_CHARGED = new ItemStack(EXOItems.ITEM_CORE, 1, 1);
	
	public static final ItemStack STACK_CRAFTING_FUSE = new ItemStack(EXOItems.ITEM_CRAFTING, 1, 0);
	public static final ItemStack STACK_CRAFTING_HINGE = new ItemStack(EXOItems.ITEM_CRAFTING, 1, 1);
	public static final ItemStack STACK_CRAFTING_INGOT_STEEL = new ItemStack(EXOItems.ITEM_CRAFTING, 1, 2);
	public static final ItemStack STACK_CRAFTING_METAL_GEAR = new ItemStack(EXOItems.ITEM_CRAFTING, 1, 3);
	public static final ItemStack STACK_CRAFTING_METAL_ROD = new ItemStack(EXOItems.ITEM_CRAFTING, 1, 4);
	public static final ItemStack STACK_CRAFTING_METAL_SHEET = new ItemStack(EXOItems.ITEM_CRAFTING, 1, 5);
	public static final ItemStack STACK_CRAFTING_PAD_LOCK = new ItemStack(EXOItems.ITEM_CRAFTING, 1, 6);
	public static final ItemStack STACK_CRAFTING_REINFORCED_METAL_SHEET = new ItemStack(EXOItems.ITEM_CRAFTING, 1, 7);
	public static final ItemStack STACK_CRAFTING_RING_ROD = new ItemStack(EXOItems.ITEM_CRAFTING, 1, 8);
	public static final ItemStack STACK_CRAFTING_STORAGE_DRIVE = new ItemStack(EXOItems.ITEM_CRAFTING, 1, 9);
	public static final ItemStack STACK_CRAFTING_SUSPENSION = new ItemStack(EXOItems.ITEM_CRAFTING, 1, 10);
	public static final ItemStack STACK_CRAFTING_VALVE = new ItemStack(EXOItems.ITEM_CRAFTING, 1, 11);
	
	public static final ItemStack STACK_COMPONENT_CHESTPLATE = new ItemStack(EXOItems.ITEM_COMPONENT, 1, 0);
	public static final ItemStack STACK_COMPONENT_CHESTPLATE_LEFT = new ItemStack(EXOItems.ITEM_COMPONENT, 1, 1);
	public static final ItemStack STACK_COMPONENT_CHESTPLATE_RIGHT = new ItemStack(EXOItems.ITEM_COMPONENT, 1, 2);
	public static final ItemStack STACK_COMPONENT_CONCUSSION_CELL = new ItemStack(EXOItems.ITEM_COMPONENT, 1, 3);
	public static final ItemStack STACK_COMPONENT_CORE_CONTAINMENT = new ItemStack(EXOItems.ITEM_COMPONENT, 1, 4);
	public static final ItemStack STACK_COMPONENT_CORE_NODE_BERZERK = new ItemStack(EXOItems.ITEM_COMPONENT, 1, 5);
	public static final ItemStack STACK_COMPONENT_CORE_NODE_EMPTY = new ItemStack(EXOItems.ITEM_COMPONENT, 1, 6);
	public static final ItemStack STACK_COMPONENT_CORE_NODE_INFERNO = new ItemStack(EXOItems.ITEM_COMPONENT, 1, 7);
	public static final ItemStack STACK_COMPONENT_CORE_NODE_RECON = new ItemStack(EXOItems.ITEM_COMPONENT, 1, 8);
	public static final ItemStack STACK_COMPONENT_CORE_NODE_REFLEX = new ItemStack(EXOItems.ITEM_COMPONENT, 1, 9);
	public static final ItemStack STACK_COMPONENT_JOINT = new ItemStack(EXOItems.ITEM_COMPONENT, 1, 10);
	public static final ItemStack STACK_COMPONENT_POWER_CELL = new ItemStack(EXOItems.ITEM_COMPONENT, 1, 11);
	public static final ItemStack STACK_COMPONENT_RESISTOR = new ItemStack(EXOItems.ITEM_COMPONENT, 1, 12);
	public static final ItemStack STACK_COMPONENT_SHINS = new ItemStack(EXOItems.ITEM_COMPONENT, 1, 13);
	public static final ItemStack STACK_COMPONENT_SUPPORT_BAR = new ItemStack(EXOItems.ITEM_COMPONENT, 1, 14);
	public static final ItemStack STACK_COMPONENT_TOES = new ItemStack(EXOItems.ITEM_COMPONENT, 1, 15);
	
	public static final ItemStack STACK_TOOLBOX_DEFAULT = new ItemStack(EXOItems.ITEM_TOOLBOX, 1, 0);
	public static final ItemStack STACK_TOOLBOX_RED = new ItemStack(EXOItems.ITEM_TOOLBOX, 1, 1);
}