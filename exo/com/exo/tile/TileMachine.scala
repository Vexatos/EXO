package com.exo.tile

import net.minecraft.nbt.NBTTagCompound
import net.minecraft.tileentity.TileEntity
import net.minecraftforge.common.ForgeDirection

abstract class TileMachine extends TileEntity{
  protected var ROT: ForgeDirection = ForgeDirection.WEST;
  
  def setRotation(rot: ForgeDirection){
    this.ROT = rot;
  }
  
  def getRotation(): ForgeDirection={
    return this.ROT;
  }
  
  override def writeToNBT(comp: NBTTagCompound){
    super.writeToNBT(comp);
    
    comp.setInteger("ROT", this.getRotation().ordinal());
  }
  
  override def readFromNBT(comp: NBTTagCompound){
    super.readFromNBT(comp);
    
    this.setRotation(ForgeDirection.VALID_DIRECTIONS(comp.getInteger("ROT")));
  }
}