package com.exo.api;

import java.util.List;

import net.minecraft.client.Minecraft;
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
	
	public static final void setArmourCore(ItemStack armour, ItemStack core){
		if(armour.stackTagCompound == null){
			armour.setTagCompound(new NBTTagCompound());
		}
		
		NBTTagCompound tag = armour.stackTagCompound;
		NBTTagCompound comp = new NBTTagCompound();
		core.writeToNBT(comp);
		
		tag.setTag("core", comp);
	}
	
	public static final ItemStack getArmourCore(ItemStack armour){
		if(armour.stackTagCompound == null){
			armour.setTagCompound(new NBTTagCompound());
		}
		
		NBTTagCompound tag = armour.stackTagCompound;
		
		if(tag.hasKey("core")){
			NBTTagCompound comp = tag.getCompoundTag("core");
			return ItemStack.loadItemStackFromNBT(comp);
		} else{
			return null;
		}
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean flag){
		Minecraft mc = FMLClientHandler.instance().getClient();
		
		if(mc.gameSettings.isKeyDown(mc.gameSettings.keyBindSneak)){
			if(ItemEXOArmourPiece.getArmourCore(stack) != null){
				list.add(String.format("Core: %s", ((ItemCore) ItemEXOArmourPiece.getArmourCore(stack).getItem()).getCoreType().name()));
			}
		}
	}
}