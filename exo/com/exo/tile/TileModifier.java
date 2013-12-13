package com.exo.tile;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

import com.exo.api.techtree.TechTree;
import com.exo.items.EXOItems;
import com.exo.items.ItemCore;

public final class TileModifier extends TileEntity{
	private ItemStack currentCore = new ItemStack(EXOItems.ITEM_CORE, 1, 1);
	
	@Override
	public void writeToNBT(NBTTagCompound compound){
		super.writeToNBT(compound);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound){
		super.readFromNBT(compound);
	}
	
	public TechTree getCoreTree(){
		return ((ItemCore) this.currentCore.getItem()).getTechTreeFromDamage(this.currentCore.getItemDamage());
	}
}