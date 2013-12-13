package com.exo.api;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatMessageComponent;
import net.minecraft.world.World;

import com.exo.core.TabEXO;

public class ItemCore extends Item{
	private final Item fullCore;
	private final TechTree tree;
	
	public ItemCore(int id, Item fullCore, TechTree tree){
		super(id);
		this.tree = tree;
		this.fullCore = fullCore;
		this.setUnlocalizedName("itemCore");
		this.setCreativeTab(TabEXO.tabEXO);
		this.setMaxStackSize(1);
	}
	
	public TechTree getTree(){
		return this.tree;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player){
		if(this.fullCore != null){
			if(player.experienceLevel >= 10){
				player.experienceLevel -= 10;
				player.inventory.mainInventory[player.inventory.currentItem] = new ItemStack(this.fullCore);
			} else{
				player.sendChatToPlayer(ChatMessageComponent.createFromText("Not enough XP: " + player.experienceLevel));
			}
		}
		return super.onItemRightClick(stack, world, player);
	}
}