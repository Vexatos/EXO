package com.exo.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

import com.exo.tile.TileModifier;

public final class ContainerModifier extends Container{
	private TileModifier tile;
	
	public ContainerModifier(InventoryPlayer player, TileModifier tile){
		this.tile = tile;
	}

	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		return true;
	}
}