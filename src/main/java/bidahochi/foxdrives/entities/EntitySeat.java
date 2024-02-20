package bidahochi.foxdrives.entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

/**
 * "Seat" Entity which can be mounted by a player and follow the vehicle it's assigned to.
 * @author Ferdinand Calo' (FEX___96)
 */
public class EntitySeat extends Entity {

	public EntityCar car;
	private int carid;
	private int passless;

	public EntitySeat(EntityCar car){
		this(car.worldObj);
		this.car = car;
	}

	public EntitySeat(World world){
		super(world);
		setSize(0.25f, 0.25f);
		yOffset = 0;
	}

	@Override
	protected void entityInit(){
        dataWatcher.addObject(17, carid);
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound com){
		setDead();
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound com){

	}

	@Override
    public void onUpdate(){
		if(car == null){
			Entity ent = worldObj.getEntityByID(carid);
			if(ent == null || ent instanceof EntityCar == false) return;
			car = (EntityCar)ent;
		}
		if(car == null) return;
		if(car.isDead){
			setDead();
			return;
		}
		float[] pos = car.getPassengerOffsets().get(car.passengers.indexOf(this) + 1);
		float cos = MathHelper.cos((float)(car.rotationYaw * Math.PI / 180.0f));
		float sin = MathHelper.sin((float)(car.rotationYaw * Math.PI / 180.0f));
		setPosition(
			car.posX + (pos[0] * cos - pos[2] * sin),
			car.posY + pos[1],
			car.posZ + (pos[0] * sin + pos[2] * cos)
		);
		updateRiderPosition();
		if(!worldObj.isRemote){
			if(riddenByEntity == null) passless++;
			if(posY < -64 || passless > 20) setDead();
		}
        onEntityUpdate();
    }

	@Override
	public boolean canBeCollidedWith(){
        return false;
    }

	@Override
    public double getMountedYOffset(){
        return 0;
    }

	@Override
	public void applyEntityCollision(Entity entity){
		//
	}

}
