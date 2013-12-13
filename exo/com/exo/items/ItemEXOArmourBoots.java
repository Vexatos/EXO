package com.exo.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

import com.exo.api.ItemEXOArmourPiece;

public final class ItemEXOArmourBoots extends ItemEXOArmourPiece{
	private Icon[] textures;
	
	public ItemEXOArmourBoots(int id){
		super(id, 3);
		this.setUnlocalizedName(super.getUnlocalizedName() + "Boots");
	}
	
	@Override
	public Icon getIconFromDamage(int damage){
		return this.textures[0];
	}
	
	@Override
	public Icon getIcon(ItemStack stack, int pass){
		if(ItemEXOArmourPiece.getCurrentCore(stack) != null){
			return this.textures[1];
		} else{
			return this.textures[0];
		}
	}
	
	@Override
	public void registerIcons(IconRegister register){
		this.textures = new Icon[]{
			register.registerIcon("exo:armour/exoBootsFrame"),
			register.registerIcon("exo:armour/exoBoots")
		};
	}
}