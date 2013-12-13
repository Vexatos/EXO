package com.exo.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import com.exo.tile.TileModifier;

import cpw.mods.fml.common.network.IGuiHandler;

public final class GuiHandler implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch(ID)
		{
			case 1:
				return new ContainerModifier(player.inventory, (TileModifier) world.getBlockTileEntity(x, y, z));
			default:
				return null;
		}
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch(ID)
		{
			case 0:
				return new GuiTest();
			case 1:
				return new GuiModifier(player.inventory, (TileModifier) world.getBlockTileEntity(x, y, z));
			default:
				return null;
		}
	}
}