package com.exo.client.render

import org.lwjgl.opengl.GL11
import com.exo.blocks.model.ModelAssembler
import cpw.mods.fml.client.FMLClientHandler
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer
import net.minecraft.tileentity.TileEntity
import net.minecraft.util.ResourceLocation
import com.exo.lib.helper.RotationHelper
import com.exo.tile.TileAssembler
import net.minecraftforge.client.IItemRenderer
import cpw.mods.fml.relauncher.SideOnly
import cpw.mods.fml.relauncher.Side
import net.minecraft.item.ItemStack
import net.minecraftforge.client.IItemRenderer.ItemRenderType
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper
import net.minecraft.client.renderer.RenderHelper

object RenderAssembler {
  private val TEXTURE: ResourceLocation = new ResourceLocation("exo", "textures/block/machine/assembler.png");
  private val BIND = (x: ResourceLocation) => {FMLClientHandler.instance().getClient().renderEngine.bindTexture(x)};
  
  @SideOnly(Side.CLIENT)
  class TESRAssembler extends TileEntitySpecialRenderer{
    val model: ModelAssembler = new ModelAssembler();
    
    override def renderTileEntityAt(tile: TileEntity, x: Double, y: Double, z: Double, scale: Float){
      BIND(TEXTURE);
      GL11.glPushMatrix();
      GL11.glEnable(GL11.GL_LIGHTING);
      GL11.glTranslatef(x.asInstanceOf[Float] + 0.5F, y.asInstanceOf[Float] + 1.5F, z.asInstanceOf[Float] + 0.5F);
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      GL11.glRotatef(RotationHelper.getTheta(tile.asInstanceOf[TileAssembler].getRotation()), 0.0F, 1.0F, 0.0F);
      this.model.render();
      GL11.glDisable(GL11.GL_LIGHTING);
      GL11.glPopMatrix();
    }
  }
  
  @SideOnly(Side.CLIENT)
  class IIRAssembler extends IItemRenderer{
    private val model: ModelAssembler = new ModelAssembler();
    
    override def handleRenderType(stack: ItemStack, ty: ItemRenderType): Boolean={
      return true;
    }
    
    override def shouldUseRenderHelper(ty: ItemRenderType, stack: ItemStack, helper: ItemRendererHelper): Boolean={
      return true;
    }
    
    override def renderItem(ty: ItemRenderType, stack: ItemStack, data: Object*){
      ty match
      {
        case ItemRenderType.ENTITY=>{
          BIND(TEXTURE);
          GL11.glPushMatrix();
          GL11.glEnable(GL11.GL_LIGHTING);
          GL11.glScalef(0.75F, 0.75F, 0.75F);
          GL11.glTranslatef(0.0F, 0.65F, 0.F);
          GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
          this.model.render();
          GL11.glDisable(GL11.GL_LIGHTING);
          GL11.glPopMatrix();
          return;
        };
        case ItemRenderType.EQUIPPED=>{
          BIND(TEXTURE);
          GL11.glPushMatrix();
          GL11.glEnable(GL11.GL_LIGHTING);
          GL11.glScalef(0.75F, 0.75F, 0.75F);
          GL11.glTranslatef(0.0F, 0.65F, 0.0F);
          GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
          this.model.render();
          GL11.glDisable(GL11.GL_LIGHTING);
          GL11.glPopMatrix();
          return;
        };
        case ItemRenderType.INVENTORY=>{
          BIND(TEXTURE);
          GL11.glPushMatrix();
          GL11.glEnable(GL11.GL_LIGHTING);
          GL11.glScalef(0.75F, 0.75F, 0.75F);
          GL11.glTranslatef(0.0F, 0.65F, 0.0F);
          GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
          this.model.render();
          GL11.glDisable(GL11.GL_LIGHTING);
          GL11.glPopMatrix();
          return;
        };
        case _=>{
          return;
        };
      }
    }
  }
}