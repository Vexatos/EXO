package com.exo.items;

import net.minecraft.item.Item;

import com.exo.api.ItemCore;
import com.exo.core.data.EXOSessionData;
import com.exo.core.helper.EXOLocalizationHelper;
import com.exo.core.techtree.DefaultTechTree;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public enum EXOItems{
	INSTANCE;
	
	public static final Item ITEM_CORE_DEFAULT_FULL = new ItemCoreDefault(EXOSessionData.ITEM_CORE_DEFAULT_FULL_ID);
	public static final Item ITEM_CORE_DEFAULT_EMPTY = new ItemCore(EXOSessionData.ITEM_CORE_DEFAULT_EMPTY_ID, null, ITEM_CORE_DEFAULT_FULL, null);
	public static final Item ITEM_SUIT_UNCHARGED_HELM = new ItemEXOArmourHelmet(EXOSessionData.ITEM_SUIT_UNCHARGED_HELM_ID);
	public static final Item ITEM_SUIT_UNCHARGED_CHEST = new ItemEXOArmourChest(EXOSessionData.ITEM_SUIT_UNCHARGED_CHEST_ID);
	public static final Item ITEM_SUIT_UNCHARGED_LEGS = new ItemEXOArmourLegs(EXOSessionData.ITEM_SUIT_UNCHARGED_LEGS_ID);
	public static final Item ITEM_SUIT_UNCHARGED_BOOTS = new ItemEXOArmourBoots(EXOSessionData.ITEM_SUIT_UNCHARGED_BOOTS_ID);
	
	public void registerItems(){
		GameRegistry.registerItem(ITEM_CORE_DEFAULT_FULL, "exo:" + ITEM_CORE_DEFAULT_FULL.getUnlocalizedName());
		GameRegistry.registerItem(ITEM_CORE_DEFAULT_EMPTY, "exo:" + ITEM_CORE_DEFAULT_EMPTY.getUnlocalizedName());
		GameRegistry.registerItem(ITEM_SUIT_UNCHARGED_HELM, "exo:" + ITEM_SUIT_UNCHARGED_HELM.getUnlocalizedName());
		GameRegistry.registerItem(ITEM_SUIT_UNCHARGED_CHEST, "exo:" + ITEM_SUIT_UNCHARGED_CHEST.getUnlocalizedName());
		GameRegistry.registerItem(ITEM_SUIT_UNCHARGED_LEGS, "exo:" + ITEM_SUIT_UNCHARGED_LEGS.getUnlocalizedName());
		GameRegistry.registerItem(ITEM_SUIT_UNCHARGED_BOOTS, "exo:" + ITEM_SUIT_UNCHARGED_BOOTS.getUnlocalizedName());
	}
	
	public void addItemNames(){
		LanguageRegistry.addName(ITEM_CORE_DEFAULT_FULL, EXOLocalizationHelper.translate("item.core.default.full"));
		LanguageRegistry.addName(ITEM_CORE_DEFAULT_EMPTY, EXOLocalizationHelper.translate("item.core.default.empty"));
		LanguageRegistry.addName(ITEM_SUIT_UNCHARGED_HELM, EXOLocalizationHelper.translate("item.exosuit.helm.name"));
		LanguageRegistry.addName(ITEM_SUIT_UNCHARGED_CHEST, EXOLocalizationHelper.translate("item.exosuit.chest.name"));
		LanguageRegistry.addName(ITEM_SUIT_UNCHARGED_LEGS, EXOLocalizationHelper.translate("item.exosuit.legs.name"));
		LanguageRegistry.addName(ITEM_SUIT_UNCHARGED_BOOTS, EXOLocalizationHelper.translate("item.exosuit.boots.name"));
	}
}