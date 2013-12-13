package com.exo.items;

import com.exo.api.ItemEXOArmourPiece;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public final class ItemEXOArmourBoots extends ItemEXOArmourPiece{
	private Icon texture;
	
	public ItemEXOArmourBoots(int id){
		super(id, 3);
		this.setUnlocalizedName(super.getUnlocalizedName() + "Boots");
	}
	
	@Override
	public Icon getIconFromDamage(int damage){
		return this.texture;
	}
	
	@Override
	public void registerIcons(IconRegister register){
		this.texture = register.registerIcon("exo:armour/exoBootsFrame");
	}
}