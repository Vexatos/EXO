package com.exo.client;

import java.util.EnumSet;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.InventoryPlayer;

import com.exo.Exoskeleton;
import com.exo.api.ItemEXOArmourPiece;
import com.exo.core.data.EXOSessionData;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.TickType;

public class ClientTickHandler implements ITickHandler{
	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) {
		
	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) {
		if(EXOSessionData.RENDER_OVERLAY){
			Minecraft client = FMLClientHandler.instance().getClient();
			if(client.inGameHasFocus){
				InventoryPlayer inventory = client.thePlayer.inventory;
				
				if(inventory.armorItemInSlot(0) != null && inventory.armorItemInSlot(0).getItem() instanceof ItemEXOArmourPiece){
					ItemEXOArmourPiece item = (ItemEXOArmourPiece) inventory.armorItemInSlot(0).getItem();
				}
			}
		}
	}

	@Override
	public EnumSet<TickType> ticks() {
		return EnumSet.of(TickType.CLIENT, TickType.RENDER);
	}

	@Override
	public String getLabel() {
		return Exoskeleton.class.getAnnotation(Mod.class).modid();
	}
}