package com.exo.core.data;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class EXOConfig{
	private final Configuration config;
	
	public EXOConfig(File file){
		this.config = new Configuration(file);
	}
	
	public void load(){
		this.config.load();
		
		EXOSessionData.CURRENT_LANGUAGE = this.config.get("settings", "language", "en_US").getString();
		EXOSessionData.RENDER_OVERLAY = this.config.get("settings", "renderOverlay", true).getBoolean(true);
		
		EXOSessionData.BLOCK_ASSEMBLER_ID = this.config.getBlock("Assembler", 3000).getInt();
		EXOSessionData.BLOCK_CONSTRUCTOR_ID = this.config.getBlock("Constructor", 3001).getInt();
		EXOSessionData.ITEM_CORE_ID = this.config.getBlock("Core", 5000).getInt();
		EXOSessionData.ITEM_SUIT_UNCHARGED_HELM_ID = this.config.getItem("Exosuit Helmet", 5001).getInt();
		EXOSessionData.ITEM_SUIT_UNCHARGED_CHEST_ID = this.config.getItem("Exosuit Chest", 5002).getInt();
		EXOSessionData.ITEM_SUIT_UNCHARGED_LEGS_ID = this.config.getItem("Exosuit Legs", 5003).getInt();
		EXOSessionData.ITEM_SUIT_UNCHARGED_BOOTS_ID = this.config.getItem("Exosuit Boots", 5004).getInt();
		EXOSessionData.ITEM_UPGRADELINK_ID = this.config.getItem("Upgrade Link", 5005).getInt();
		
		this.config.save();
	}
}