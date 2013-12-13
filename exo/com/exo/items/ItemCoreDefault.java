package com.exo.items;

import com.exo.core.TabEXO;

import net.minecraft.item.Item;

public final class ItemCoreDefault extends Item{
	public ItemCoreDefault(int id){
		super(id);
		this.setUnlocalizedName("itemCoreDefault");
		this.setCreativeTab(TabEXO.tabEXO);
		this.setMaxStackSize(1);
	}
}