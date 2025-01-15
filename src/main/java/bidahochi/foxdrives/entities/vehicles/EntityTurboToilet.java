package bidahochi.foxdrives.entities.vehicles;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.entities.EntityCar;
import bidahochi.foxdrives.models.ModelTurboToilet;
import fexcraft.tmt_slim.ModelBase;
import net.minecraft.world.World;


public class EntityTurboToilet extends EntityCar {

    public EntityTurboToilet(World world, double xPos, double yPos, double zPos) {
        super(world, xPos, yPos, zPos);
    }
    public EntityTurboToilet(World p_i1685_1_) {
        super(p_i1685_1_);
    }


    /**
     * Returns the model for the entity
     */
    @Override
    public ModelBase getModel() {
        return new ModelTurboToilet();
    }

    /**
     * returns a list of skin texture addresses for the entity, the MODID is presumed to be the one defined in FoxDrives.java
     * example:
     * String[] getSkins(){return new String[]{"textures/skin1", "textures/skin2"};}
     */
    @Override
    public String[] getSkins() {
        return new String[]{"textures/turboshitter"};
    }

    @Override
    public CarType type(){
        return CarType.TurboToilet;
    }


}
