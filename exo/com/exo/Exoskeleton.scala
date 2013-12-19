package com.exo

import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.network.NetworkMod
import cpw.mods.fml.common.event.{
  FMLPreInitializationEvent=>FMLPreInit,
  FMLInitializationEvent=>FMLInit,
  FMLPostInitializationEvent=>FMLPostInit,
  FMLServerStartingEvent=>FMLServStart
}

@Mod(modid="EXO", name="Exoskeleton", version="1.0.0", modLanguage="scala")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
object Exoskeleton{
  @Mod.EventHandler()
  def preInit(event: FMLPreInit){
    
  }
  
  @Mod.EventHandler()
  def init(event: FMLInit){
    
  }
  
  @Mod.EventHandler()
  def postInit(event: FMLPostInit){
    
  }
  
  @Mod.EventHandler()
  def serverStarting(event: FMLServStart){
    
  }
}