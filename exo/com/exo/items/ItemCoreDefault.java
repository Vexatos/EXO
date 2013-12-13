package com.exo.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.exo.core.TabEXO;

public final class ItemCoreDefault extends Item{
	public ItemCoreDefault(int id){
		super(id);
		this.setUnlocalizedName("itemCoreDefault");
		this.setCreativeTab(TabEXO.tabEXO);
		this.setMaxStackSize(1);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player){
		
		
		return super.onItemRightClick(stack, world, player);
	}
}