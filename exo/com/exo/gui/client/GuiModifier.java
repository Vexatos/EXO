package com.exo.gui.client;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.exo.api.techtree.TechTree;
import com.exo.api.techtree.TechTreeNode;
import com.exo.core.techtree.TechTreeReflex;
import com.exo.gui.server.ContainerModifier;
import com.exo.items.EXOItems;
import com.exo.tile.TileConstructor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiModifier extends GuiContainer{
	private final TechTree tree = new TechTreeReflex();
	private final TileConstructor tile;
	
	public GuiModifier(InventoryPlayer player, TileConstructor tile){
		super(new ContainerModifier(player, tile));
		this.tile = tile;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(this.tree.getBackground());
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(k, l, 0, 0, this.xSize + 7, this.ySize + 10);
		this.drawTechTree(k, l);
	}
	
	@Override
	public void mouseClicked(int x, int y, int id){
		System.out.println(String.format("(%s, %s, %s)", x, y, id));
		super.mouseClicked(x, y, id);
	}
	
	@Override
	public void drawGuiContainerForegroundLayer(int x, int y){
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.drawCenteredString(this.fontRenderer, this.tree.getName(), k, l, 0xFFFFFF);
	}
	
	private void drawTechTree(int x, int y){
		GL11.glDepthFunc(GL11.GL_GEQUAL);
		GL11.glPushMatrix();
		
		RenderItem item = new RenderItem();
		RenderHelper.enableGUIStandardItemLighting();
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glEnable(GL12.GL_RESCALE_NORMAL);
		GL11.glEnable(GL11.GL_COLOR_MATERIAL);
		
		for(TechTreeNode node : this.tree.getRoots()){
			GL11.glColor4f(0.3F, 0.3F, 0.3F, 1.0F);
			GL11.glEnable(GL11.GL_LIGHTING);
			
			this.renderNodeR(node, item, x, y);
			
			GL11.glDisable(GL11.GL_LIGHTING);
		}
		
		GL11.glPopMatrix();
		GL11.glDepthFunc(GL11.GL_LEQUAL);
		GL11.glEnable(GL11.GL_DEPTH_TEST);
		GL11.glEnable(GL11.GL_LIGHTING);
		RenderHelper.disableStandardItemLighting();
	}
	
	private void renderNodeR(TechTreeNode node, RenderItem item, int x, int y){
		GL11.glEnable(GL11.GL_CULL_FACE);
		item.renderItemIntoGUI(this.fontRenderer, this.mc.getTextureManager(), new ItemStack(EXOItems.ITEM_UPGRADE_LINK, 1, 0), node.getPosition().getX() + x - 7, node.getPosition().getY() + y - 16);
		for(TechTreeNode child : node.getChildren()){
			this.renderNodeR(child, item, x, y);
		}
	}
	
	private void drawStats(){
		
	}
}