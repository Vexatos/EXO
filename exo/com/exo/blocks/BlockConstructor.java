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

import com.exo.Exoskeleton;
import com.exo.core.TabEXO;
import com.exo.core.helper.RotationHelper;
import com.exo.tile.TileConstructor;

public final class BlockConstructor extends BlockContainer{
	private Icon texture;
	
	public BlockConstructor(int id){
		super(id, Material.iron);
		this.setUnlocalizedName("blockConstructor");
		this.setCreativeTab(TabEXO.tabEXO);
		this.setStepSound(this.soundMetalFootstep);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.2F, 1.0F);
	}
	
	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase living, ItemStack stack){
		if(world.getBlockTileEntity(x, y, z) != null){
			((TileConstructor) world.getBlockTileEntity(x, y, z)).setRotation(RotationHelper.determine3DRotation(world, x, y, z, living));
		}
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float f, float j, float k){
		player.openGui(Exoskeleton.INSTANCE, 1, world, x, y, z);
		return super.onBlockActivated(world, x, y, z, player, i, f, j, k);
	}
	
	@Override
	public TileEntity createNewTileEntity(World world){
		return new TileConstructor();
	}
	
	@Override
	public Icon getIcon(int side, int meta){
		return this.texture;
	}
	
	@Override
	public boolean isOpaqueCube(){
		return false;
	}
	
	@Override
	public void registerIcons(IconRegister register){
		this.texture = register.registerIcon("exo:machine/constructor");
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