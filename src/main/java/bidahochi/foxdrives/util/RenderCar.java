package bidahochi.foxdrives.util;

import bidahochi.foxdrives.FoxDrives;
import bidahochi.foxdrives.entities.EntityCar;
import fexcraft.tmt_slim.ModelRendererTurbo;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import static org.lwjgl.opengl.GL11.*;

public class RenderCar extends Render {

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void func_76986_a(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     *
     * @param p_76986_1_
     * @param p_76986_2_
     * @param p_76986_4_
     * @param p_76986_6_
     * @param p_76986_8_
     * @param p_76986_9_
     */
    @Override
    public void doRender(Entity p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_) {
        if(p_76986_1_ instanceof EntityCar){
            doRender((EntityCar) p_76986_1_, p_76986_2_,p_76986_4_,p_76986_6_);
        }

    }


    public void doRender(EntityCar car, double x, double y, double z){
        //init model if necessary
        if(car.modelInstance==null){
            car.modelInstance=car.getModel();
            for (ModelRendererTurbo render : car.modelInstance.getParts()) {
                if (render.boxName == null) {
                    continue;
                }
                //handle culling
                /*if (render.boxName.toLowerCase().contains("cull")) {
                    render.boxName=render.boxName.replace("cull","").replace("Cull", "");
                    render.showModel = false;
                } else*/ if (render.boxName.toLowerCase().contains("cull")) {
                    //render.boxName=render.boxName.replace("nocull","").replace("Nocull", "").replace("NoCull", "").replace("cull", "");
                    render.noCull = true;
                }
                //handle glow
                if(render.boxName.toLowerCase().contains("glow")){
                    render.boxName=render.boxName.replace("glow","").replace("Glow", "");
                    render.ignoresLighting=true;
                }
                //handle wheels
                if(render.boxName.toLowerCase().contains("wheel")){
                    if(render.boxName.toLowerCase().contains("front")){
                        car.modelInstance.frontWheels.add(render);
                    } else if (render.boxName.toLowerCase().contains("front2")){
                        car.modelInstance.frontWheels2.add(render);
                    } else {
                        car.modelInstance.backWheels.add(render);
                    }
                }
            }
        }

        if(car.riddenByEntity!=null && car.running > 0) {
            // define the rotation angle, scale based on framerate.
            double rotation = ((((EntityLivingBase) car.riddenByEntity).moveForward*car.getMoveSpeed()*0.000001) * (System.currentTimeMillis() - car.lastFrame) * 60);
            //rotate back wheels
            for (ModelRendererTurbo wheel : car.modelInstance.backWheels) {
                if (wheel.rotateAngleZ > Math.PI * 10000 || wheel.rotateAngleZ < Math.PI * -10000) {
                    wheel.rotateAngleZ -= Math.copySign(Math.PI * 10000, wheel.rotateAngleZ);
                }
                wheel.rotateAngleZ -= rotation*car.wheelSpinMultiplier();
            }

            //rotate front wheels
            //todo: turn front wheels
            for (ModelRendererTurbo wheel : car.modelInstance.frontWheels) {
                if (wheel.rotateAngleZ > Math.PI * 10000 || wheel.rotateAngleZ < Math.PI * -10000) {
                    wheel.rotateAngleZ -= Math.copySign(Math.PI * 10000, wheel.rotateAngleZ);
                }
                wheel.rotateAngleZ -= rotation*car.wheelSpinMultiplier();
                if (Minecraft.getMinecraft().thePlayer.moveStrafing > 0) {
                    wheel.rotateAngleY = (car.turnRenderDegree(true));
                } else if (Minecraft.getMinecraft().thePlayer.moveStrafing < 0) {
                    wheel.rotateAngleY = (car.turnRenderDegree(false));
                } else {
                    wheel.rotateAngleY = 0;
                }
            }

            //rotate front wheels, if they are actually on the back (forklift nonsense)
            //todo: turn front wheels
            for (ModelRendererTurbo wheel : car.modelInstance.frontWheels2) {
                if (wheel.rotateAngleZ > Math.PI * 10000 || wheel.rotateAngleZ < Math.PI * -10000) {
                    wheel.rotateAngleZ -= Math.copySign(Math.PI * 10000, wheel.rotateAngleZ);
                }
                wheel.rotateAngleZ -= rotation*car.wheelSpinMultiplier();

                if (Minecraft.getMinecraft().thePlayer.moveStrafing < 0) {
                    wheel.rotateAngleY = (car.turnRenderDegree(car.rearSteer() ? false : true));
                } else if (Minecraft.getMinecraft().thePlayer.moveStrafing > 0) {
                    wheel.rotateAngleY = (car.turnRenderDegree(car.rearSteer() ? true : false));
                } else {
                    wheel.rotateAngleY = 0;
                }
            }
        }

        //apply GL effects
        GL11.glPushMatrix();
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glAlphaFunc(GL11.GL_GREATER, 0.1f);
        GL11.glEnable(GL11.GL_TEXTURE_2D);
        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glLightModelf(GL_LIGHT_MODEL_TWO_SIDE, GL_FALSE);
        GL11.glLightModelf(GL_LIGHT_MODEL_LOCAL_VIEWER, GL_TRUE);
        GL11.glShadeModel(GL_SMOOTH);
        GL11.glEnable(GL_NORMALIZE);
        //apply texture
        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(FoxDrives.MODID,
                car.getSkins()[car.getDataWatcher().getWatchableObjectInt(20)]+".png"));
        //reposition and rotation
        GL11.glTranslated(x,y+0.625f,z);
        GL11.glRotatef(-car.rotationYaw+90,0,1,0);
        GL11.glRotatef(180,1,0,0);
        GL11.glRotatef(car.getRollingDirection(),0,0,1);
        //render
        car.modelInstance.render(car, 0,0,0,0,0, 0.625f);

        GL11.glPopMatrix();
    }

    /**
     * completley useless, but necessary to include.
     */
    @Override
    protected ResourceLocation getEntityTexture(Entity p_110775_1_) {return null;}
}
