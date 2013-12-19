package com.exo.client.render

import org.lwjgl.opengl.GL11
import com.exo.tile.TileConstructor
import cpw.mods.fml.client.FMLClientHandler
import cpw.mods.fml.relauncher.SideOnly
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer
import net.minecraft.item.ItemStack
import net.minecraft.tileentity.TileEntity
import net.minecraft.util.ResourceLocation
import net.minecraftforge.client.IItemRenderer
import net.minecraftforge.client.IItemRenderer.ItemRenderType
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper
import com.exo.lib.helper.RotationHelper
import cpw.mods.fml.relauncher.Side

object RenderConstructor{
  val TEXTURE: ResourceLocation = new ResourceLocation("exo", "textures/block/machine/constructor.png");
  private val BIND = (x: ResourceLocation) => {FMLClientHandler.instance().getClient().renderEngine.bindTexture(x)};
  
  @SideOnly(Side.CLIENT)
  class TESRConstructor extends TileEntitySpecialRenderer{
    // private val model: ModelConstructor = new ModelConstructor();
    
    override def renderTileEntityAt(tile: TileEntity, x: Double, y: Double, z: Double, scale: Float){
      BIND(TEXTURE);
      GL11.glPushMatrix();
      GL11.glEnable(GL11.GL_LIGHTING);
      GL11.glTranslatef(x.asInstanceOf[Float] + 0.5F, y.asInstanceOf[Float] + 1.5F, z.asInstanceOf[Float] + 0.5F);
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      GL11.glRotatef(RotationHelper.getTheta(tile.asInstanceOf[TileConstructor].getRotation()), 0.0F, 1.0F, 0.0F);
      // this.model.render();
      GL11.glDisable(GL11.GL_LIGHTING);
      GL11.glPopMatrix();
    }
  }
  
  @SideOnly(Side.CLIENT)
  class IIRConstructor extends IItemRenderer{
    // private val model: ModelConstructor = new ModelConstructor();
    
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
          GL11.glScalef(1.0F, 1.0F, 1.0F);
          GL11.glTranslatef(0.0F, 0.7F, 0.0F);
          GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
          // this.model.render();
          GL11.glDisable(GL11.GL_LIGHTING);
          GL11.glPopMatrix();
          return;
        };
        case ItemRenderType.EQUIPPED=>{
          BIND(TEXTURE);
          GL11.glPushMatrix();
          GL11.glEnable(GL11.GL_LIGHTING);
          GL11.glScalef(1.0F, 1.0F, 1.0F);
          GL11.glTranslatef(0.0F, 0.7F, 0.0F);
          GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
          // this.model.render();
          GL11.glDisable(GL11.GL_LIGHTING);
          GL11.glPopMatrix();
          return;
        };
        case ItemRenderType.INVENTORY=>{
          BIND(TEXTURE);
          GL11.glPushMatrix();
          GL11.glEnable(GL11.GL_LIGHTING);
          GL11.glScalef(0.825F, 0.825F, 0.825F);
          GL11.glTranslatef(0.0F, 0.7F, 0.0F);
          GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
          // this.model.render();
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