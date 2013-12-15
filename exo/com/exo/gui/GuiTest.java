package com.exo.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.item.ItemStack;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.exo.api.techtree.TechTreeNode;
import com.exo.items.EXOItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiTest extends GuiScreen{
	private int paneWidth = 312;
	private int paneHeight = 104;
	
	private int mouseX;
	private int mouseY;
	
	// private TechTree tree = new DefaultTechTree();
	
	@Override
	public void keyTyped(char c, int code){
		if(code == this.mc.gameSettings.keyBindInventory.keyCode){
			this.mc.displayGuiScreen(null);
			this.mc.setIngameFocus();
		} else{
			super.keyTyped(c, code);
		}
	}
	
	@Override
	public void drawScreen(int i, int j, float f){
		this.drawDefaultBackground();
		this.drawTree(i, j, f);
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glDisable(GL11.GL_DEPTH_TEST);
		this.drawTitle();
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glEnable(GL11.GL_DEPTH_TEST);
	}
	
	private void drawTitle(){
		int x = (this.width - this.paneWidth) / 2;
		int y = (this.height - this.paneHeight) / 2;
		// this.fontRenderer.drawString("Tech Tree: " + this.tree.getName(), x + 15, y + 5, 0xFF0000);
	}
	
	private void drawTree(int i, int j, float f){
		GL11.glDepthFunc(GL11.GL_GEQUAL);
		GL11.glPushMatrix();
		
		RenderItem render = new RenderItem();
		RenderHelper.enableGUIStandardItemLighting();
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glEnable(GL12.GL_RESCALE_NORMAL);
		GL11.glEnable(GL11.GL_COLOR_MATERIAL);
		int x;
		int y;
		int meta = 0;
		
		/*
		for(TechTreeNode node : this.tree.getNodes()){
			x = node.getPosition().getX();
			y = node.getPosition().getY();
			
			GL11.glColor4f(0.3F, 0.3F, 0.03F, 1.0F);
			
			GL11.glEnable(GL11.GL_LIGHTING);
			GL11.glEnable(GL11.GL_CULL_FACE);
			
			if(node.isUnlocked()){
				meta = 1;
			}
			
			render.renderItemIntoGUI(this.fontRenderer, this.mc.getTextureManager(), new ItemStack(EXOItems.ITEM_UPGRADE_LINK, 1, meta), x, y);
			
			GL11.glDisable(GL11.GL_LIGHTING);
		}*/
		
		GL11.glPopMatrix();
		GL11.glDepthFunc(GL11.GL_LEQUAL);
		GL11.glEnable(GL11.GL_DEPTH_TEST);
		GL11.glEnable(GL11.GL_LIGHTING);
		RenderHelper.disableStandardItemLighting();
	}
}