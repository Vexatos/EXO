package com.exo.api;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import com.exo.core.TabEXO;
import com.exo.core.scope.EXOMaterialScope;
import com.exo.items.ItemCore;

import cpw.mods.fml.client.FMLClientHandler;

public abstract class ItemEXOArmourPiece extends ItemArmor implements EXOMaterialScope{
	public ItemEXOArmourPiece(int id, int slot){
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
		if(FMLClientHandler.instance().getClient().gameSettings.isKeyDown(FMLClientHandler.instance().getClient().gameSettings.keyBindSneak)){
			list.add(String.format("Current Core: %s", this.getCurrentCoreStatus(stack)));
		}
	}
	
	private String getCurrentCoreStatus(ItemStack stack){
		return ItemEXOArmourPiece.getCurrentCore(stack) != null ? ((ItemCore) ItemEXOArmourPiece.getCurrentCore(stack).getItem()).getCoreName(stack) : "Null";
	}
}