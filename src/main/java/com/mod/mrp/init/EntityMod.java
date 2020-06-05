package com.mod.mrp.init;

import com.mod.mrp.Reference;
import com.mod.mrp.tileentity.TileEntityBlockTesr;

import cpw.mods.fml.common.registry.GameRegistry;

public class EntityMod
{
    public static void init ()
    {
        GameRegistry.registerTileEntity(TileEntityBlockTesr.class, Reference.MOD_ID+":blockTesr.png");
    }
}
