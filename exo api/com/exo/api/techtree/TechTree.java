package com.exo.api.techtree;

import java.util.LinkedList;
import java.util.List;

import net.minecraft.util.ResourceLocation;

import com.google.common.collect.ImmutableList;

public class TechTree{
	private final String name;
	private final ResourceLocation background;
	private final List<TechTreeNode> nodes = new LinkedList<TechTreeNode>();
	
	public TechTree(String name, ResourceLocation background){
		this.name = name;
		this.background = background;
	}
	
	public TechTree addNode(TechTreeNode node){
		this.nodes.add(node);
		return this;
	}
	
	public ResourceLocation getBackground(){
		return this.background;
	}
	
	public String getName(){
		return this.name;
	}
	
	public List<TechTreeNode> getNodes(){
		return ImmutableList.copyOf(this.nodes);
	}
}