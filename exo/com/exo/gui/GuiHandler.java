package com.exo.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import com.exo.gui.client.GuiAssembler;
import com.exo.gui.client.GuiModifier;
import com.exo.gui.server.ContainerAssembler;
import com.exo.gui.server.ContainerModifier;
import com.exo.tile.TileAssembler;
import com.exo.tile.TileConstructor;

import cpw.mods.fml.common.network.IGuiHandler;

public final class GuiHandler implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch(ID)
		{
			case -1:
				return null;
			case 0:
				return new ContainerAssembler(player.inventory, (TileAssembler) world.getBlockTileEntity(x, y, z));
			case 1:
				return new ContainerModifier(player.inventory, (TileConstructor) world.getBlockTileEntity(x, y, z));
			default:
				return null;
		}
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch(ID)
		{
			case -1:
				return new GuiTest();
			case 0:
				return new GuiAssembler(player.inventory, (TileAssembler) world.getBlockTileEntity(x, y, z));
			case 1:
				return new GuiModifier(player.inventory, (TileConstructor) world.getBlockTileEntity(x, y, z));
			default:
				return null;
		}
	}
}