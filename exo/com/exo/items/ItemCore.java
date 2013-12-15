package com.exo.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

import com.exo.Exoskeleton;
import com.exo.api.techtree.TechTree;
import com.exo.core.TabEXO;

public final class ItemCore extends Item{
	public static final String[] CORE_NAMES = new String[]{
		"Dull", "Charged"
	};
	
	private Icon[] textures;
	
	public ItemCore(int id){
		super(id);
		this.setUnlocalizedName("itemCore");
		this.setCreativeTab(TabEXO.tabEXO);
		this.setMaxStackSize(1);
		this.setHasSubtypes(true);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player){
		player.openGui(Exoskeleton.INSTANCE, 1, world, player.chunkCoordX, player.chunkCoordY, player.chunkCoordZ);
		return super.onItemRightClick(stack, world, player);
	}
	
	@Override
	public Icon getIconFromDamage(int damage){
		return this.textures[damage];
	}
	
	public String getCoreName(ItemStack stack){
		return ItemCore.CORE_NAMES[stack.getItemDamage()];
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack){
		return "itemCore" + ItemCore.CORE_NAMES[stack.getItemDamage()];
	}
	
	@Override
	public void getSubItems(int id, CreativeTabs tab, List list){
		for(int i = 0; i < ItemCore.CORE_NAMES.length; i++){
			list.add(new ItemStack(id, 1, i));
		}
	}
	
	@Override
	public void registerIcons(IconRegister register){
		this.textures = new Icon[]{
				register.registerIcon("exo:core/coreEmpty"),
				register.registerIcon("exo:core/coreDefaultFull")
		};
	}
}