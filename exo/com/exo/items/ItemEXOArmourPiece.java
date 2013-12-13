package com.exo.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import com.exo.api.ItemCore;
import com.exo.core.TabEXO;
import com.exo.core.scope.EXOMaterialScope;

public abstract class ItemEXOArmourPiece extends ItemArmor implements EXOMaterialScope{
	private ItemCore currentCore;
	
	public ItemEXOArmourPiece(int id, int slot){
		super(id, EXO_SUIT_MATERIAL, 0, slot);
		this.setCreativeTab(TabEXO.tabEXO);
		this.setUnlocalizedName("itemEXOArmourPiece");
	}
	
	private ItemCore getCurrentCore(){
		return this.currentCore;
	}
	
	private void setCurrentCore(ItemCore item){
		this.currentCore = item;
	}
	
	public static Item loadItemCore(ItemStack armourPiece){
		if(armourPiece.getItem() instanceof ItemEXOArmourPiece){
			ItemEXOArmourPiece armour = (ItemEXOArmourPiece) armourPiece.getItem();
			
			if(armour.getCurrentCore() != null){
				return armour.getCurrentCore();
			} else{
				if(armourPiece.stackTagCompound.hasKey("currentCore")){
					NBTTagCompound comp = (NBTTagCompound) armourPiece.stackTagCompound.getTag("currentCore");
					armour.setCurrentCore(((ItemCore) ItemStack.loadItemStackFromNBT(comp).getItem()));
					return armour.getCurrentCore();
				} else{
					return null;
				}
			}
		} else{
			return null;
		}
	}
	
	public static void setItemCore(ItemStack armourPiece, ItemCore core){
		if(core.isCharged()){
			if(armourPiece.getItem() instanceof ItemEXOArmourPiece){
				if(armourPiece.stackTagCompound == null){
					armourPiece.setTagCompound(new NBTTagCompound());
				}
				
				NBTTagCompound coreComp = new NBTTagCompound();
				new ItemStack(core).writeToNBT(coreComp);
				armourPiece.stackTagCompound.setTag("currentCore", coreComp);
				((ItemEXOArmourPiece) armourPiece.getItem()).setCurrentCore(core);
			}
		}
	}
}