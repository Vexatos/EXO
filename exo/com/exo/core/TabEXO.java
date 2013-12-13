package com.exo.core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public final class TabEXO{
	private TabEXO(){}
	
	public static final CreativeTabs tabEXO = new Tab("Exoskeleton").setIcon(new ItemStack(Item.diamond));
	
	private final static class Tab extends CreativeTabs{
		private int itemID, meta;
		
		private Tab(String label){
			super(label);
		}
		
		private Tab setIcon(int id, int meta){
			this.itemID = id;
			this.meta = meta;
			return this;
		}
		
		private Tab setIcon(ItemStack stack){
			return this.setIcon(stack.itemID, stack.getItemDamage());
		}
		
		@Override
		public ItemStack getIconItemStack(){
			return new ItemStack(this.itemID, 1, this.meta);
		}
		
		@Override
		public String getTranslatedTabLabel(){
			return super.getTabLabel();
		}
	}
}