package com.exo.client.gui

import com.exo.server.gui.ContainerAssembler
import com.exo.tile.TileAssembler
import cpw.mods.fml.relauncher.SideOnly
import cpw.mods.fml.relauncher.Side
import net.minecraft.client.gui.inventory.GuiContainer
import net.minecraft.entity.player.InventoryPlayer
import net.minecraft.util.ResourceLocation
import org.lwjgl.opengl.GL11

@SideOnly(Side.CLIENT)
class GuiAssembler(playerInv: InventoryPlayer, tile: TileAssembler) extends GuiContainer(new ContainerAssembler(playerInv, tile)){
  private val TEXTURE: ResourceLocation = new ResourceLocation("exo", "texture/gui/guiAssembler.png");
  
  override def drawGuiContainerBackgroundLayer(f: Float, i: Int, j: Int){
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    this.mc.getTextureManager().bindTexture(this.TEXTURE);
    val k: Int = (this.width - this.xSize) / 2;
    val l: Int = (this.height - this.ySize) / 2;
    this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
  }
  
  override def drawGuiContainerForegroundLayer(x: Int, y: Int){
    
  }
}