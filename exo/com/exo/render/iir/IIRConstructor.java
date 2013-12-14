package com.exo.render.iir;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import com.exo.render.model.ModelConstructor;

import cpw.mods.fml.client.FMLClientHandler;

public final class IIRConstructor implements IItemRenderer{
	private final ModelConstructor model;
	
	public IIRConstructor(){
		this.model = new ModelConstructor();
	}
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		switch(type)
		{
			case ENTITY:
				this.renderConstructor(0.0F, 0.0F, 0.0F, 1.0F);
				return;
			case EQUIPPED:
				this.renderConstructor(0.0F, 0.0F, 0.0F, 1.0F);
				return;
			case INVENTORY:
				this.renderConstructor(0.0F, 0.0F, 0.0F, 0.825F);
				return;
			default:
				return;
		}
	}
	
	private void renderConstructor(float x, float y, float z, float scale){
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation("exo", "textures/blocks/machine/assembler.png"));
		GL11.glPushMatrix();
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glScalef(scale, scale, scale);
		GL11.glTranslatef(x, y + 0.70F, z);
		GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		this.model.render();
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glPopMatrix();
	}
}