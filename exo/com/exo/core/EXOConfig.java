package com.exo.core;

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
		
		this.config.save();
	}
}