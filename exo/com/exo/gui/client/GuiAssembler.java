package com.exo.gui.client;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.exo.gui.server.ContainerAssembler;
import com.exo.tile.TileAssembler;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public final class GuiAssembler extends GuiContainer{
	private final ResourceLocation TEXTURE = new ResourceLocation("exo", "textures/gui/guiAssembler.png");
	private final TileAssembler tile;
	
	public GuiAssembler(InventoryPlayer player, TileAssembler tile){
		super(new ContainerAssembler(player, tile));
		this.tile = tile;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(this.TEXTURE);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
	}
	
	@Override
	public void drawGuiContainerForegroundLayer(int x, int y){
		
	}
}