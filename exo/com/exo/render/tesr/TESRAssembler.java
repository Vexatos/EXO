package com.exo.render.tesr;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.exo.render.model.ModelAssembler;

import cpw.mods.fml.client.FMLClientHandler;

public final class TESRAssembler extends TileEntitySpecialRenderer{
	private final ModelAssembler model;
	
	public TESRAssembler(){
		this.model = new ModelAssembler();
	}
	
	@Override
	public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float scale){
		GL11.glPopMatrix();
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glTranslated(x, y, z);
		GL11.glRotated(180.0, 0.0, 1.0, 0.0);
		GL11.glTranslated(0.5, -1.5, -0.5);
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation("exo", "textures/blocks/machine/assembler"));
		this.model.render();
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glPushMatrix();
	}
}