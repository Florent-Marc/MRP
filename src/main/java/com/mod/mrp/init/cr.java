package com.mod.mrp.init;

import com.mod.mrp.Moda;
import com.mod.mrp.Reference;
import com.mod.mrp.items.ItemFoodMod;
import com.sun.org.apache.xpath.internal.operations.Mod;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.world.World;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
public class cr extends ItemSword {




    public cr(ToolMaterial material)
    {
        super(material);
        // TODO Auto-generated constructor stub
    }
    

    @Override
    @SideOnly(Side.CLIENT)
    public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer entity) {
        Minecraft.getMinecraft().displayGuiScreen(new GuiScreen());
        return item;
    }

}
