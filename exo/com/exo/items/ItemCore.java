package com.exo.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.exo.core.TabEXO;

public class ItemCore extends Item{
	private final Item fullCore;
	
	public ItemCore(int id, Item fullCore){
		super(id);
		this.fullCore = fullCore;
		this.setUnlocalizedName("itemCore");
		this.setCreativeTab(TabEXO.tabEXO);
		this.setMaxStackSize(1);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player){
		return super.onItemRightClick(stack, world, player);
	}
}