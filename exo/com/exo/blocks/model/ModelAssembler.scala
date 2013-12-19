package com.exo.blocks.model

import com.exo.api.Model
import net.minecraft.client.model.ModelBase
import net.minecraft.client.model.ModelRenderer
import net.minecraft.entity.Entity

class ModelAssembler extends ModelBase with Model{
  this.textureWidth = 128;
  this.textureHeight = 64;
  
  private val arm1: ModelRenderer = new ModelRenderer(this, 56, 0);
  private val arm2: ModelRenderer = new ModelRenderer(this, 56, 0);
  private val arm3: ModelRenderer = new ModelRenderer(this, 56, 0);
  private val arm4: ModelRenderer = new ModelRenderer(this, 56, 0);
  private val bottomPlate: ModelRenderer = new ModelRenderer(this, 0, 28);
  private val topPlate: ModelRenderer = new ModelRenderer(this, 0, 28);
  private val centerBlock: ModelRenderer = new ModelRenderer(this, 0, 0);
  private val rightAngle: ModelRenderer = new ModelRenderer(this, 88, 5);
  private val smallPlate: ModelRenderer = new ModelRenderer(this, 64, 43);
  private val backPlate: ModelRenderer = new ModelRenderer(this, 0, 45);
  private val leftAngle: ModelRenderer = new ModelRenderer(this, 88, 5);
  this.init();
  
  private def init(){
    this.arm1.addBox(0.0F, 0.0F, 0.0F, 1, 14, 1);
    this.arm1.setRotationPoint(-8.0F, 9.0F, -8.0F);
    this.arm1.setTextureSize(128, 64);
    this.arm1.mirror = true;
    this.setRotation(this.arm1, 0.0F, 0.0F, 0.0F);
    
    this.arm2.addBox(0.0F, 0.0F, 0.0F, 1, 14, 1);
    this.arm2.setRotationPoint(-8.0F, 9.0F, 7.0F);
    this.arm2.setTextureSize(128, 64);
    this.arm2.mirror = true;
    this.setRotation(this.arm2, 0.0F, 0.0F, 0.0F);
    
    this.arm3.addBox(0.0F, 0.0F, 0.0F, 1, 14, 1);
    this.arm3.setRotationPoint(7.0F, 9.0F, -8.0F);
    this.arm3.setTextureSize(128, 64);
    this.arm3.mirror = true;
    this.setRotation(this.arm3, 0.0F, 0.0F, 0.0F);
    
    this.arm4.addBox(0.0F, 0.0F, 0.0F, 1, 14, 1);
    this.arm4.setRotationPoint(7.0F, 9.0F, 7.0F);
    this.arm4.setTextureSize(128, 64);
    this.arm4.mirror = true;
    this.setRotation(this.arm4, 0.0F, 0.0F, 0.0F);
    
    this.bottomPlate.addBox(0.0F, 0.0F, 0.0F, 16, 1, 16);
    this.bottomPlate.setRotationPoint(-8.0F, 23.0F, -8.0F);
    this.bottomPlate.setTextureSize(128, 64);
    this.bottomPlate.mirror = true;
    this.setRotation(this.bottomPlate, 0.0F, 0.0F, 0.0F);
    
    this.topPlate.addBox(0.0F, 0.0F, 0.0F, 16, 1, 16);
    this.topPlate.setRotationPoint(-8.0F, 8.0F, -8.0F);
    this.topPlate.setTextureSize(128, 64);
    this.topPlate.mirror = true;
    this.setRotation(this.topPlate, 0.0F, 0.0F, 0.0F);
    
    this.centerBlock.addBox(0.0F, 0.0F, 0.0F, 14, 14, 14);
    this.centerBlock.setRotationPoint(-7.0F, 9.0F, -7.0F);
    this.centerBlock.setTextureSize(128, 64);
    this.centerBlock.mirror = true;
    this.setRotation(this.centerBlock, 0.0F, 0.0F, 0.0F);
    
    this.rightAngle.addBox(0.0F, 0.0F, 0.0F, 1, 4, 12);
    this.rightAngle.setRotationPoint(5.0F, 5.0F, -6.0F);
    this.rightAngle.setTextureSize(128, 64);
    this.rightAngle.mirror = true;
    this.setRotation(this.rightAngle, 0.1745329F, 0.0F, 0.0F);
    
    this.smallPlate.addBox(0.0F, 0.0F, 0.0F, 14, 1, 14);
    this.smallPlate.setRotationPoint(-7.0F, 7.0F, -7.0F);
    this.smallPlate.setTextureSize(128, 64);
    this.smallPlate.mirror = true;
    this.setRotation(this.smallPlate, 0.0F, 0.0F, 0.0F);
    
    this.backPlate.addBox(0.0F, 0.0F, 0.0F, 14, 10, 2);
    this.backPlate.setRotationPoint(-7.0F, -3.0F, 5.0F);
    this.backPlate.setTextureSize(128, 64);
    this.backPlate.mirror = true;
    this.setRotation(this.backPlate, 0.0F, 0.0F, 0.0F);
  }
  
  private def setRotation(model: ModelRenderer, x: Float, y: Float, z: Float){
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  override def render(entity: Entity, f: Float, f1: Float, f2: Float, f3: Float, f4: Float, f5: Float){
    super.render(entity, f, f1, f2, f3, f4, f5);
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.arm1.render(f5);
    this.arm2.render(f5);
    this.arm3.render(f5);
    this.arm4.render(f5);
  }
  
  override def render(f5: Float){
    
  }
  
  override def render(){
    this.render(0.0625F);
  }
}