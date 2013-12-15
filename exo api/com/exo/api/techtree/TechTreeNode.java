package com.exo.api.techtree;

import java.util.LinkedList;
import java.util.List;

import com.exo.api.lib.vector.Vector2;
import com.google.common.collect.ImmutableList;

public class TechTreeNode{
	private final String name;
	private final Vector2 vec;
	private final TechTreeNode next;
	private boolean unlocked = false;
	private final List<TechTreeNode> children = new LinkedList<TechTreeNode>();
	
	public TechTreeNode(String name, Vector2 vec, TechTreeNode node){
		this.name = name;
		this.vec = vec;
		this.next = node;
	}
	
	public void unlock(){
		this.unlocked = true;
	}
	
	public boolean isUnlocked(){
		return this.unlocked;
	}
	
	public String getName(){
		return this.name;
	}
	
	public Vector2 getPosition(){
		return this.vec;
	}
	
	public List<TechTreeNode> getChildren(){
		return ImmutableList.copyOf(this.children);
	}
}