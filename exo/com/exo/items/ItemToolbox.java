package com.exo.items;

import net.minecraft.item.Item;
import net.minecraft.util.Icon;
ort net.minecraft.util.Icon;

public final class ItemToolbox extends Item{
	private Icon[] textures;
	
	public static final String[] TOOLBOX_NAMES = new String[]{
		"Default", "Red"
	};
	
	public ItemToolbox(int id){
		super(id);
		this.setUnlocalizedName("itemToolbox");
		this.setHasSubtypes(true);
		this.setCreativeTab(TabEXO.tabEXO);
	}
}