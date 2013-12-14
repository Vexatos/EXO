package com.exo.render.tesr;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.exo.render.model.ModelConstructor;
import com.exo.tile.TileConstructor;

import cpw.mods.fml.client.FMLClientHandler;

public final class TESRConstructor extends TileEntitySpecialRenderer{
	private final ModelConstructor model;
	
	public TESRConstructor(){
		this.model = new ModelConstructor();
	}
	
	@Override
	public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float f) {
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation("exo", "textures/block/machine/constructor.png"));
		GL11.glPushMatrix();
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
		GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		
		float theta = 0.0F;
		
		if(((TileConstructor) tile).getRotation() != null){
			switch(((TileConstructor) tile).getRotation()){
				case NORTH:
					theta = 180.0F;
					break;
				case WEST:
					theta = 90.0F;
					break;
				case EAST:
					theta = 270.0F;
					break;
				default:
					break;
			}
		}
		
		GL11.glRotatef(theta, 0.0F, 1.0F, 0.0F);
		this.model.render();
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glPopMatrix();
	}
}