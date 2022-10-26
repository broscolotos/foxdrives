package bidahochi.foxdrives.util;

import bidahochi.foxdrives.FoxDrives;
import bidahochi.foxdrives.entities.EntityCar;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;

import java.util.ArrayList;

public class GuiCar extends GuiScreen {

    public static int guiTop;
    public static int guiLeft;
    public EntityCar entity;

    public GuiCar(EntityCar t){
        entity=t;

    }

    @Override
    public void initGui() {

    }


    @Override
    public void drawScreen(int parWidth, int parHeight, float p_73863_3_) {
        super.drawScreen(parWidth, parHeight, p_73863_3_);
        guiLeft = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight).getScaledWidth();
        guiTop = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight).getScaledHeight();


        buttonList =new ArrayList();
        buttonList.add(
                new GuiButton( 1,percentLeft(15)-10,percentTop(56), 20,20,
                        entity.getDataWatcher().getWatchableObjectByte(17)==(byte)1?"Turn Off":"Turn On"));

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
