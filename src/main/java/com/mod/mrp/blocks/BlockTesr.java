package com.mod.mrp.blocks;

import com.mod.mrp.proxy.ClientProxy;
import com.mod.mrp.tileentity.TileEntityBlockTesr;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockTesr extends Block
{

    protected BlockTesr(Material p_i45394_1_)
    {
        super(p_i45394_1_);
        // TODO Auto-generated constructor stub
    }
/*
    public BlockTesr(Material p_i45394_1_)
    {
        super(p_i45394_1_);
        // TODO Auto-generated constructor stub
    }
    @Override
    public TileEntity createTileEntity(World world, int metadata)
    {
    return new TileEntityBlockTesr();
    }

    @Override
    public boolean hasTileEntity(int metadata)
    {
        return true;
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    public int getRenderType()
    {
        return ClientProxy.renderTesr;
    }*/
}

