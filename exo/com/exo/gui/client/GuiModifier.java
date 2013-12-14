package com.exo.gui.client;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;

import com.exo.gui.server.ContainerModifier;
import com.exo.tile.TileConstructor;

public class GuiModifier extends GuiContainer{
	public GuiModifier(InventoryPlayer player, TileConstructor tile){
		super(new ContainerModifier(player, tile));
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		// TODO Auto-generated method stub
		
	}
}