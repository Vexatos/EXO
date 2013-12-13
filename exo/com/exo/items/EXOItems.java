package com.exo.items;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public enum EXOItems{
	INSTANCE;
	
	public static final Item ITEM_CORE_DEFAULT_FULL = new ItemCoreDefault(5000);
	public static final Item ITEM_CORE_DEFAULT_EMPTY = new ItemCore(5001, ITEM_CORE_DEFAULT_FULL);
	
	public void registerItems(){
		GameRegistry.registerItem(ITEM_CORE_DEFAULT_FULL, "exo:" + ITEM_CORE_DEFAULT_FULL);
		GameRegistry.registerItem(ITEM_CORE_DEFAULT_EMPTY, "exo:" + ITEM_CORE_DEFAULT_EMPTY);
	}
	
	public void addItemNames(){
		LanguageRegistry.addName(ITEM_CORE_DEFAULT_FULL, "Exoskeleton Core (Full)");
		LanguageRegistry.addName(ITEM_CORE_DEFAULT_EMPTY, "Exoskeleton Core (Empty");
	}
}