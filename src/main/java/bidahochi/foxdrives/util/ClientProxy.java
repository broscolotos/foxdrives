package bidahochi.foxdrives.util;


import bidahochi.foxdrives.entities.EntityCar;
import bidahochi.foxdrives.entities.EntityCarChest;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import org.lwjgl.input.Keyboard;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {

    public static final RenderCar transportRenderer = new RenderCar();
    /**the keybind for opening the inventory*/
    public static KeyBinding KeyInventory = new KeyBinding("Open car GUI",  Keyboard.KEY_R, "Fox Drives");

    @Override
    public Object getEntityRender(){return transportRenderer;}

    @Override
    public boolean isClient(){return true;}

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        System.out.println("Open client");
        if(player.worldObj.getEntityByID(ID) instanceof EntityCarChest){
            System.out.println("Open client");
            return new GuiCarInventory(player.inventory, (EntityCarChest) player.worldObj.getEntityByID(ID));
        }
        return null;
    }

    public static final net.minecraft.client.renderer.entity.RenderPlayer playerRender = new net.minecraft.client.renderer.entity.RenderPlayer(){
        EntityCar t;
        @Override
        public void doRender(net.minecraft.client.entity.AbstractClientPlayer p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_){
            if (p_76986_1_.ridingEntity instanceof EntityCar) {
                t=(EntityCar) p_76986_1_.ridingEntity;
                org.lwjgl.opengl.GL11.glPushMatrix();
                org.lwjgl.opengl.GL11.glScalef(t.getRiderScale(), t.getRiderScale(), t.getRiderScale());
                super.doRender(p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
                org.lwjgl.opengl.GL11.glPopMatrix();

            } else {
                super.doRender(p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
            }
        }
    };

    @Override
    public void registerCarRenderer(Class<? extends EntityCar> clazz){
        RenderingRegistry.registerEntityRenderingHandler(clazz, transportRenderer);
    }

    @Override
    public void registerPlayerScaler(){
        RenderingRegistry.registerEntityRenderingHandler(EntityPlayer.class, playerRender);
    }

}
