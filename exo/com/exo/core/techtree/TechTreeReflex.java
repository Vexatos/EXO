package com.exo.core.techtree;

import net.minecraft.util.ResourceLocation;

import com.exo.api.lib.vector.Vector2;
import com.exo.api.techtree.TechTree;
import com.exo.api.techtree.TechTreeNode;

public final class TechTreeReflex extends TechTree{
	public static final TechTreeNode NODE_ROOT_FOC = new TechTreeNode("FOC", new Vector2(35, 107), null);
	public static final TechTreeNode NODE_ROOT_ARM = new TechTreeNode("ARM", new Vector2(35, 148), null);
	
	public TechTreeReflex(){
		super("Reflex", new ResourceLocation("exo", "textures/gui/tree/guiModifierReflex.png"), new TechTreeNode[]{
			NODE_ROOT_ARM, NODE_ROOT_FOC
		});
	}
}