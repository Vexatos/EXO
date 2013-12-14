package com.exo.core.helper;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;

public class RotationHelper{
	public static ForgeDirection determine3DRotation(World world, int x, int y, int z, EntityLivingBase living){
		return ForgeDirection.getOrientation(RotationHelper.compute3DRot(world, x, y, z, living));
	}
	
	private static int compute3DRot(World world, int x, int y, int z, EntityLivingBase living){
		if(MathHelper.abs((float) living.posX - x) < 2.0F && MathHelper.abs((float) living.posZ - z) < 2.0F){
			double theta = living.posY - 1.82D - living.yOffset;
			
			if(theta - y > 2.0D){
				return 1;
			}
			
			if(y - theta > 0.0D){
				return 0;
			}
		}
		
		int id = MathHelper.floor_double(living.rotationYaw * 4.0F / 360.0F + 0.5D) & 3;
		return id == 0 ? 2 :
			(id == 1 ? 5 :
			(id == 2 ? 3 :
			(id == 3 ? 4 : 0)));
	}
}