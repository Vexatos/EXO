package com.exo.api.techtree;

public class TechTreeNode{
	private final String name;
	private final int x;
	private final int y;
	private final TechTreeNode next;
	
	public TechTreeNode(String name, int x, int y, TechTreeNode node){
		this.name = name;
		this.x = x;
		this.y = y;
		this.next = node;
	}
	
	public TechTreeNode getNext(){
		return this.next;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	
	public TechTreeNode register(TechTree tree){
		tree.addNode(this);
		return this;
	}
}