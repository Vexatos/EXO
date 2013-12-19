package com.exo.lib.helper

import net.minecraftforge.common.ForgeDirection

object RotationHelper{
  def getTheta(dir: ForgeDirection): Float={
    return dir match
    {
      case ForgeDirection.NORTH=>180.0F;
      case ForgeDirection.WEST=>90.0F;
      case ForgeDirection.EAST=>270.0F;
      case _=>0.0F;
    }
  }
}