package com.exo.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.exo.api.EnumEXOCoreType;
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
	public static final Item ITEM_CORE = new ItemCore(EXOSessionData.ITEM_CORE_ID, EnumEXOCoreType.BERZERK);
	public static final Item ITEM_CRAFTING = new ItemCrafting(EXOSessionData.ITEM_CRAFTING_ID);
	public static final Item ITEM_COMPONENT = new ItemComponent(EXOSessionData.ITEM_COMPONENT_ID);
	public static final Item ITEM_TOOLBOX = new ItemToolbox(EXOSessionData.ITEM_TOOLBOX_ID);
	
	public void registerItems(){
		GameRegistry.registerItem(ITEM_SUIT_UNCHARGED_HELM, "exo: " + ITEM_SUIT_UNCHARGED_HELM.getUnlocalizedName());
		GameRegistry.registerItem(ITEM_SUIT_UNCHARGED_CHEST, "exo:" + ITEM_SUIT_UNCHARGED_CHEST.getUnlocalizedName());
		GameRegistry.registerItem(ITEM_SUIT_UNCHARGED_LEGS, "exo:" + ITEM_SUIT_UNCHARGED_LEGS.getUnlocalizedName());
		GameRegistry.registerItem(ITEM_SUIT_UNCHARGED_BOOTS, "exo:" + ITEM_SUIT_UNCHARGED_BOOTS.getUnlocalizedName());
		GameRegistry.registerItem(ITEM_UPGRADE_LINK, "exo:" + ITEM_UPGRADE_LINK.getUnlocalizedName());
		GameRegistry.registerItem(ITEM_CORE, "exo:" + ITEM_CORE.getUnlocalizedName());
		GameRegistry.registerItem(ITEM_CRAFTING, "exo:" + ITEM_CRAFTING.getUnlocalizedName());
		GameRegistry.registerItem(ITEM_COMPONENT, "exo:" + ITEM_COMPONENT.getUnlocalizedName());
		GameRegistry.registerItem(ITEM_TOOLBOX, "exo:" + ITEM_TOOLBOX.getUnlocalizedName());
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
	
		LanguageRegistry.addName(STACK_CRAFTING_FUSE, EXOLocalizationHelper.translate("item.crafting.fuse.name"));
		LanguageRegistry.addName(STACK_CRAFTING_HINGE, EXOLocalizationHelper.translate("item.crafting.hinge.name"));
		LanguageRegistry.addName(STACK_CRAFTING_INGOT_STEEL, EXOLocalizationHelper.translate("item.crafting.ingot.name"));
		LanguageRegistry.addName(STACK_CRAFTING_METAL_GEAR, EXOLocalizationHelper.translate("item.crafting.metalGear.name"));
		LanguageRegistry.addName(STACK_CRAFTING_METAL_ROD, EXOLocalizationHelper.translate("item.crafting.metalRod.name"));
		LanguageRegistry.addName(STACK_CRAFTING_METAL_SHEET, EXOLocalizationHelper.translate("item.crafting.metalSheet.name"));
		LanguageRegistry.addName(STACK_CRAFTING_PAD_LOCK, EXOLocalizationHelper.translate("item.crafting.padLock.name"));
		LanguageRegistry.addName(STACK_CRAFTING_REINFORCED_METAL_SHEET, EXOLocalizationHelper.translate("item.crafting.reinforcedMetalSheet.name"));
		LanguageRegistry.addName(STACK_CRAFTING_RING_ROD, EXOLocalizationHelper.translate("item.crafting.ringRod.name"));
		LanguageRegistry.addName(STACK_CRAFTING_STORAGE_DRIVE, EXOLocalizationHelper.translate("item.crafting.storageDrive.name"));
		LanguageRegistry.addName(STACK_CRAFTING_SUSPENSION, EXOLocalizationHelper.translate("item.crafting.suspension.name"));
		LanguageRegistry.addName(STACK_CRAFTING_VALVE, EXOLocalizationHelper.translate("item.crafting.valve.name"));
		
		LanguageRegistry.addName(STACK_COMPONENT_CHESTPLATE, EXOLocalizationHelper.translate("item.comp.chest.name"));
		LanguageRegistry.addName(STACK_COMPONENT_CHESTPLATE_LEFT, EXOLocalizationHelper.translate("item.comp.chest.left.name"));
		LanguageRegistry.addName(STACK_COMPONENT_CHESTPLATE_RIGHT, EXOLocalizationHelper.translate("item.comp.chest.right.name"));
		LanguageRegistry.addName(STACK_COMPONENT_CONCUSSION_CELL, EXOLocalizationHelper.translate("item.comp.concussionCell.name"));
		LanguageRegistry.addName(STACK_COMPONENT_CORE_CONTAINMENT, EXOLocalizationHelper.translate("item.comp.core.containment.name"));
		LanguageRegistry.addName(STACK_COMPONENT_CORE_NODE_BERZERK, EXOLocalizationHelper.translate("item.comp.core.node.berzerk.name"));
		LanguageRegistry.addName(STACK_COMPONENT_CORE_NODE_EMPTY, EXOLocalizationHelper.translate("item.comp.core.node.empty.name"));
		LanguageRegistry.addName(STACK_COMPONENT_CORE_NODE_INFERNO, EXOLocalizationHelper.translate("item.comp.core.node.inferno.name"));
		LanguageRegistry.addName(STACK_COMPONENT_CORE_NODE_RECON, EXOLocalizationHelper.translate("item.comp.core.node.recon.name"));
		LanguageRegistry.addName(STACK_COMPONENT_CORE_NODE_REFLEX, EXOLocalizationHelper.translate("item.comp.core.node.reflex.name"));
		LanguageRegistry.addName(STACK_COMPONENT_JOINT, EXOLocalizationHelper.translate("item.comp.joint.name"));
		LanguageRegistry.addName(STACK_COMPONENT_POWER_CELL, EXOLocalizationHelper.translate("item.comp.powerCell.name"));
		LanguageRegistry.addName(STACK_COMPONENT_RESISTOR, EXOLocalizationHelper.translate("item.comp.resistor.name"));
		LanguageRegistry.addName(STACK_COMPONENT_SHINS, EXOLocalizationHelper.translate("item.comp.shins.name"));
		LanguageRegistry.addName(STACK_COMPONENT_SUPPORT_BAR, EXOLocalizationHelper.translate("item.comp.supportBar.name"));
		LanguageRegistry.addName(STACK_COMPONENT_TOES, EXOLocalizationHelper.translate("item.comp.toes.name"));
		
		LanguageRegistry.addName(STACK_TOOLBOX_DEFAULT, EXOLocalizationHelper.translate("item.toolbox.default.name"));
		LanguageRegistry.addName(STACK_TOOLBOX_RED, EXOLocalizationHelper.translate("item.toolbox.red.name"));
	}
}