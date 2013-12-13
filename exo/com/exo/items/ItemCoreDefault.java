package com.exo.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.exo.api.ItemCore;
import com.exo.core.TabEXO;
import com.exo.core.techtree.DefaultTechTree;

public final class ItemCoreDefault extends ItemCore{
	public ItemCoreDefault(int id){
		super(id, "Default", null, new DefaultTechTree());
		this.setUnlocalizedName("itemCoreDefault");
		this.setCreativeTab(TabEXO.tabEXO);
		this.setMaxStackSize(1);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player){
		return stack;
	}
	
	@Override
	public void registerIcons(IconRegister register){
		this.itemIcon = register.registerIcon("exo:core/coreDefaultFull");
	}
}