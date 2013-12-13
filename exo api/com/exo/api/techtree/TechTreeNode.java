package com.exo.api.techtree;

import com.exo.api.lib.vector.Vector2;

public class TechTreeNode{
	private final String name;
	private final Vector2 vec;
	private final TechTreeNode next;
	private boolean unlocked = false;
	
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
	
	public TechTreeNode getNext(){
		return this.next == null ? this : this.next;
	}
	
	public String getName(){
		return this.name;
	}
	
	public Vector2 getPosition(){
		return this.vec;
	}
	
	public TechTreeNode register(TechTree tree){
		tree.addNode(this);
		return this;
	}
}