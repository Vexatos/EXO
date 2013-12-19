package com.exo.asm

import cpw.mods.fml.relauncher.IFMLLoadingPlugin
import java.util.Map;
import cpw.mods.fml.relauncher.IFMLCallHook

@IFMLLoadingPlugin.MCVersion("1.6.2")
@IFMLLoadingPlugin.TransformerExclusions(Array("com.exo.asm"))
class EXOCorePlugin extends IFMLLoadingPlugin with IFMLCallHook{
  @Deprecated
  override def getLibraryRequestClass(): Array[String]={
    return null;
  }
  
  override def getASMTransformerClass(): Array[String]={
    return Array("com.exo.asm.EXOTransformer");
  }
  
  override def getModContainerClass(): String={
    return "com.exo.asm.EXOModContainer";
  }
  
  override def getSetupClass(): String={
    return "com.exo.asm.EXOCorePlugin";
  }
  
  override def injectData(data: Map[String, Object])={
    
  }
  
  override def call(): Void={
    return null;
  }
}