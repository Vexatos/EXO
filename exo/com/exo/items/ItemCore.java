package com.exo.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

import com.exo.api.EnumEXOCoreType;
import com.exo.api.ItemEXOArmourPiece;
import com.exo.core.TabEXO;

public final class ItemCore extends Item{
	private Icon[] textures;
	
	public ItemCore(int id){
		super(id);
		this.setUnlocalizedName("itemCore");
		this.setCreativeTab(TabEXO.tabEXO);
		this.setHasSubtypes(true);
		this.setMaxStackSize(1);
	}
	
	@Override
	public Icon getIconFromDamage(int damage){
		return this.textures[damage];
	}
	
	@Override
	public void getSubItems(int id, CreativeTabs tab, List list){
		for(int i = 0; i < EnumEXOCoreType.values().length; i++){
			list.add(new ItemStack(id, 1, i));
		}
	}
	
	public EnumEXOCoreType getCoreType(){
		return null;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player){
		if(player.inventory.armorItemInSlot(1).getItem() instanceof ItemEXOArmourPiece){
			ItemEXOArmourPiece.setArmourCore(player.inventory.armorItemInSlot(1), stack);
		}
		return super.onItemRightClick(stack, world, player);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack){
		return "itemCore" + this.getCoreType().name();
	}
	
	@Override
	public void registerIcons(IconRegister register){
		this.textures = new Icon[EnumEXOCoreType.values().length];
		
		for(int i = 0; i < EnumEXOCoreType.values().length; i++){
			this.textures[i] = register.registerIcon(EnumEXOCoreType.values()[i].getCorePath());
		}
	}
}