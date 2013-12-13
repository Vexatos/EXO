package com.exo;

import java.util.logging.Logger;

import com.exo.server.CommonProxy;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
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
	
	@SidedProxy(clientSide="com.exo.client.ClientProxy", serverSide="com.exo.server.CommonProxy")
	public static CommonProxy PROXY;
	
	public static final Logger LOGGER = Logger.getLogger(Exoskeleton.class.getAnnotation(Mod.class).name());
	
	@Mod.EventHandler()
	private void preInit(FMLPreInitializationEvent event){
		LOGGER.setParent(FMLLog.getLogger());
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