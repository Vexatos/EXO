package com.exo.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

import com.exo.core.TabEXO;

public final class ItemToolbox extends Item{
	private Icon[] textures;
	
	public static final String[] TOOLBOX_NAMES = new String[]{
		"Default", "Red"
	};
	
	public ItemToolbox(int id){
		super(id);
		this.setUnlocalizedName("itemToolbox");
		this.setHasSubtypes(true);
		this.setCreativeTab(TabEXO.tabEXO);
	}
	
	@Override
	public Icon getIconFromDamage(int damage){
		return this.textures[damage];
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack){
		return "itemToolbox" + ItemToolbox.TOOLBOX_NAMES[stack.getItemDamage()];
	}
	
	@Override
	public void getSubItems(int id, CreativeTabs tab, List list){
		for(int i = 0; i < ItemToolbox.TOOLBOX_NAMES.length; i++){
			list.add(new ItemStack(id, 1, i));
		}
	}
	
	@Override
	public void registerIcons(IconRegister register){
		this.textures = new Icon[]{
				register.registerIcon("exo:tool/toolbox"), register.registerIcon("exo:tool/toolboxRed")
		};
	}
}