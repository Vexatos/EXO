package com.exo;

import java.util.logging.Logger;

import com.exo.blocks.EXOBlocks;
import com.exo.client.ClientTickHandler;
import com.exo.core.EXORecipes;
import com.exo.gui.GuiHandler;
import com.exo.items.EXOItems;
import com.exo.server.CommonProxy;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

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
		LOGGER.info("Pre-Initialization");
		
		LOGGER.info("Proxy Init(s)");
		PROXY.init();
		PROXY.initRenders();
		PROXY.initTiles();
		LOGGER.info("Done Proxy Init(s)");
		
		LOGGER.info("Done Pre-Initialization");
	}
	
	@Mod.EventHandler()
	private void init(FMLInitializationEvent event){
		LOGGER.info("Initialization");
		
		LOGGER.info("Registering Items");
		EXOItems.INSTANCE.registerItems();
		LOGGER.info("Done Registering Items");
		
		LOGGER.info("Registering Blocks");
		EXOBlocks.INSTANCE.registerBlocks();
		LOGGER.info("Done Registering Blocks");
		
		LOGGER.info("Registering GUI Handler");
		NetworkRegistry.instance().registerGuiHandler(Exoskeleton.INSTANCE, new GuiHandler());
		LOGGER.info("Done Registering GUI Handler");
		
		LOGGER.info("Registering Tick Handler");
		TickRegistry.registerTickHandler(new ClientTickHandler(), Side.CLIENT);
		LOGGER.info("Done Registering Tick Handler");
		
		LOGGER.info("Done Initialization");
	}
	
	@Mod.EventHandler()
	private void postInit(FMLPostInitializationEvent event){
		LOGGER.info("Post-Initialization");
		
		LOGGER.info("Adding Item Names");
		EXOItems.INSTANCE.addItemNames();
		LOGGER.info("Done Adding Item Names");
		
		LOGGER.info("Adding Block Names");
		EXOBlocks.INSTANCE.addBlockNames();
		LOGGER.info("Done Adding Block Names");
		
		LOGGER.info("Adding Dungeon Loot");
		// ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST, new WeightedRandomChestContent());
		LOGGER.info("Done Adding Dungeon Loot");
		
		LOGGER.info("Adding Recipes");
		EXORecipes.addRecipes();
		LOGGER.info("Done Adding Recipes");
		
		LOGGER.info("Done Post-Initialization");
	}
	
	@Mod.EventHandler()
	private void serverStarting(FMLServerStartingEvent event){
		LOGGER.info("Server-Starting");
		LOGGER.info("Done Server-Starting");
	}
}