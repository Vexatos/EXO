package com.exo.server

import cpw.mods.fml.common.ITickHandler
import java.util.EnumSet
import cpw.mods.fml.common.TickType

class ServerTickHandler extends ITickHandler{
  override def tickStart(types: EnumSet[TickType], data: Object*){
    
  }
  
  override def tickEnd(types: EnumSet[TickType], data: Object*){
    
  }
  
  override def ticks(): EnumSet[TickType]={
    return null;
  }
  
  override def getLabel(): String={
    return "EXO-Server";
  }
}