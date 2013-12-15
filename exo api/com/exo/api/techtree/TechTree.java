package com.exo.api.techtree;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;

public class TechTree{
	private NBTTagCompound compound;
	private final String name;
	private final ResourceLocation background;
	private final TechTreeNode[] roots;
	
	public TechTree(String name, ResourceLocation background, TechTreeNode[] roots){
		this.name = name;
		this.background = background;
		this.roots = roots;
	}
	
	public ResourceLocation getBackground(){
		return this.background;
	}
	
	public String getName(){
		return this.name;
	}
	
	public TechTreeNode[] getRoots(){
		return this.roots;
	}
}