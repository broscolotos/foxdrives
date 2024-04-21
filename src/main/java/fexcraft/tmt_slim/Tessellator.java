package fexcraft.tmt_slim;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

/**
* @Author EternalBlueFlame
* 
*/
@SideOnly(Side.CLIENT)
public class Tessellator{

	public static void drawTexturedVertsWithNormal(TexturedPolygon polygon, float scale){
		GL11.glBegin(polygon.vertices.size()==4?GL11.GL_QUADS:polygon.vertices.size()==3?GL11.GL_TRIANGLES:GL11.GL_POLYGON);

		if(polygon.normal!=null) {
			GL11.glNormal3f(polygon.normal.xCoord, polygon.normal.yCoord, polygon.normal.zCoord);
		} else if(polygon.vertices.size()>2) {
			Vec3f vec1= genNormal(polygon.vertices.get(0).vector3F,polygon.vertices.get(1).vector3F,polygon.vertices.get(2).vector3F);
			//integer based normal map scaling fits in better with vanilla, plus it looks more like TC.
			GL11.glNormal3i(
					((int)(vec1.xCoord * 127.0F)) & 255,
					(((int)(vec1.yCoord * 127.0F)) & 255) << 8,
					(((int)(vec1.zCoord * 127.0F)) & 255) << 16);
		}

		for (TexturedVertex vert : polygon.vertices) {
			GL11.glTexCoord2f(vert.textureX, vert.textureY);
			GL11.glVertex3f(vert.vector3F.xCoord * scale, vert.vector3F.yCoord * scale, vert.vector3F.zCoord * scale);
		}

		GL11.glEnd();
	}

	public static final float normalCos = MathHelper.cos(90f*((float) Math.PI / 180.0f));
	public static final float normalSin = MathHelper.sin(90f*((float) Math.PI / 180.0f));

	public static Vec3f genNormal(Vec3f vec0, Vec3f vec1, Vec3f vec2) {
		Vec3f vec = new Vec3f(vec1.subtract(vec2)).crossProduct(vec1.subtract(vec0)).normalize();

		return new Vec3f((vec.yCoord * normalSin) + (vec.xCoord * normalCos),
				(vec.yCoord * normalCos) - (vec.xCoord * normalSin), vec.zCoord);
	}

}
