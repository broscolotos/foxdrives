package bidahochi.foxdrives.util;

import bidahochi.foxdrives.FoxDrives;
import bidahochi.foxdrives.entities.EntityCar;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

import java.util.ArrayList;

public class GuiCar extends GuiContainer {

    public static int guiTop;
    public static int guiLeft;
    public EntityCar entity;
    private GuiButton button;

    public GuiCar(EntityCar car){
        super(new Container() {
            @Override
            public boolean canInteractWith(EntityPlayer player){
                return !player.isDead;
            }
        });
        entity = car;
    }

    @Override
    public void initGui() {
        buttonList.clear();
        guiLeft = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight).getScaledWidth();
        guiTop = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight).getScaledHeight();


    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float t, int x, int y){
        guiLeft = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight).getScaledWidth();
        guiTop = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight).getScaledHeight();
    }

    /**
     * Draws the screen and all the components in it.
     */
    public void drawScreen(int p_73863_1_, int p_73863_2_, float p_73863_3_)
    {
        super.drawScreen(p_73863_1_, p_73863_2_, p_73863_3_);
        buttonList.clear();
        buttonList.add(
                new GuiButton( 1,percentLeft(20)-10,percentTop(75), 50,20,
                        entity.getDataWatcher().getWatchableObjectByte(17)==(byte) 1 ?"Turn Off":"Turn On"));
        buttonList.add(
                new GuiButton( 10,percentLeft(20) + 80,percentTop(75), 80,20,
                        entity.isLightsEnabled() ? "Headlights On" : "Headlights Off"));
        buttonList.add(
                new GuiButton( 11,percentLeft(20) + 80 * 2,percentTop(75), 80,20,
                        entity.isBeaconEnabled() ? "Beacons On" : "Beacons Off"));
        buttonList.add(
                new GuiButton( 12,percentLeft(20) + 80 * 3,percentTop(75), 80,20,
                        entity.isDitchLightsEnabled() ? "DitchLights On" : "DitchLights Off"));

    }

    @Override
    protected void actionPerformed(GuiButton button)
    {
        switch (button.id)
        {
            case 1:
            case 10:
            case 11:
            case 12:
                FoxDrives.interactChannel.sendToServer(new PacketInteract(button.id,Minecraft.getMinecraft().thePlayer.ridingEntity.getEntityId()));
            break;
        }
    }


    public static int percentTop(int value){return (int)(guiTop*(value*0.01f));}
    public static int percentLeft(int value){return (int)(guiLeft*(value*0.01f));}
}
