package com.exo.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public final class ItemEXOArmourLegs extends ItemEXOArmourPiece{
	private Icon texture;
	
	public ItemEXOArmourLegs(int id){
		super(id, 2);
	}
	
	@Override
	public Icon getIconFromDamage(int damage){
		return this.texture;
	}
	
	@Override
	public void registerIcons(IconRegister register){
		this.texture = register.registerIcon("edx:armour/exoLeggingsFrame");
	}
}