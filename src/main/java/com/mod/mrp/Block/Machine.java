package com.mod.mrp.Block;

import org.lwjgl.opengl.GL11;

import com.mod.mrp.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;




public class Machine extends GuiScreen {
    
        ResourceLocation machine;
    int guiWidth = 148;
    int guiHeigth = 80;
    
    public Machine() {

        machine = new ResourceLocation(Reference.MOD_ID + ":textures/gui/test.png");
    }
    @Override
    public void drawScreen(int x, int y, float ticks) {
        int guiX = (width - guiWidth) / 2;
        int guiY = (height - guiHeigth) / 2;
        GL11.glColor4f(1, 1, 1, 1);
        drawDefaultBackground();
        Minecraft.getMinecraft().renderEngine.bindTexture(machine);
        drawTexturedModalRect(0, 0, 0, 0, 500, 500);
        super.drawScreen(x, y, ticks);
    }
}