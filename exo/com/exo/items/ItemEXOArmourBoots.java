package com.exo.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public final class ItemEXOArmourBoots extends ItemEXOArmourPiece{
	private Icon texture;
	
	public ItemEXOArmourBoots(int id){
		super(id, 3);
	}
	
	@Override
	public Icon getIconFromDamage(int damage){
		return this.texture;
	}
	
	@Override
	public void registerIcons(IconRegister register){
		this.texture = register.registerIcon("edx:armour/exoBootsFrame");
	}
}