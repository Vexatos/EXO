package com.exo.api.lib.vector;

public class Vector3 extends Vector2{
	private final int z;
	
	public Vector3(int x, int y, int z){
		super(x, y);
		this.z = z;
	}
	
	public int getZ(){
		return this.z;
	}
}