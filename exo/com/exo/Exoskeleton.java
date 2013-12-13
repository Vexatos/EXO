package com.exo;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="EXO", name="Exoskeleton", version="0.0.0")
@NetworkMod(channels={"EXO"}, clientSideRequired=true, serverSideRequired=false)
public class Exoskeleton{
	@Mod.Instance("EXO")
	public static Exoskeleton INSTANCE;
	
	@Mod.EventHandler()
	private void preInit(FMLPreInitializationEvent event){
		
	}
	
	@Mod.EventHandler()
	private void init(FMLInitializationEvent event){
		
	}
	
	@Mod.EventHandler()
	private void postInit(FMLPostInitializationEvent event){
		
	}
	
	@Mod.EventHandler()
	private void serverStarting(FMLServerStartingEvent event){
		
	}
}