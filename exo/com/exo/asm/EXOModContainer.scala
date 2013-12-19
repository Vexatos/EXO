package com.exo.asm

import cpw.mods.fml.common.DummyModContainer
import cpw.mods.fml.common.ModMetadata
import java.util.Arrays
import cpw.mods.fml.common.LoadController
import com.google.common.eventbus.EventBus
import cpw.mods.fml.common.event.
{
  FMLPreInitializationEvent=>FMLPreInit,
  FMLInitializationEvent=>FMLInit,
  FMLPostInitializationEvent=>FMLPostInit,
  FMLServerStartingEvent=>FMLServStart
}
import com.google.common.eventbus.Subscribe

class EXOModContainer extends DummyModContainer(new ModMetadata()){
  this.setupMeta();
  
  private def setupMeta(){
    var meta: ModMetadata = super.getMetadata();
    meta.modId = "EXO-Core";
    meta.name = "Exoskeleton Core";
    meta.version = "1.0.0";
    meta.authorList = Arrays.asList("Asyncronous", "CyanideX");
    meta.description = "Exoskeleton Core";
    meta.url = "www.bitbucket.org/Asyncronous/exo";
    meta.credits = "Everyone on Forge, Mojang, Authors";
  }
  
  override def registerBus(bus: EventBus, controller: LoadController): Boolean={
    bus.register(this);
    return true;
  }
  
  @Subscribe()
  private def preInit(event: FMLPreInit){
    
  }
  
  @Subscribe()
  private def init(event: FMLInit){
    
  }
  
  @Subscribe()
  private def postInit(event: FMLPostInit){
    
  }
  
  @Subscribe()
  private def serverStarting(event: FMLServStart){
    
  }
}