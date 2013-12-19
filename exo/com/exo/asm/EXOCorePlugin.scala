package com.exo.asm

import cpw.mods.fml.relauncher.IFMLLoadingPlugin
import java.util.Map;

@IFMLLoadingPlugin.MCVersion("1.6.2")
@IFMLLoadingPlugin.TransformerExclusions(Array("com.exo.asm"))
class EXOCorePlugin extends IFMLLoadingPlugin{
  override def getLibraryRequestClass(): Array[String]={
    return null;
  }
  
  override def getASMTransformerClass(): Array[String]={
    return null;
  }
  
  override def getModContainerClass(): String={
    return null;
  }
  
  override def getSetupClass(): String={
    return null;
  }
  
  def injectData(data: Map[String, Object])={
    
  }
}