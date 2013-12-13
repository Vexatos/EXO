package com.exo.items;

import java.util.List;
import java.util.Map;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

import com.exo.api.techtree.TechTree;
import com.exo.core.TabEXO;
import com.exo.core.techtree.DefaultTechTree;
import com.google.common.collect.ImmutableMap;

public final class ItemCore extends Item{
	private final Map<Integer, String> NAME_MAP = new ImmutableMap.Builder<Integer, String>()
			.put(0, "Dull")
			.put(1, "Default").build();
	
	private final Map<Integer, TechTree> TREE_MAP = new ImmutableMap.Builder<Integer, TechTree>()
			.put(0, new DefaultTechTree())
			.put(1, new DefaultTechTree()).build();
	
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
		if(player.inventory.armorInventory[0] == new ItemStack(EXOItems.ITEM_SUIT_UNCHARGED_HELM)){
			ItemEXOArmourPiece.setCurrentCore(player.inventory.armorInventory[0], new ItemStack(this, 1, 0));
		}
		return super.onItemRightClick(stack, world, player);
	}
	
	@Override
	public Icon getIconFromDamage(int damage){
		return this.textures[damage];
	}
	
	public TechTree getTechTreeFromDamage(int damage){
		return this.TREE_MAP.get(damage);
	}
	
	public String getCoreName(ItemStack stack){
		return this.NAME_MAP.get(stack.getItemDamage());
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack){
		return "itemCore" + this.NAME_MAP.get(stack.getItemDamage());
	}
	
	@Override
	public void getSubItems(int id, CreativeTabs tab, List list){
		for(int i = 0; i < this.NAME_MAP.size(); i++){
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