package com.exo.asm

import net.minecraft.launchwrapper.IClassTransformer

class EXOTransformer extends IClassTransformer{
  override def transform(name: String, tName: String, data: Array[Byte]): Array[Byte]={
    return null;
  }
}