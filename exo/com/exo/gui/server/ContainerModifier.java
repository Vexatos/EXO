package com.exo.gui.server;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

import com.exo.tile.TileConstructor;

public class ContainerModifier extends Container{
	public ContainerModifier(InventoryPlayer player, TileConstructor tile){
		
	}

	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		return true;
	}
}