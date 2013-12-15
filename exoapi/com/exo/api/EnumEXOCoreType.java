package com.exo.api;

public enum EnumEXOCoreType{
	DEFAULT("exo:armour/exo/"),
	CHRISTMAS("exo:armour/exo/christmas/"),
	BERZERK("exo:armour/exo/berzerk/"),
	RECON("exo:armour/exo/recon/"),
	REFLEX("exo:armour/exo/reflex/"),
	INFERNO("exo:armour/exo/inferno/"),
	FRAME("exo:armour/exo/frame/");
	
	private final String path;
	
	private EnumEXOCoreType(String path){
		this.path = path;
	}
	
	public String getCorePath(){
		return this.path + "core";
	}
	
	public String getHelmetPath(){
		return this.path + "helmet";
	}
	
	public String getChestplatePath(){
		return this.path + "chest";
	}
	
	public String getLeggingsPath(){
		return this.path + "leggings";
	}
	
	public String getBootsPath(){
		return this.path + "boots";
	}
}
