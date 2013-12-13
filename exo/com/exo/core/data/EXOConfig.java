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
		
		EXOSessionData.BLOCK_ASSEMBLER_ID = this.config.getBlock("Assembler", 3000).getInt();
		EXOSessionData.ITEM_CORE_DEFAULT_FULL_ID = this.config.getItem("Default Core Full", 5000).getInt();
		EXOSessionData.ITEM_CORE_DEFAULT_EMPTY_ID = this.config.getItem("Default Core Empty", 5001).getInt();
		EXOSessionData.ITEM_SUIT_UNCHARGED_HELM_ID = this.config.getItem("Exosuit Helmet", 5002).getInt();
		EXOSessionData.ITEM_SUIT_UNCHARGED_CHEST_ID = this.config.getItem("Exosuit Chest", 5003).getInt();
		EXOSessionData.ITEM_SUIT_UNCHARGED_LEGS_ID = this.config.getItem("Exosuit Legs", 5004).getInt();
		EXOSessionData.ITEM_SUIT_UNCHARGED_BOOTS_ID = this.config.getItem("Exosuit Boots", 5005).getInt();
		EXOSessionData.ITEM_UPGRADELINK_ID = this.config.getItem("Upgrade Link", 5006).getInt();
		
		this.config.save();
	}
}