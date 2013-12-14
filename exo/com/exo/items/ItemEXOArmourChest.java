package com.exo.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

import com.exo.api.ItemEXOArmourPiece;

public final class ItemEXOArmourChest extends ItemEXOArmourPiece{
	private Icon[] textures;
	
	public ItemEXOArmourChest(int id){
		super(id, 1);
		this.setUnlocalizedName(super.getUnlocalizedName() + "Chest");
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
			register.registerIcon("exo:armour/exoChestFrame"),
			register.registerIcon("exo:armour/exoChest")
		};
	}
}