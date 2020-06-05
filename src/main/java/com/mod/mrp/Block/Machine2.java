package com.mod.mrp.Block;

import com.mod.mrp.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;




public class Machine2 extends GuiScreen {
    ResourceLocation machine;
    int guiWidth = 148;
    int guiHeigth = 80;
    
    public Machine2() {

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