package com.exo.core.scope;

import net.minecraft.item.ItemStack;

import com.exo.items.EXOItems;

public interface EXOMetaScope{
	public static final ItemStack STACK_UPGRADE_LINK_DEAD = new ItemStack(EXOItems.ITEM_UPGRADE_LINK, 1, 0);
	public static final ItemStack STACK_UPGRADE_LINK_CHARGED = new ItemStack(EXOItems.ITEM_UPGRADE_LINK, 1, 1);
}