package com.exo.render.tesr;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.exo.render.model.ModelConstructor;

import cpw.mods.fml.client.FMLClientHandler;

public final class TESRConstructor extends TileEntitySpecialRenderer{
	private final ModelConstructor model;
	
	public TESRConstructor(){
		this.model = new ModelConstructor();
	}
	
	@Override
	public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float f) {
		GL11.glPushMatrix();
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glTranslated(x + 0.5, y, z + 0.5);
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation("exo", "textures/blocks/machine/constructor.png"));
		this.model.render();
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glPushMatrix();
	}
}