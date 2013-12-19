package com.exo

import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.network.NetworkMod
import cpw.mods.fml.common.event.{
  FMLPreInitializationEvent=>FMLPreInit,
  FMLInitializationEvent=>FMLInit,
  FMLPostInitializationEvent=>FMLPostInit,
  FMLServerStartingEvent=>FMLServStart
}
import java.util.logging.Logger
import cpw.mods.fml.common.FMLLog
import cpw.mods.fml.common.SidedProxy
import com.exo.server.ServerProxy
import cpw.mods.fml.common.network.{NetworkRegistry=>Net}
import com.exo.lib.EXOGuiHandler
import cpw.mods.fml.common.registry.{TickRegistry=>Ticks}
import com.exo.client.ClientTickHandler
import cpw.mods.fml.relauncher.Side
import com.exo.server.ServerTickHandler
import com.exo.lib.EXOEvents
import com.exo.items.Items

@Mod(modid="EXO", name="Exoskeleton", version="1.0.0", modLanguage="scala")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
object Exoskeleton{
  val LOGGER: Logger = Logger.getLogger("Exoskeleton");
  LOGGER.setParent(FMLLog.getLogger());
  
  @SidedProxy(clientSide="com.exo.client.ClientProxy", serverSide="com.exo.server.ServerProxy")
  var PROXY: ServerProxy = null;
  
  @Mod.EventHandler()
  def preInit(event: FMLPreInit){
    LOGGER.info("Pre-Initialization");
    
    LOGGER.info("Proxy Inits");
    PROXY.init();
    PROXY.initRenders();
    PROXY.initTiles();
    LOGGER.info("Done Proxy Inits");
    
    LOGGER.info("Registering Gui Handler");
    Net.instance().registerGuiHandler(this, new EXOGuiHandler());
    LOGGER.info("Done Registering Gui Handler");
    
    LOGGER.info("Registering Tick Handlers");
    Ticks.registerTickHandler(new ClientTickHandler(), Side.CLIENT);
    Ticks.registerTickHandler(new ServerTickHandler(), Side.SERVER);
    LOGGER.info("Done Registering Tick Handlers");
    
    LOGGER.info("Registering Event Handlers");
    EXOEvents.registerHandlers;
    LOGGER.info("Done Registering Event Handlers");
    
    LOGGER.info("Done Pre-Initialization");
  }
  
  @Mod.EventHandler()
  def init(event: FMLInit){
    LOGGER.info("Initialization");
    
    LOGGER.info("Registering Items");
    Items.registerItems();
    LOGGER.info("Done Registering Items");
    
    LOGGER.info("Done Initialization");
  }
  
  @Mod.EventHandler()
  def postInit(event: FMLPostInit){
    LOGGER.info("Post-Initialization");
    
    LOGGER.info("Adding Item Names");
    Items.addItemNames();
    LOGGER.info("Done Adding Item Names");
    
    LOGGER.info("Done Post-Initialization");
  }
  
  @Mod.EventHandler()
  def serverStarting(event: FMLServStart){
    LOGGER.info("Server Starting");
    LOGGER.info("Done Server-Starting");
  }
}