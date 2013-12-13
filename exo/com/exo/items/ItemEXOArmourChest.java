package com.exo.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public final class ItemEXOArmourChest extends ItemEXOArmourPiece{
	private Icon texture;
	
	public ItemEXOArmourChest(int id){
		super(id, 1);
		this.setUnlocalizedName(super.getUnlocalizedName() + "Chest");
	}
	
	@Override
	public Icon getIconFromDamage(int damage){
		return this.texture;
	}
	
	@Override
	public void registerIcons(IconRegister register){
		this.texture = register.registerIcon("exo:armour/exoChestplateFrame");
	}
}