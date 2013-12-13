package com.exo.api.techtree;

import java.util.LinkedList;
import java.util.List;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.ResourceLocation;

import com.google.common.collect.ImmutableList;

public class TechTree{
	private NBTTagCompound compound;
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
	
	public static TechTree loadFromCompound(NBTTagCompound comp){
		TechTree tree = null;
		
		if(comp.hasKey("name") && comp.hasKey("background")){
			tree = new TechTree(comp.getString("name"), new ResourceLocation(comp.getString("background")));
		}
		
		if(comp.hasKey("nodes")){
			NBTTagList tags = comp.getTagList("nodes");
			
			for(int i = 0; i < tags.tagCount(); i++){
				TechTreeNode node = TechTreeNode.loadFromNBT((NBTTagCompound) tags.tagAt(i));
				tree.addNode(node);
			}
		}
		
		return tree;
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