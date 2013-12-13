package com.exo.items;

import net.minecraft.item.ItemArmor;

import com.exo.core.TabEXO;
import com.exo.core.scope.EXOMaterialScope;

public abstract class ItemEXOArmourPiece extends ItemArmor implements EXOMaterialScope{
	public ItemEXOArmourPiece(int id, int slot){
		super(id, EXO_SUIT_MATERIAL, 0, slot);
		this.setCreativeTab(TabEXO.tabEXO);
		this.setUnlocalizedName("itemEXOArmourPiece");
	}
}