package com.exo.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatMessageComponent;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

import com.exo.core.TabEXO;

import cpw.mods.fml.client.FMLClientHandler;

public final class ItemUpgradeLink extends Item{
	private Icon[] textures;
	
	public static final String[] UPGRADE_LINK_NAMES = new String[]{
		"Dead", "Uncharged"
	};
	
	public ItemUpgradeLink(int id){
		super(id);
		this.setUnlocalizedName("itemUpgradeLink");
		this.setHasSubtypes(true);
		this.setCreativeTab(TabEXO.tabEXO);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player){
		if(stack.getItem() instanceof ItemUpgradeLink){
			if(stack.getItemDamage() == 0){
				if(world.isRemote){
					player.inventory.mainInventory[player.inventory.currentItem] = new ItemStack(stack.getItem(), 1, 1);
					return super.onItemRightClick(stack, world, player);
				}
				
				if(player.experienceLevel >= 10){
					player.experienceLevel -= 10;
					player.inventory.mainInventory[player.inventory.currentItem] = new ItemStack(stack.getItem(), 1, 1);
					return super.onItemRightClick(stack, world, player);
				} else{
					player.sendChatToPlayer(ChatMessageComponent.createFromText("Not enough experience, you need 10 levels"));
					return super.onItemRightClick(stack, world, player);
				}
			} else{
				player.sendChatToPlayer(ChatMessageComponent.createFromText("Already charged"));
				return super.onItemRightClick(stack, world, player);
			}
		} else{
			return super.onItemRightClick(stack, world, player);
		}
	}
	
	@Override
	public Icon getIconFromDamage(int damage){
		return this.textures[damage];
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack){
		return stack.getItemDamage() == 0 ? "itemUpgradeLinkDead" : "itemUpgradeLinkCharged";
	}
	
	@Override
	public void getSubItems(int id, CreativeTabs tab, List list){
		for(int i = 0; i < ItemUpgradeLink.UPGRADE_LINK_NAMES.length; i++){
			list.add(new ItemStack(id, 1, i));
		}
	}
	
	@Override
	public void registerIcons(IconRegister register){
		this.textures = new Icon[]{
			register.registerIcon("exo:ulDead"),
			register.registerIcon("exo:ulCharged")
		};
	}
}