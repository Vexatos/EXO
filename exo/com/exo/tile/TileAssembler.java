package com.exo.tile;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.ForgeDirection;

public final class TileAssembler extends TileEntity{
	private ForgeDirection ROT;
	
	public void setRotation(ForgeDirection rot){
		this.ROT = rot;
	}
	
	public ForgeDirection getRotation(){
		return this.ROT;
	}
	
	@Override
	public void writeToNBT(NBTTagCompound comp){
		super.writeToNBT(comp);
		
		comp.setByte("rot", (byte) this.getRotation().ordinal());
	}
	
	@Override
	public void readFromNBT(NBTTagCompound comp){
		super.readFromNBT(comp);
		
		this.setRotation(ForgeDirection.VALID_DIRECTIONS[comp.getByte("rot")]);
	}
}