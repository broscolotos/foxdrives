package bidahochi.foxdrives.util;

import bidahochi.foxdrives.FoxDrives;
import bidahochi.foxdrives.entities.EntityCar;
import bidahochi.foxdrives.entities.EntityCarChest;
import bidahochi.foxdrives.entities.EntitySeat;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

public class EventManager {

    public static EventManager instance = new EventManager();

    //handles user inputs, mainly just meant for opening the GUI
    //if an inventory is to be managed, this will require a send to server entity command
    //    which opens the GUI through the proxy.
    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void onClientKeyPress(TickEvent.ClientTickEvent event){
        if(event.phase == TickEvent.Phase.END) return;
        if(Minecraft.getMinecraft().currentScreen != null) return;
        if(!(Minecraft.getMinecraft().thePlayer.ridingEntity instanceof EntityCar)) return;

        if(bidahochi.foxdrives.util.ClientProxy.KeyInventory.isPressed()){
            if(Minecraft.getMinecraft().thePlayer.ridingEntity instanceof EntityCarChest){
                FoxDrives.interactChannel.sendToServer(new PacketInteract(
                        2,Minecraft.getMinecraft().thePlayer.ridingEntity.getEntityId()));
            } else {
                FMLCommonHandler.instance().showGuiScreen(new GuiCar((EntityCar) Minecraft.getMinecraft().thePlayer.ridingEntity));
            }
        }

        if(bidahochi.foxdrives.util.ClientProxy.KeyBrake.isPressed()){
            if(Minecraft.getMinecraft().thePlayer.ridingEntity instanceof EntityCar){
                FoxDrives.interactChannel.sendToServer(new PacketInteract(3, Minecraft.getMinecraft().thePlayer.ridingEntity.getEntityId()));
            }
        }
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void onRenderOverlay(RenderGameOverlayEvent.Post event){
        if(Minecraft.getMinecraft().thePlayer == null) return;
        if(event.type != RenderGameOverlayEvent.ElementType.CROSSHAIRS) return;
        EntityPlayer player = Minecraft.getMinecraft().thePlayer;
        if(player.ridingEntity == null) return;
        EntityCar car = player.ridingEntity instanceof EntityCar ? (EntityCar)player.ridingEntity : player.ridingEntity instanceof EntitySeat ? ((EntitySeat)player.ridingEntity).car : null;
        if(car == null) return;
        //Minecraft.getMinecraft().fontRenderer.drawStringWithShadow("Throttle: " + car.throttle, 5, 5, 0xffff00);
        Minecraft.getMinecraft().fontRenderer.drawStringWithShadow("Speed: " + ((int)(car.getHorSpeed() * 3.6 * 100) / 100f), 5, 5, 0xffff00);
        //if(car.braking) Minecraft.getMinecraft().fontRenderer.drawStringWithShadow("Braking!", 5, 25, 0xff0000);
        Minecraft.getMinecraft().fontRenderer.drawStringWithShadow("Yaw: " + car.rotationYaw, 5, 15, 0xffff00);
    }

}
