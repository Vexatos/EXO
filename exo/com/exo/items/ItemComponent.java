package com.exo.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

import com.exo.core.TabEXO;

public final class ItemComponent extends Item{
	private Icon[] textures;
	
	public static final String[] COMPONENT_NAMES = new String[]{
		"Chestplate", "ChestplateLeft", "ChestplateRight",
		"ConcussionCell", "CoreContainment", "CoreNodeBerzerk",
		"CoreNodeEmpty", "CoreNodeInferno", "CoreNodeRecon",
		"CoreNodeReflex", "Join", "PowerCell",
		"Resistor", "Shins", "SupportBar",
		"Toes"
	};
	
	public ItemComponent(int id){
		super(id);
		this.setUnlocalizedName("itemComponent");
		this.setHasSubtypes(true);
		this.setCreativeTab(TabEXO.tabEXO);
	}
	
	@Override
	public Icon getIconFromDamage(int damage){
		return this.textures[damage];
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack){
		return "itemComponent" + ItemComponent.COMPONENT_NAMES[stack.getItemDamage()];
	}
	
	@Override
	public void getSubItems(int id, CreativeTabs tab, List list){
		for(int i = 0; i < ItemComponent.COMPONENT_NAMES.length; i++){
			list.add(new ItemStack(id, 1, i));
		}
	}
	
	@Override
	public void registerIcons(IconRegister register){
		this.textures = new Icon[]{
			register.registerIcon("exo:component/chestplate"), register.registerIcon("exo:component/chestplateLeft"), register.registerIcon("exo:component/chestplateRight"),
			register.registerIcon("exo:component/concussionCell"), register.registerIcon("exo:component/coreContainment"), register.registerIcon("exo:component/coreNodeBerzerk"),
			register.registerIcon("exo:component/coreNodeEmpty"), register.registerIcon("exo:component/coreNodeInferno"), register.registerIcon("exo:component/coreNodeRecon"),
			register.registerIcon("exo:component/coreNodeReflex"), register.registerIcon("exo:component/joint"), register.registerIcon("exo:component/powerCell"),
			register.registerIcon("exo:component/resistor"), register.registerIcon("exo:component/shins"), register.registerIcon("exo:component/supportBar"),
			register.registerIcon("exo:component/toes")
		};
	}
}