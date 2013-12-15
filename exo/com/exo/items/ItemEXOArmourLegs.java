package com.exo.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

import com.exo.api.EnumEXOCoreType;
import com.exo.api.ItemEXOArmourPiece;

public final class ItemEXOArmourLegs extends ItemEXOArmourPiece{
	private Icon[] ICONS;
	
	public ItemEXOArmourLegs(int id){
		super(id, 2);
		this.setUnlocalizedName(super.getUnlocalizedName() + "Legs");
	}
	
	@Override
	public Icon getIconFromDamage(int damage){
		return ICONS[0];
	}
	
	@Override
	public void registerIcons(IconRegister register){
		this.ICONS = new Icon[EnumEXOCoreType.values().length];
		
		for(int i = 0; i < EnumEXOCoreType.values().length; i++){
			this.ICONS[i] = register.registerIcon(EnumEXOCoreType.values()[i].getLeggingsPath());
		}
	}
}