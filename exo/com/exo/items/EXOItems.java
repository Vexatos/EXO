package com.exo.items;

import com.exo.core.data.EXOSessionData;
import com.exo.core.helper.EXOLocalizationHelper;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public enum EXOItems{
	INSTANCE;
	
	public static final Item ITEM_CORE_DEFAULT_FULL = new ItemCoreDefault(EXOSessionData.ITEM_CORE_DEFAULT_FULL_ID);
	public static final Item ITEM_CORE_DEFAULT_EMPTY = new ItemCore(EXOSessionData.ITEM_CORE_DEFAULT_EMPTY_ID, ITEM_CORE_DEFAULT_FULL);
	
	public void registerItems(){
		GameRegistry.registerItem(ITEM_CORE_DEFAULT_FULL, "exo:" + ITEM_CORE_DEFAULT_FULL.getUnlocalizedName());
		GameRegistry.registerItem(ITEM_CORE_DEFAULT_EMPTY, "exo:" + ITEM_CORE_DEFAULT_EMPTY.getUnlocalizedName());
	}
	
	public void addItemNames(){
		LanguageRegistry.addName(ITEM_CORE_DEFAULT_FULL, EXOLocalizationHelper.translate("item.core.default.full"));
		LanguageRegistry.addName(ITEM_CORE_DEFAULT_EMPTY, EXOLocalizationHelper.translate("item.core.default.empty"));
	}
}