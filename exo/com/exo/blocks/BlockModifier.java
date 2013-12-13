package com.exo.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.exo.core.TabEXO;
import com.exo.tile.TileModifier;

public final class BlockModifier extends BlockContainer{
	public BlockModifier(int id){
		super(id, Material.iron);
		this.setUnlocalizedName("blockModifier");
		this.setCreativeTab(TabEXO.tabEXO);
		this.setStepSound(this.soundMetalFootstep);
	}
	
	@Override
	public TileEntity createNewTileEntity(World world){
		return new TileModifier();
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