package com.exo.client;

import java.util.EnumSet;

import com.exo.core.data.EXOSessionData;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public final class BacktrackTickHandler implements ITickHandler{
	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) {
		
	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) {
		if(EXOSessionData.BACKTRACK_CACHE){
			
		}
	}

	@Override
	public EnumSet<TickType> ticks() {
		return EnumSet.of(TickType.CLIENT, TickType.PLAYER, TickType.WORLD);
	}

	@Override
	public String getLabel() {
		return "EXO-BACKTRACK";
	}
}