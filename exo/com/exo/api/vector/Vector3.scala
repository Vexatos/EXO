package com.exo.api.vector

class Vector3(x: Int, y: Int, z: Int) extends Vector2(x, y){
  def getZ(): Int={
    return this.z;
  }
}