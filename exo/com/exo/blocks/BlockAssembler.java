package com.exo.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

import com.exo.api.ItemEXOArmourPiece;
import com.exo.core.TabEXO;
import com.exo.core.helper.RotationHelper;
import com.exo.items.EXOItems;
import com.exo.tile.TileAssembler;

public final class BlockAssembler extends BlockContainer{
	private Icon texture;
	
	public BlockAssembler(int id){
		super(id, Material.iron);
		this.setUnlocalizedName("blockAssembler");
		this.setCreativeTab(TabEXO.tabEXO);
		this.setStepSound(this.soundMetalFootstep);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
	}
	
	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase living, ItemStack stack){
		if(world.getBlockTileEntity(x, y, z) != null){
			((TileAssembler) world.getBlockTileEntity(x, y, z)).setRotation(RotationHelper.determine3DRotation(world, x, y, z, living));
		}
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float f, float j, float k){
		if(player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() instanceof ItemEXOArmourPiece){
			ItemEXOArmourPiece.setCurrentCore(player.inventory.armorItemInSlot(0), new ItemStack(EXOItems.ITEM_CORE, 1, 1));
			return super.onBlockActivated(world, x, y, z, player, i, f, j, k);
		} else{
			return super.onBlockActivated(world, x, y, z, player, i, f, j, k);
		}
	}
	
	@Override
	public Icon getIcon(int side, int meta){
		return this.texture;
	}
	
	@Override
	public void registerIcons(IconRegister register){
		this.texture = register.registerIcon("exo:machine/assembler");
	}
	
	@Override
	public TileEntity createNewTileEntity(World world){
		return new TileAssembler();
	}
	
	@Override
	public boolean isOpaqueCube(){
		return false;
	}
	
	@Override
	public boolean renderAsNormalBlock(){
		return false;
	}
	
	@Override
	public int getRenderType(){
		return -1;
	}
	
	@Override
	public int getRenderBlockPass(){
		return 1;
	}
}