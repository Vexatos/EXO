package com.exo.api.techtree;

import net.minecraft.nbt.NBTTagCompound;

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
	
	public static TechTreeNode loadFromNBT(NBTTagCompound comp){
		TechTreeNode node = null;
		
		if(comp.hasKey("name")){
			TechTreeNode child = null;
			if(comp.hasKey("child")){
				child = TechTreeNode.loadFromNBT(comp.getCompoundTag("child"));
			}
			
			node = new TechTreeNode(comp.getString("name"), new Vector2(comp.getInteger("x"), comp.getInteger("y")), child);
			node.unlocked = comp.getBoolean("unlocked");
		}
		
		return node;
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