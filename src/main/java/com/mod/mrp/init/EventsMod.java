package com.mod.mrp.init;

import com.mod.mrp.event.DropsBlock;

import net.minecraftforge.common.MinecraftForge;

public class EventsMod
{
    public static void init()
    {
    MinecraftForge.EVENT_BUS.register(new DropsBlock());
    }

}
