package fexcraft.tmt_slim;

import net.minecraft.util.Vec3;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;

import java.io.Serializable;

/**
 * basically the same as Vec3D, but a float. Usually used for storing rotations.
 * @author Ferdinand
 */


public class Vec3f implements Serializable {

    public static final float radianF = (float) Math.PI / 180.0f;
    public float xCoord;
    public float yCoord;
    public float zCoord;

    public Vec3f(){
        xCoord = 0;
        yCoord = 0;
        zCoord = 0;
    }

    public Vec3f(double xVec, double yVec, double zVec) {
        this((float)xVec, (float)yVec, (float)zVec);
    }

    public Vec3f(Vec3 v){
        xCoord = (float)v.xCoord;
        yCoord = (float)v.yCoord;
        zCoord= (float)v.zCoord;
    }
    public Vec3f(Vec3f v){
        xCoord = v.xCoord;
        yCoord = v.yCoord;
        zCoord= v.zCoord;
    }

    public Vec3f(float f, float g, float h){
        xCoord = f;
        yCoord = g;
        zCoord = h;
    }

    public Vec3f(float[] v){
        xCoord = v[0];
        yCoord = v[1];
        zCoord= v[2];
    }

    public Vec3f crossProduct(Vec3f p_72431_1_) {
        return new Vec3f(this.yCoord * p_72431_1_.zCoord - this.zCoord * p_72431_1_.yCoord,
                this.zCoord * p_72431_1_.xCoord - this.xCoord * p_72431_1_.zCoord,
                this.xCoord * p_72431_1_.yCoord - this.yCoord * p_72431_1_.xCoord);
    }

    public Vec3f crossProduct(Vec3d p_72431_1_) {
        return new Vec3f(this.yCoord * p_72431_1_.zCoord - this.zCoord * p_72431_1_.yCoord,
                this.zCoord * p_72431_1_.xCoord - this.xCoord * p_72431_1_.zCoord,
                this.xCoord * p_72431_1_.yCoord - this.yCoord * p_72431_1_.xCoord);
    }

    public Vec3f scale(float scale){
        return new Vec3f(this.xCoord * scale, this.yCoord * scale, this.zCoord * scale);
    }

    public Vec3f scale(float scaleX, float scaleY, float scaleZ){
        return new Vec3f(this.xCoord * scaleX, this.yCoord * scaleY, this.zCoord * scaleZ);
    }

    public Vec3f subtract(float x, float y, float z){
        return this.addVector(-x, -y, -z);
    }

    public Vec3f add(Vec3f vec){
        return this.addVector(vec.xCoord, vec.yCoord, vec.zCoord);
    }

    public Vec3f addVector(float x, float y, float z){
        return new Vec3f(xCoord + x,yCoord + y,zCoord + z);
    }

    public Vec3f subtract(Vec3f vec){
        return new Vec3f(xCoord-vec.xCoord,
        yCoord-vec.yCoord,
        zCoord-vec.zCoord);
    }

    // Calculate magnitude of the vector
    public double magnitude() {
        return Math.sqrt(this.xCoord * this.xCoord + this.yCoord * this.yCoord + this.zCoord * this.zCoord);
    }

    // Angle between two vectors in radians
    public double angle(Vec3f other) {
        double dotProduct = this.dotProduct(other);
        double magnitudes = this.magnitude() * other.magnitude();
        return Math.acos(dotProduct / magnitudes);
    }

    // Angle between two vectors in radians
    public double angle(Vec3d other) {
        double dotProduct = this.dotProduct(other);
        double magnitudes = this.magnitude() * other.magnitude();
        return Math.acos(dotProduct / magnitudes);
    }

    public Vec3f normalize(){
        double d0 = Math.sqrt(this.xCoord * this.xCoord + this.yCoord * this.yCoord + this.zCoord * this.zCoord);
        return d0 < 1.0E-4D ? new Vec3f() : new Vec3f(this.xCoord / d0, this.yCoord / d0, this.zCoord / d0);
    }

    public float dotProduct(Vec3f vec){
        return this.xCoord * vec.xCoord + this.yCoord * vec.yCoord + this.zCoord * vec.zCoord;
    }

    public float dotProduct(Vec3d vec){
        return (float)(this.xCoord * vec.xCoord + this.yCoord * vec.yCoord + this.zCoord * vec.zCoord);
    }


    public float dot2D(Vec3f other){
        return this.xCoord * other.xCoord + this.zCoord * other.zCoord;
    }

    public static Vec3f direction(float... arr){
        double l = length(arr[0], arr[1], arr[2]); return new Vec3f(arr[0] / l, arr[1] / l, arr[2] / l);
    }

    public static Vec3f direction(Vec3f vec){
        double l = length(vec.xCoord, vec.yCoord, vec.zCoord); return new Vec3f(vec.xCoord / l, vec.yCoord / l, vec.zCoord / l);
    }

    //based on fvtm rail entity stuff
    public Vec3f distance(Vec3f dest, float am){
        Vec3f vec = new Vec3f((xCoord + dest.xCoord) * 0.5, (yCoord + dest.yCoord) * 0.5, (zCoord + dest.zCoord) * 0.5);
        vec = direction(vec.xCoord - xCoord, vec.yCoord - yCoord, vec.zCoord - zCoord);
        return new Vec3f(xCoord + (vec.xCoord * am), yCoord + (vec.yCoord * am), zCoord + (vec.zCoord * am));
    }

    public Vec3f distance(Vec3f dest, double am){
        Vec3f vec = new Vec3f((xCoord + dest.xCoord) * 0.5, (yCoord + dest.yCoord) * 0.5, (zCoord + dest.zCoord) * 0.5);
        vec = direction(vec.xCoord - xCoord, vec.yCoord - yCoord, vec.zCoord - zCoord);
        return new Vec3f(xCoord + (vec.xCoord * am), yCoord + (vec.yCoord * am), zCoord + (vec.zCoord * am));
    }
    public Vec3f distance(float[] dest, float am){
        Vec3f vec = new Vec3f((xCoord + dest[0]) * 0.5, (yCoord + dest[1]) * 0.5, (zCoord + dest[2]) * 0.5);
        vec = direction(vec.xCoord - xCoord, vec.yCoord - yCoord, vec.zCoord - zCoord);
        return new Vec3f(xCoord + (vec.xCoord * am), yCoord + (vec.yCoord * am), zCoord + (vec.zCoord * am));
    }

    public double length(){
        return Math.sqrt(xCoord * xCoord + yCoord * yCoord + zCoord * zCoord);
    }


    public double length2d(){
        return Math.sqrt(xCoord * xCoord + zCoord * zCoord);
    }

    public static double length(float... arr){
        return Math.sqrt(arr[0] * arr[0] + arr[1] * arr[1] + arr[2] * arr[2]);
    }

    public static double length(Vec3f vec){
        return Math.sqrt(vec.xCoord * vec.xCoord + vec.yCoord * vec.yCoord + vec.zCoord * vec.zCoord);
    }

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        else if(!(obj instanceof Vec3f)){
            return false;
        }
        else{
            Vec3f vec3d = (Vec3f)obj;
            return Float.compare(vec3d.xCoord, this.xCoord) != 0 ? false : (Float.compare(vec3d.yCoord, this.yCoord) != 0 ? false : Float.compare(vec3d.zCoord, this.zCoord) == 0);
        }
    }

    public int hashCode(){
        long j = Float.floatToIntBits(this.xCoord);
        int i = (int)(j ^ j >>> 32);
        j = Float.floatToIntBits(this.yCoord);
        i = 31 * i + (int)(j ^ j >>> 32);
        j = Float.floatToIntBits(this.zCoord);
        i = 31 * i + (int)(j ^ j >>> 32);
        return i;
    }

    public float distance(Vec3f vec){
        float d0 = vec.xCoord - this.xCoord;
        float d1 = vec.yCoord - this.yCoord;
        float d2 = vec.zCoord - this.zCoord;
        return (float)Math.sqrt(d0 * d0 + d1 * d1 + d2 * d2);
    }

    public float distance2d(Vec3f vec){
        return Math.abs(this.xCoord - vec.xCoord)+Math.abs(this.zCoord - vec.zCoord);
    }

    @Override
    public String toString(){
        return String.format("Vec3f[ %s, %s, %s ]", xCoord, yCoord, zCoord);
    }

    public Vec3f rotatePoint(float pitch, float yaw, float roll) {
        float cos,sin,x= this.xCoord,y= this.yCoord,z= this.zCoord;
        //rotate pitch
        if (pitch != 0.0F) {
            cos = (float)Math.cos(pitch*radianF);
            sin = (float)Math.sin(pitch*radianF);

            this.xCoord = (y * sin) + (x * cos);
            this.yCoord = (y * cos) - (x * sin);
        }
        //rotate yaw
        if (yaw != 0.0F) {
            cos = (float)Math.cos(yaw*radianF);
            sin = (float)Math.sin(yaw*radianF);

            this.xCoord = (x * cos) - (z * sin);
            this.zCoord = (x * sin) + (z * cos);
        }
        //rotate roll
        if (roll != 0.0F) {
            cos = (float)Math.cos(roll*radianF);
            sin = (float)Math.sin(roll*radianF);

            this.yCoord = (z * cos) - (y * sin);
            this.zCoord = (z * sin) + (y * cos);
        }
        return this;
    }

    public Vec3f rotateOnYaw(float yaw) {
        float cos,sin,x= this.xCoord,z= this.zCoord;
        //rotate yaw
        if (yaw != 0.0F) {
            cos = (float)Math.cos(yaw*radianF);
            sin = (float)Math.sin(yaw*radianF);

            this.xCoord = (x * cos) - (z * sin);
            this.zCoord = (x * sin) + (z * cos);
        }
        return this;
    }

    public Vec3f getRelativeVector(Vec3f vec){
        Matrix4f mat = new Matrix4f();
        mat.m00 = vec.xCoord; mat.m10 = vec.yCoord; mat.m20 = vec.zCoord;
        Matrix4f.rotate(zCoord * 3.14159265F / 180, new Vector3f(1F, 0F, 0F), mat, mat);
        Matrix4f.rotate(yCoord * 3.14159265F / 180, new Vector3f(0F, 0F, 1F), mat, mat);
        Matrix4f.rotate(xCoord * 3.14159265F / 180, new Vector3f(0F, 1F, 0F), mat, mat);
        return new Vec3f(mat.m00, mat.m10, mat.m20);
    }

    public Vec3d toVec3d() {
        return new Vec3d(xCoord,yCoord,zCoord);
    }
}
