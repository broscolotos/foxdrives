package fexcraft.tmt_slim;

import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;

/**
 * @author EternalBlueFlame
 * <h1>Vector 3d</h1>
 * this is intended to replicate the Vec3d from minecraft 1.8+
 * mostly it just makes handling vector 3's simpler.
 */
public class Vec3d extends Vec3 {

    public Vec3d(double x, double y, double z){
        super(x,y,z);
    }

    public Vec3d(Vec3 vec){super(vec.xCoord, vec.yCoord, vec.zCoord);}

    public void add(Vec3d vec2){
        xCoord += vec2.xCoord;
        yCoord += vec2.yCoord;
        zCoord += vec2.zCoord;
    }

    public Vec3d subtract(Vec3d vec2){
        return new Vec3d(xCoord-vec2.xCoord,yCoord-vec2.yCoord,zCoord-vec2.zCoord);
    }

    public Vec3d crossProduct(double value){
        return new Vec3d(xCoord*value,yCoord*value,zCoord*value);
    }

    public Vec3d addVector(double x, double y, double z){
        xCoord+=x;yCoord+=y;zCoord+=z;
        return this;
    }

    // Calculate magnitude of the vector
    public double magnitude() {
        return Math.sqrt(this.xCoord * this.xCoord + this.yCoord * this.yCoord + this.zCoord * this.zCoord);
    }
    public Vec3d subtractVector(double x, double y, double z){
        xCoord-=x;yCoord-=y;zCoord-=z;
        return this;
    }

    public Vec3d scale(double scale) {
        return this.multiply(scale, scale, scale);
    }

    public Vec3d multiply(double x, double y, double z) {
        return new Vec3d(xCoord * x, yCoord * y, zCoord * z);
    }

    public Vec3d yRot(float p_178785_1_) {
        float f = MathHelper.cos(p_178785_1_);
        float f1 = MathHelper.sin(p_178785_1_);
        double d0 = this.xCoord * (double)f + this.zCoord * (double)f1;
        double d1 = this.yCoord;
        double d2 = this.zCoord * (double)f - this.xCoord * (double)f1;
        return new Vec3d(d0, d1, d2);
    }
}
