package bidahochi.foxdrives.util;

import bidahochi.foxdrives.FoxDrives;
import bidahochi.foxdrives.entities.EntityCarChest;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.resources.I18n;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;

public class GuiCarInventory extends GuiContainer {
    private static final ResourceLocation horseGuiTextures = new ResourceLocation("textures/gui/container/horse.png");
    private IInventory player;
    public EntityCarChest car;
    public static int guiTop;
    public static int guiLeft;

    public GuiCarInventory(IInventory p_i1093_1_, EntityCarChest p_i1093_3_) {
        super(new ContainerCarInventory(p_i1093_1_, p_i1093_3_));
        this.player = p_i1093_1_;
        this.car = p_i1093_3_;
        this.allowUserInput = false;
    }

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    protected void drawGuiContainerForegroundLayer(int p_146979_1_, int p_146979_2_) {
        this.fontRendererObj.drawString(this.car.hasCustomInventoryName() ? this.car.getInventoryName() : I18n.format(this.car.getInventoryName(), new Object[0]), 8, 6, 4210752);
        this.fontRendererObj.drawString(this.player.hasCustomInventoryName() ? this.player.getInventoryName() : I18n.format(this.player.getInventoryName(), new Object[0]), 8, this.ySize - 96 + 2, 4210752);
    }

    protected void drawGuiContainerBackgroundLayer(float screenWidth, int screenHeight, int p_146976_3_) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(horseGuiTextures);
        guiLeft = (this.width - this.xSize) / 2;
        guiTop = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(guiLeft,guiTop,  0, 0, this.xSize, this.ySize);

        this.drawTexturedModalRect(guiLeft + 79, guiTop + 17, 0, this.ySize, 90, 54);

        this.drawTexturedModalRect(guiLeft + 7, guiTop + 35, 0, this.ySize + 54, 18, 18);

        GuiInventory.func_147046_a(guiLeft + 51, guiTop + 60, 17, (float)(guiLeft + 51) -
                screenWidth, (float)(guiTop + 75 - 50) - screenHeight, this.car);

        //these fix positions for the scaled position
        guiLeft = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight).getScaledWidth();
        guiTop = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight).getScaledHeight();

    }

    /**
     * Draws the screen and all the components in it.
     */
    public void drawScreen(int p_73863_1_, int p_73863_2_, float p_73863_3_) {
        super.drawScreen(p_73863_1_, p_73863_2_, p_73863_3_);

        buttonList =new ArrayList();
        buttonList.add(
                new GuiButton( 1,percentLeft(20)-10,percentTop(75), 50,20,
                        car.getDataWatcher().getWatchableObjectByte(17)==(byte)1?"Turn Off":"Turn On"));

    }

    @Override
    protected void actionPerformed(GuiButton button) {
        if(button.id==1){
            FoxDrives.interactChannel.sendToServer(new PacketInteract(1, Minecraft.getMinecraft().thePlayer.ridingEntity.getEntityId()));
        }
    }

    public static int percentTop(int value){return (int)(guiTop*(value*0.01f));}
    public static int percentLeft(int value){return (int)(guiLeft*(value*0.01f));}
}
