package bidahochi.foxdrives.util;

import bidahochi.foxdrives.entities.EntityCar;
import bidahochi.foxdrives.entities.EntityCarChest;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.world.World;

public class CommonProxy implements IGuiHandler {
    /**
     * Returns a Server side Container to be displayed to the user.
     *
     * @param ID     The Gui ID Number
     * @param player The player viewing the Gui
     * @param world  The current world
     * @param x      X Position
     * @param y      Y Position
     * @param z      Z Position
     * @return A GuiScreen/Container to be displayed to the user, null if none.
     */
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        //System.out.println("Open client");
        if(player.worldObj.getEntityByID(ID) instanceof EntityCarChest){
            System.out.println("OpenServer");
            return new ContainerCarInventory(player.inventory, (EntityCarChest) player.worldObj.getEntityByID(ID));
        }
        else return new Container(){
            @Override
            public boolean canInteractWith(EntityPlayer player){
                return !player.isDead;
            }
        };
        //return null;
    }

    /**
     * Returns a Container to be displayed to the user. On the client side, this
     * needs to return a instance of GuiScreen On the server side, this needs to
     * return a instance of Container
     *
     * @param ID     The Gui ID Number
     * @param player The player viewing the Gui
     * @param world  The current world
     * @param x      X Position
     * @param y      Y Position
     * @param z      Z Position
     * @return A GuiScreen/Container to be displayed to the user, null if none.
     */
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }


    public boolean isClient(){return false;}

    public Object getEntityRender(){return null;}

    public void registerCarRenderer(Class<? extends EntityCar> clazz){}

    public void registerPlayerScaler(){}

}
