package com.mod.mrp.init;


import com.mod.mrp.Moda;
import com.mod.mrp.Reference;
//import com.mod.mrp.Block.Machine;
import com.mod.mrp.blocks.BlockBasic;
import com.mod.mrp.blocks.BlockCropsMod;
import com.mod.mrp.blocks.BlockTesr;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockMod
{
    public static Block block_on,block_uraniumb,block_1;
    public static Block plantecana,pp;
    //blockTesr;
    //public static Block gui;
    public static Block metal;
    public static Block troll;
    
    
    public static void init()
    {
        block_on = new BlockBasic(Material.rock).setBlockName("serveron").setCreativeTab(Moda.Tabs).setBlockTextureName(Reference.MOD_ID + ":serveron");
        block_1 = new BlockBasic(Material.rock).setBlockName("1").setCreativeTab(Moda.Tabs).setBlockTextureName(Reference.MOD_ID + ":testbbb");
        block_uraniumb = new BlockBasic(Material.rock).setBlockName("uranium").setCreativeTab(Moda.Tabs).setBlockTextureName(Reference.MOD_ID + ":uraniumb").setHardness(10);
        plantecana = new BlockCropsMod().setBlockName("plantecana").setCreativeTab(Moda.Tabs).setBlockTextureName(Reference.MOD_ID + ":plantecana");
        pp = new BlockCropsMod().setBlockName("pp").setCreativeTab(Moda.Tabs).setBlockTextureName(Reference.MOD_ID + ":pp");
        //blockTesr = new BlockTesr(Material.rock).setCreativeTab(Moda.Tabs).setBlockName("blockTesr").setBlockTextureName(Reference.MOD_ID+":blockTesr");
        //gui = new Machine().getUnlocalizedName(gui).setCreativeTab(Moda.Tabs);
        metal = new BlockBasic(Material.rock).setBlockName("metal").setCreativeTab(Moda.Tabs).setBlockTextureName(Reference.MOD_ID+":metal");
        troll = new BlockBasic(Material.rock).setBlockName("troll").setCreativeTab(Moda.Tabs).setBlockTextureName(Reference.MOD_ID+":troll");
    }
    
    public static void register()
    {

        GameRegistry.registerBlock(block_on, block_on.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(block_1, block_1.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(block_uraniumb, block_uraniumb.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(plantecana, plantecana.getUnlocalizedName().substring(5));
        //GameRegistry.registerBlock(blockTesr,blockTesr.getUnlocalizedName().substring(5));
        //GameRegistry.registerBlock(gui, "gui");
        GameRegistry.registerBlock(metal, metal.getUnlocalizedName().substring(4));
        GameRegistry.registerBlock(troll, troll.getUnlocalizedName().substring(4));
        //GameRegistry.addRecipe(new  ItemStack(Items.string, 9), new Object[] {"###","###","###", "#",Blocks.wool});
    }
}