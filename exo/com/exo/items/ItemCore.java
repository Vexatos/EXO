package com.exo.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.exo.api.EnumEXOCoreType;
import com.exo.api.ItemEXOArmourPiece;
import com.exo.core.TabEXO;

public final class ItemCore extends Item{
	private final EnumEXOCoreType coreType;
	
	public ItemCore(int id, EnumEXOCoreType coreType){
		super(id);
		this.coreType = coreType;
		this.setUnlocalizedName("itemCore");
		this.setCreativeTab(TabEXO.tabEXO);
		this.setMaxStackSize(1);
	}
	
	public EnumEXOCoreType getCoreType(){
		return this.coreType;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player){
		if(player.inventory.armorItemInSlot(0).getItem() instanceof ItemEXOArmourPiece){
			ItemEXOArmourPiece.setArmourCore(player.inventory.armorItemInSlot(0), stack);
		}
		return super.onItemRightClick(stack, world, player);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack){
		return "itemCore" + this.coreType.name();
	}
	
	@Override
	public void registerIcons(IconRegister register){
		this.itemIcon = register.registerIcon(this.getCoreType().getCorePath());
	}
}