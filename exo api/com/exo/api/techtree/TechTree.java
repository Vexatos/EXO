package com.exo.api.techtree;

import java.util.LinkedList;
import java.util.List;

import com.google.common.collect.ImmutableList;

public class TechTree{
	private final String name;
	private final List<TechTreeNode> nodes = new LinkedList<TechTreeNode>();
	
	public TechTree(String name){
		this.name = name;
	}
	
	public TechTree addNode(TechTreeNode node){
		this.nodes.add(node);
		return this;
	}
	
	public List<TechTreeNode> getNodes(){
		return ImmutableList.copyOf(this.nodes);
	}
}