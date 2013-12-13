package com.exo.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.exo.core.data.EXOSessionData;
import com.exo.core.helper.EXOLocalizationHelper;
import com.exo.core.scope.EXOMetaScope;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public enum EXOItems implements EXOMetaScope{
	INSTANCE;
	
	public static final Item ITEM_SUIT_UNCHARGED_HELM = new ItemEXOArmourHelmet(EXOSessionData.ITEM_SUIT_UNCHARGED_HELM_ID);
	public static final Item ITEM_SUIT_UNCHARGED_CHEST = new ItemEXOArmourChest(EXOSessionData.ITEM_SUIT_UNCHARGED_CHEST_ID);
	public static final Item ITEM_SUIT_UNCHARGED_LEGS = new ItemEXOArmourLegs(EXOSessionData.ITEM_SUIT_UNCHARGED_LEGS_ID);
	public static final Item ITEM_SUIT_UNCHARGED_BOOTS = new ItemEXOArmourBoots(EXOSessionData.ITEM_SUIT_UNCHARGED_BOOTS_ID);
	public static final Item ITEM_UPGRADE_LINK = new ItemUpgradeLink(EXOSessionData.ITEM_UPGRADELINK_ID);
	public static final Item ITEM_CORE = new ItemCore(EXOSessionData.ITEM_CORE_ID);
	
	public void registerItems(){
		GameRegistry.registerItem(ITEM_SUIT_UNCHARGED_HELM, "exo:" + ITEM_SUIT_UNCHARGED_HELM.getUnlocalizedName());
		GameRegistry.registerItem(ITEM_SUIT_UNCHARGED_CHEST, "exo:" + ITEM_SUIT_UNCHARGED_CHEST.getUnlocalizedName());
		GameRegistry.registerItem(ITEM_SUIT_UNCHARGED_LEGS, "exo:" + ITEM_SUIT_UNCHARGED_LEGS.getUnlocalizedName());
		GameRegistry.registerItem(ITEM_SUIT_UNCHARGED_BOOTS, "exo:" + ITEM_SUIT_UNCHARGED_BOOTS.getUnlocalizedName());
		GameRegistry.registerItem(ITEM_UPGRADE_LINK, "exo:" + ITEM_UPGRADE_LINK.getUnlocalizedName());
		GameRegistry.registerItem(ITEM_CORE, "exo:" + ITEM_CORE.getUnlocalizedName());
	}
	
	public void addItemNames(){
		LanguageRegistry.addName(ITEM_SUIT_UNCHARGED_HELM, EXOLocalizationHelper.translate("item.exosuit.helm.name"));
		LanguageRegistry.addName(ITEM_SUIT_UNCHARGED_CHEST, EXOLocalizationHelper.translate("item.exosuit.chest.name"));
		LanguageRegistry.addName(ITEM_SUIT_UNCHARGED_LEGS, EXOLocalizationHelper.translate("item.exosuit.legs.name"));
		LanguageRegistry.addName(ITEM_SUIT_UNCHARGED_BOOTS, EXOLocalizationHelper.translate("item.exosuit.boots.name"));
		LanguageRegistry.addName(STACK_UPGRADE_LINK_DEAD, EXOLocalizationHelper.translate("item.upgradelink.dead.name"));
		LanguageRegistry.addName(STACK_UPGRADE_LINK_CHARGED, EXOLocalizationHelper.translate("item.upgradelink.charged.name"));
		LanguageRegistry.addName(STACK_CORE_DEAD, EXOLocalizationHelper.translate("item.core.dead.name"));
		LanguageRegistry.addName(STACK_CORE_CHARGED, EXOLocalizationHelper.translate("item.core.charged.name"));
	}
}