package com.exo.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.exo.api.techtree.TechTree;
import com.exo.api.techtree.TechTreeNode;
import com.exo.core.techtree.DefaultTechTree;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public final class GuiUpgrader extends GuiScreen{
	private final int mapTop = 100;
	private final int mapLeft = 100;
	private final int mapBottom = 100;
	private final int mapRight = 100;
	
	private int mouseX;
	private int mouseY;
	
	private final TechTree tree = new DefaultTechTree();
	
	public GuiUpgrader(){
		
	}
	
	protected void keyTyped(char c, int val){
		if(val == this.mc.gameSettings.keyBindInventory.keyCode){
			this.mc.displayGuiScreen(null);
			this.mc.setIngameFocus();
		} else{
			super.keyTyped(c, val);
		}
	}
	
	private void drawTitle(){
		this.fontRenderer.drawString("Tech Tree", 100, 100, 0xFF0000);
	}
	
	public void drawScreen(int l, int k, float f){
		this.drawDefaultBackground();
		this.genBackground(l, k, f);
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glDisable(GL11.GL_DEPTH_TEST);
		this.drawTitle();
	}
	
	private void genBackground(int l, int k, float f){
		int x;
		int y;
		int parentX;
		int parentY;
		
		for(int i = 0; i < this.tree.getNodes().size(); i++){
			TechTreeNode node = this.tree.getNodes().get(i);
			
			x = node.getX();
			y = node.getY();
			parentX = node.getNext().getX();
			parentY = node.getNext().getY();
			
			this.mc.renderEngine.bindTexture(new ResourceLocation("exo:textures/node.png"));
			this.drawTexturedModalRect(x, y, 0, 0, 100, 100);
		}
	}
	
	@Override
	public boolean doesGuiPauseGame(){
		return true;
	}
}