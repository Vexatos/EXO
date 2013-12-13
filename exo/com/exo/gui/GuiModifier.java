package com.exo.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.exo.tile.TileModifier;

public final class GuiModifier extends GuiContainer{
	private final ResourceLocation background = new ResourceLocation("exo", "textures/gui/guiModifier.png");
	private TileModifier tile;
	private int xSize = 207;
	private int ySize = 250;
	
	public GuiModifier(InventoryPlayer player, TileModifier tile){
		super(new ContainerModifier(player, tile));
		this.tile = tile;
	}
	
	@Override
	public void drawGuiContainerForegroundLayer(int x, int y){
		
	}
	
	@Override
	public void drawGuiContainerBackgroundLayer(float f, int x, int y){
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(background);
		this.drawTexturedModalRect(((this.width - this.xSize) / 2) + 100, ((this.height - this.ySize) / 2) , 0, 0, this.xSize, this.ySize);
	}
}