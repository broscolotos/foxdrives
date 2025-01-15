package bidahochi.foxdrives.entities;

import bidahochi.foxdrives.FoxDrives;
import fexcraft.tmt_slim.Vec3d;
import fexcraft.tmt_slim.Vec3f;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import java.util.List;

public abstract class EntityTrailer extends EntityCarChest {

    public EntityCar pullingEntity = null;
    public static final double radian = (Math.PI / 180.0D);

    public EntityTrailer(World p_i1681_1_) {
        super(p_i1681_1_);
        this.stepHeight = 1.0f;
    }



    public EntityTrailer(World world, double xPos, double yPos, double zPos) {
        super(world, xPos, yPos, zPos);
    }

    @Override
    public int getSizeInventory() {
        return 0;
    }

    @Override
    public boolean interact(EntityPlayer p_70085_1_) {
        if (this.pullingEntity == null) {
            List entityList = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.expand(2, 2, 2));
            if (entityList != null && !entityList.isEmpty()) {
                for (int i = 0; i < entityList.size(); ++i) {
                    Entity entity = (Entity) entityList.get(i);
                    if (entity instanceof EntityCar && ((EntityCar) entity).getHitchPos() != null) {
                        this.pullingEntity = (EntityCar) entity;
                        this.pullingEntity.trailer = this;

                        this.getEntityData().setInteger("PULLING_ENTITY", this.pullingEntity.getEntityId());
                        return true;
                    }
                }
            }
        } else {
            this.pullingEntity.trailer = null;
            this.pullingEntity = null;

            this.getEntityData().setInteger("PULLING_ENTITY", -1);
        }
        return false;
    }

    @Override
    public void applyEntityCollision(Entity entity){
        if(entity instanceof EntitySeat) return;
        if(entity instanceof EntityPlayer && entity.ridingEntity instanceof EntitySeat) return;
        if(entity instanceof EntityCar && entity == this.pullingEntity) return;
        if(entity instanceof EntityPlayer && entity.ridingEntity instanceof EntityCar && entity.ridingEntity == this.pullingEntity) return;
        super.applyEntityCollision(entity);
    }


    @Override
    public void onUpdate() {
        //handle the get punched animation
        if (this.getRollingDirection() > 0) {
            this.setRollingDirection(this.getRollingDirection() - 1);
        }

        if (this.getDamage() > 0.0F) {
            this.setDamage(this.getDamage() - 1.0F);
        }
        if(posY<-64){
            this.kill();
        }
        //handle super update crap
        this.onEntityUpdate();

        Vec3d motion = new Vec3d(this.motionX, this.motionY, this.motionZ);
        this.motionX = motion.xCoord; this.motionY = this.motionY - 0.08; this.motionZ = motion.zCoord;

        if (FoxDrives.proxy.isClient()) {
            int entityID = this.getEntityData().getInteger("PULLING_ENTITY");
            if (entityID != -1) {
                Entity entity = this.worldObj.getEntityByID(entityID);
                if (entity instanceof EntityCar && ((EntityCar)entity).getHitchPos() != null) {
                    this.pullingEntity = (EntityCar)entity;
                }
                else if (this.pullingEntity != null) {
                    this.pullingEntity = null;
                }
            }
            else if (this.pullingEntity != null) {
                this.pullingEntity = null;
            }
        }

        if (this.pullingEntity != null && !FoxDrives.proxy.isClient()) {
            double maxDist = 1 + Math.abs(this.getHitchOffset() / 16) * this.getModelScale().xCoord;//TODO: replace "1" with a config for trailer stretch
            if (this.pullingEntity.getDistanceToEntity(this) > maxDist) {
                //play disconnect sound
                this.pullingEntity = null;
                return;
            }
        }

        if (this.pullingEntity != null) {
            if (!this.pullingEntity.isEntityAlive() || (this.pullingEntity.getTrailer() != this)) {
                this.pullingEntity = null;
                return;
            }
            this.updateMotion();
        }
        else if (!FoxDrives.proxy.isClient()) {
            motion = new Vec3d(this.motionX, this.motionY, this.motionZ);
            this.moveEntity(motion.xCoord * 0.75, motion.yCoord, motion.zCoord * 0.75);
        }
    }

    public void updateMotion() {
        Vec3d towPos = new Vec3d(this.pullingEntity.posX, this.pullingEntity.posY, this.pullingEntity.posZ);
        Vec3d towVec = this.pullingEntity.getHitchPos().scale(0.0625f).toVec3d();
        towVec = towVec.multiply(this.pullingEntity.getModelScale().xCoord*0.0625, this.pullingEntity.getModelScale().yCoord*0.0625, this.pullingEntity.getModelScale().zCoord*0.0625);
        if (this.getModelOffset() != null) {
            towVec = towVec.addVector(0,0,this.pullingEntity.getModelOffset().zCoord);
        }
        towPos.add(towVec.yRot((float) Math.toRadians(-this.pullingEntity.servyaw)));

        this.servyaw = (float) Math.toDegrees(Math.atan2(towPos.zCoord - this.posZ, towPos.xCoord - this.posX) - Math.toRadians(90f));
        double deltaRot = this.prevRotationYaw - this.servyaw;
        if (deltaRot < -180) {
            this.prevRotationYaw += 360.0f;
        }
        else if (deltaRot >= 180) {
            this.prevRotationYaw -= 360.0f;
        }

        double scale = this.getModelScale().xCoord;
        Vec3d vec = new Vec3d (0, 0, this.getHitchOffset() * scale * 0.0625).yRot((float) Math.toRadians(-this.rotationYaw));
        vec.add(towPos);

        Vec3d motion = new Vec3d(this.motionX, this.motionY, this.motionZ);
        this.motionX = vec.xCoord - this.posX; this.motionY = motion.yCoord; this.motionZ = vec.zCoord - this.posZ;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
    }


    public float getHitchOffset() {
        return 0;
    }

    @Override
    public void setDead(){
        super.setDead();
    }
}
