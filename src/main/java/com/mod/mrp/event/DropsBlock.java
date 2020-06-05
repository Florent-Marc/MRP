package com.mod.mrp.event;

import com.mod.mrp.Moda;
import com.mod.mrp.init.BlockMod;
import com.mod.mrp.init.ItemMod;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;

public class DropsBlock
{
    @SubscribeEvent
    public void blockDestroyed(HarvestDropsEvent events)
    {
        if(events.block == BlockMod.plantecana)
        {
            events.drops.clear();
            events.drops.add(new ItemStack(ItemMod.cana));
           
        }
        if(events.block == Blocks.diamond_ore)
        {
            events.drops.clear();
            events.drops.add(new ItemStack(ItemMod.nt));
        }
       
    }
}
