package bidahochi.foxdrives.entities;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.models.ModelF1CarTest;
import fexcraft.tmt_slim.ModelBase;
import fexcraft.tmt_slim.Vec3f;
import net.minecraft.world.World;


public class EntityF1Car extends EntityCarChest {

    public EntityF1Car(World world, double xPos, double yPos, double zPos) {
        super(world, xPos, yPos, zPos);
    }
    public EntityF1Car(World p_i1685_1_) {
        super(p_i1685_1_);
        textureDescriptionMap.put(0, "F1 Car Demonstrator");
        setGuiRenderScale(getGuiRenderScale() + 0f);
    }


    /**
     * Returns the model for the entity
     */
    @Override
    public ModelBase getModel() {
        return new ModelF1CarTest();
    }

    /**
     * returns a list of skin texture addresses for the entity, the MODID is presumed to be the one defined in FoxDrives.java
     * example:
     * String[] getSkins(){return new String[]{"textures/skin1", "textures/skin2"};}
     */
    @Override
    public String[] getSkins() {
        return new String[]{"textures/f1 car"};
    }

    @Override
    public CarType type(){
        return CarType.F1_CAR;
    }

    @Override
    public Vec3f getModelRotation() {
        return new Vec3f(0,180f,0);
    }

    @Override
    public Vec3f getModelScale() {
        return new Vec3f(1.1,1.1,1.1);
    }

    @Override
    public Vec3f getModelOffset() {
        return new Vec3f(1.1,0,0);
    }


    @Override
    public float turnStrength(boolean reversing){ //speed increase -> turning drops off; speed decrese -> turning drops off
        return reversing ? 0.15f : (velocity % type().max_forward_speed > ((type().max_forward_speed / 3) * 2)
                || velocity % type().max_forward_speed < type().max_forward_speed / 3) ? 0.3f : 1f;
    }
}
