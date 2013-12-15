package com.exo.items;


import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

import com.exo.core.TabEXO;

public final class ItemCrafting extends Item{
	private Icon[] textures;
	
	public static final String[] CRAFTING_NAMES = new String[]{
		"Fuse", "Hinge", "IngotEXO",
		"MetalGear", "MetalRod", "MetalSheet",
		"PadLock", "ReinforcedMetalSheet", "RingRod",
		"StorageDrive", "Suspension", "Valve"
	};
	
	public ItemCrafting(int id){
		super(id);
		this.setUnlocalizedName("itemCrafting");
		this.setHasSubtypes(true);
		this.setCreativeTab(TabEXO.tabEXO);
	}
	
	@Override
	public Icon getIconFromDamage(int damage){
		return this.textures[damage];
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack){
		return "itemCrafting" +  ItemCrafting.CRAFTING_NAMES[stack.getItemDamage()];
	}
	
	@Override
	public void getSubItems(int id, CreativeTabs tab, List list){
		for(int i = 0; i < ItemCrafting.CRAFTING_NAMES.length; i++){
			list.add(new ItemStack(id, 1, i));
		}
	}
	
	@Override
	public void registerIcons(IconRegister register){
		this.textures = new Icon[]{
				register.registerIcon("exo:crafting/fuse"), register.registerIcon("exo:crafting/hinge"), register.registerIcon("exo:crafting/ingotEXO"),
				register.registerIcon("exo:crafting/metalGear"), register.registerIcon("exo:crafting/metalRod"), register.registerIcon("exo:crafting/metalSheet"),
				register.registerIcon("exo:crafting/padLock"), register.registerIcon("exo:crafting/reenforcedMetalSheet"), register.registerIcon("exo:crafting/ringRod"),
				register.registerIcon("exo:crafting/storageDrive"), register.registerIcon("exo:crafting/suspension"), register.registerIcon("exo:crafting/valve")
		};
	}
}