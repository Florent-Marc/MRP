package com.mod.mrp.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelBlockTesr extends ModelBase
{
    public ModelRenderer shape1;
    public ModelRenderer shape2;
    public ModelRenderer shape21;
    public ModelRenderer shape22;
    public ModelRenderer shape3;
    public ModelRenderer shape4;
    public ModelRenderer shape5;
    public ModelRenderer shape6;
    public ModelRenderer shape61;
    public ModelRenderer shape7;
    public ModelRenderer shape71;
    public ModelRenderer shape77;
    public ModelRenderer shape78;
  
  public ModelBlockTesr()
  {
      this.textureWidth = 64;
      this.textureHeight = 32;
    
      this.shape1 = new ModelRenderer(this, 6, 8);
      this.shape1.mirror = true;
      this.shape1.addBox(0F, 0F, 0F, 1, 14, 1);
      this.shape1.setRotationPoint(7F, 10F, -8F);
      this.shape1.setTextureSize(64, 32);
      setRotation(this.shape1, 0F, 0F, 0F);

      this.shape2 = new ModelRenderer(this, 18, 8);
      this.shape2.mirror = true;
      this.shape2.addBox(0F, 0F, 0F, 1, 14, 1);
      this.shape2.setRotationPoint(7F, 10F, 7F);
      this.shape2.setTextureSize(64, 32);
      setRotation(this.shape2, 0F, 0F, 0F);

      this.shape21 = new ModelRenderer(this, 0, 8);
      this.shape21.mirror = true;
      this.shape21.addBox(0F, 0F, 0F, 1, 14, 1);
      this.shape21.setRotationPoint(-8F, 10F, -8F);
      this.shape21.setTextureSize(64, 32);
      setRotation(this.shape21, 0F, 0F, 0F);

      this.shape22 = new ModelRenderer(this, 12, 8);
      this.shape22.mirror = true;
      this.shape22.addBox(0F, 0F, 0F, 1, 14, 1);
      this.shape22.setRotationPoint(-8F, 10F, 7F);
      this.shape22.setTextureSize(64, 32);
      setRotation(this.shape22, 0F, 0F, 0F);

      this.shape3 = new ModelRenderer(this, 0, 24);
      this.shape3.mirror = true;
      this.shape3.addBox(0F, 0F, 0F, 16, 1, 6);
      this.shape3.setRotationPoint(-8F, 10F, 2F);
      this.shape3.setTextureSize(64, 32);
      setRotation(this.shape3, 0F, 0F, 0F);

      this.shape4 = new ModelRenderer(this, 0, 0);
      this.shape4.mirror = true;
      this.shape4.addBox(0F, 0F, 0F, 16, 1, 7);
      this.shape4.setRotationPoint(-8F, 10F, -8F);
      this.shape4.setTextureSize(64, 32);
      setRotation(this.shape4, 0F, 0F, 0F);

      this.shape5 = new ModelRenderer(this, 25, 9);
      this.shape5.mirror = true;
      this.shape5.addBox(0F, 0F, 0F, 1, 1, 3);
      this.shape5.setRotationPoint(0F, 10F, -1F);
      this.shape5.setTextureSize(64, 32);
      setRotation(this.shape5, 0F, 0F, 0F);

      this.shape6 = new ModelRenderer(this, 47, 5);
      this.shape6.mirror = true;
      this.shape6.addBox(0F, 0F, 0F, 4, 1, 3);
      this.shape6.setRotationPoint(4F, 10F, -1F);
      this.shape6.setTextureSize(64, 32);
      setRotation(this.shape6, 0F, 0F, 0F);

      this.shape61 = new ModelRenderer(this, 47, 0);
      this.shape61.mirror = true;
      this.shape61.addBox(0F, 0F, 0F, 5, 1, 3);
      this.shape61.setRotationPoint(-8F, 10F, -1F);
      this.shape61.setTextureSize(64, 32);
      setRotation(this.shape61, 0F, 0F, 0F);

      this.shape7 = new ModelRenderer(this, 46, 23);
      this.shape7.mirror = true;
      this.shape7.addBox(0F, 0F, 0F, 1, 7, 1);
      this.shape7.setRotationPoint(0F, 7F, 0F);
      this.shape7.setTextureSize(64, 32);
      setRotation(this.shape7, 0F, 0F, 0F);

      this.shape71 = new ModelRenderer(this, 47, 9);
      this.shape71.mirror = true;
      this.shape71.addBox(0F, 0F, 0F, 1, 7, 1);
      this.shape71.setRotationPoint(4F, 10F, 0F);
      this.shape71.setTextureSize(64, 32);
      setRotation(this.shape71, 0F, 0F, 1.578955F);

      this.shape77 = new ModelRenderer(this, 58, 23);
      this.shape77.mirror = true;
      this.shape77.addBox(0F, 0F, 0F, 1, 7, 1);
      this.shape77.setRotationPoint(2F, 7F, 0F);
      this.shape77.setTextureSize(64, 32);
      setRotation(this.shape77, 0F, 0F, 0.5911399F);

      this.shape78 = new ModelRenderer(this, 51, 23);
      this.shape78.mirror = true;
      this.shape78.addBox(0F, 0F, 0F, 1, 7, 1);
      this.shape78.setRotationPoint(-1.6F, 7.7F, 0F);
      this.shape78.setTextureSize(64, 32);
      setRotation(this.shape78, 0F, 0F, -0.4879693F);
  }
  
  public void renderAll()
  {
    this.shape1.render(0.0625F);
    this.shape2.render(0.0625F);
    this.shape21.render(0.0625F);
    this.shape22.render(0.0625F);
    this.shape3.render(0.0625F);
    this.shape4.render(0.0625F);
    this.shape5.render(0.0625F);
    this.shape6.render(0.0625F);
    this.shape61.render(0.0625F);
    this.shape7.render(0.0625F);
    this.shape71.render(0.0625F);
    this.shape77.render(0.0625F);
    this.shape78.render(0.0625F);
  }
  
  public static void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
}
