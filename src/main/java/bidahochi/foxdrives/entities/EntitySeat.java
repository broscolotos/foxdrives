package bidahochi.foxdrives.entities;

import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

/**
 * "Seat" Entity which can be mounted by a player and follow the vehicle it's assigned to.
 * @author Ferdinand Calo' (FEX___96)
 */
public class EntitySeat extends Entity implements IEntityAdditionalSpawnData {

	public EntityCar car;
	private int carid;

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
			if(!car.passengers.contains(this)) car.passengers.add(this);
		}
		if(car == null || car.isDead){
			setDead();
			return;
		}
		int off = car.passengers.indexOf(this) + 1;
		float[] pos = car.getPassengerOffsets().get(off >= car.getPassengerOffsets().size() ? 0 : off);
		float cos = MathHelper.cos((float)(car.rotationYaw * Math.PI / 180.0f));
		float sin = MathHelper.sin((float)(car.rotationYaw * Math.PI / 180.0f));
		setPosition(
			car.posX + (pos[0] * cos - pos[2] * sin),
			car.posY + pos[1],
			car.posZ + (pos[0] * sin + pos[2] * cos)
		);
		lastTickPosX = prevPosX = car.prevPosX + (pos[0] * cos - pos[2] * sin);
		lastTickPosY = prevPosY = car.prevPosY + pos[1];
		lastTickPosZ = prevPosZ = car.prevPosZ + (pos[0] * sin + pos[2] * cos);
		if(!worldObj.isRemote){
			if(riddenByEntity == null || posY < -64) setDead();
		}
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

	@Override
	public void updateRiderPosition(){
        if(riddenByEntity == null || car == null) return;
        riddenByEntity.setPosition(posX, posY + riddenByEntity.getYOffset() * car.getRiderScale(), posZ);
		riddenByEntity.lastTickPosX = riddenByEntity.prevPosX = prevPosX;
		riddenByEntity.lastTickPosY = riddenByEntity.prevPosY = prevPosY + riddenByEntity.getYOffset() * car.getRiderScale();
		riddenByEntity.lastTickPosZ = riddenByEntity.prevPosZ = prevPosZ;
    }

	@Override
	public void writeSpawnData(ByteBuf buffer){
		buffer.writeInt(car == null ? 0 : car.getEntityId());
	}

	@Override
	public void readSpawnData(ByteBuf buffer){
		carid = buffer.readInt();
	}

	@Override
	public void setDead(){
		if(car != null) car.passengers.remove(this);
		super.setDead();
	}

}
