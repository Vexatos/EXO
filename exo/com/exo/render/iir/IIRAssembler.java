package com.exo.render.iir;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import com.exo.render.model.ModelAssembler;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public final class IIRAssembler implements IItemRenderer{
	private final ModelAssembler model;
	
	public IIRAssembler(){
		this.model = new ModelAssembler();
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
			this.renderAssembler(0.0F, 0.0F, 0.0F);
		case EQUIPPED:
			this.renderAssembler(0.0F, 0.0F, 0.0F);
			return;
		case INVENTORY:
			this.renderAssembler(0.0F, 0.0F, 0.0F);
			return;
		default:
			return;
		}
	}
	
	private void renderAssembler(float x, float y, float z){
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation("exo", "/textures/blocks/machine/assembler.png"));
		GL11.glPushMatrix();
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glScalef(0.75F, 0.75F, 0.75F);
		GL11.glTranslatef(x, y + 0.65F, z);
		GL11.glRotatef(180, 1, 0, 0);
		this.model.render();
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glPopMatrix();
	}
}