package com.exo.gui;

import net.minecraft.client.gui.GuiScreen;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.exo.api.techtree.TechTree;
import com.exo.api.techtree.TechTreeNode;
import com.exo.core.techtree.DefaultTechTree;

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
		this.fontRenderer.drawString("Tech Tree", 100, 100, 0x000000);
	}
	
	public void drawScreen(int l, int k, float f){
		this.drawDefaultBackground();
		this.genBackground(l, k, f);
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glDisable(GL11.GL_DEPTH_TEST);
		this.drawTitle();
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glEnable(GL11.GL_DEPTH_TEST);
	}
	
	private void genBackground(int l, int k, float f){
		GL11.glDepthFunc(GL11.GL_GEQUAL);
		GL11.glPushMatrix();
		GL11.glTranslatef(0.0F, 0.0F, -200.0F);
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glEnable(GL12.GL_RESCALE_NORMAL);
		GL11.glEnable(GL11.GL_COLOR_MATERIAL);
		GL11.glEnable(GL11.GL_DEPTH_TEST);
		GL11.glDepthFunc(GL11.GL_LEQUAL);
		
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
			
			this.drawHorizontalLine(x, parentX, y, -16777216);
			this.drawVerticalLine(parentX, y, parentY, -16777216);
		}
		
		GL11.glEnable(GL11.GL_DEPTH_TEST);
		GL11.glEnable(GL11.GL_LIGHTING);
	}
	
	@Override
	public boolean doesGuiPauseGame(){
		return true;
	}
}