package com.exo.core.techtree;

import com.exo.api.techtree.TechTree;
import com.exo.api.techtree.TechTreeNode;

public final class DefaultTechTree extends TechTree{
	public final TechTreeNode ROOT = new TechTreeNode("Test", 0, 0, null).register(this);
	public final TechTreeNode CHILD_1 = new TechTreeNode("Child 1", 0, 10, null).register(this);
	public final TechTreeNode CHILD_2 = new TechTreeNode("Child 2", 0, 20, null).register(this);
	
	public DefaultTechTree(){
		super("Default");
	}
}