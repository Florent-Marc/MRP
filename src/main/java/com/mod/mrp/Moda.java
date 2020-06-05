package com.mod.mrp;

import com.mod.mrp.init.BlockMod;
import com.mod.mrp.init.EntityMod;
import com.mod.mrp.init.EventsMod;
import com.mod.mrp.init.ItemMod;
import com.mod.mrp.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

@Mod (modid = Reference.MOD_ID, name = Reference.MOD_NAME,version = Reference.VERSION)

public class Moda
{
    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.CLIENT_PROXY)
    public static CommonProxy proxy;
    
    public static CreativeTabs Tabs = new CreativeTabs("mrp")
    {
        @java.lang.Override
        public Item func_78016_d() {
            return null;
        }

        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            
           return ItemMod.icone;
         }
            
         };
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ItemMod.init();
        ItemMod.register();
        BlockMod.init();
        BlockMod.register();
        EventsMod.init();
        
    }
        
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.registerRenders();
        EntityMod.init();
    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        
    }
  }
