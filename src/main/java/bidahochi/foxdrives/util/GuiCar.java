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
        buttonList = new ArrayList();
        buttonList.add(button = new GuiButton(1, 0, 0, 20, 20, "loading..."));
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float t, int x, int y){
        guiLeft = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight).getScaledWidth();
        guiTop = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight).getScaledHeight();
        button.xPosition = percentLeft(15) - 10;
        button.yPosition = percentTop(56);
        button.displayString = entity.getDataWatcher().getWatchableObjectByte(17) == (byte)1 ? "Turn Off" : "Turn On";
        System.out.println(button.id + " " + button.displayString + " " + entity.getDataWatcher().getWatchableObjectByte(17));
    }

    @Override
    protected void actionPerformed(GuiButton button) {
        if(button.id==1){
            FoxDrives.interactChannel.sendToServer(new PacketInteract(1,Minecraft.getMinecraft().thePlayer.ridingEntity.getEntityId()));
        }
    }


    public static int percentTop(int value){return (int)(guiTop*(value*0.01f));}
    public static int percentLeft(int value){return (int)(guiLeft*(value*0.01f));}
}
