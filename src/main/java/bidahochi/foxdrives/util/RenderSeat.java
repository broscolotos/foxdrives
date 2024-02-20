package bidahochi.foxdrives.util;

import bidahochi.foxdrives.FoxDrives;
import bidahochi.foxdrives.entities.EntityCar;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import static org.lwjgl.opengl.GL11.*;

public class RenderSeat extends Render {

    @Override
    public void doRender(Entity entity, double x, double y, double z, float f, float fl) {
        //
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity){
        return null;
    }

}
