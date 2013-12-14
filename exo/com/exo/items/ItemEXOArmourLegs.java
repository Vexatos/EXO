package com.exo.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

import com.exo.api.ItemEXOArmourPiece;

public final class ItemEXOArmourLegs extends ItemEXOArmourPiece{
	private Icon[] textures;
	
	public ItemEXOArmourLegs(int id){
		super(id, 2);
		this.setUnlocalizedName(super.getUnlocalizedName() + "Legs");
	}
	
	@Override
	public Icon getIconFromDamage(int damage){
		if(ItemEXOArmourPiece.getCurrentCore(new ItemStack(this, 1, damage)) != null){
			return this.textures[1];
		} else{
			return this.textures[0];
		}
	}
	
	@Override
	public void registerIcons(IconRegister register){
		this.textures = new Icon[]{
			register.registerIcon("exo:armour/exoLeggingsFrame"),
			register.registerIcon("exo:armour/exoLeggings")
		};
	}
}