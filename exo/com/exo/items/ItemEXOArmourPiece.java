package com.exo.items;

import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import com.exo.core.TabEXO;
import com.exo.core.scope.EXOMaterialScope;

public abstract class ItemEXOArmourPiece extends ItemArmor implements EXOMaterialScope{public ItemEXOArmourPiece(int id, int slot){
		super(id, EXO_SUIT_MATERIAL, 0, slot);
		this.setCreativeTab(TabEXO.tabEXO);
		this.setUnlocalizedName("itemEXOArmourPiece");
	}

	public static ItemStack getCurrentCore(ItemStack armourPiece){
		if(armourPiece.stackTagCompound == null){
			armourPiece.setTagCompound(new NBTTagCompound());
		}
		
		NBTTagCompound comp = armourPiece.stackTagCompound;
		
		if(comp.hasKey("core")){
			NBTTagCompound core = (NBTTagCompound) comp.getTag("core");
			return ItemStack.loadItemStackFromNBT(core);
		} else{
			return null;
		}
	}
	
	public static void setCurrentCore(ItemStack armourPiece, ItemStack core){
		if(armourPiece.stackTagCompound == null){
			armourPiece.setTagCompound(new NBTTagCompound());
		}
		
		NBTTagCompound comp = armourPiece.stackTagCompound;
		NBTTagCompound tag = new NBTTagCompound();
		core.writeToNBT(tag);
		comp.setTag("core", tag);
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean bool){
		
	}
	
}