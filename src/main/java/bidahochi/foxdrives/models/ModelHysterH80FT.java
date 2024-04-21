//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Hyster H80FT
// Model Creator: Bida
// Created on: 07.05.2022 - 10:58:48
// Last changed on: 07.05.2022 - 10:58:48

package bidahochi.foxdrives.models; //Path where the model is located

import fexcraft.tmt_slim.ModelConverter;
import fexcraft.tmt_slim.ModelRendererTurbo;

public class ModelHysterH80FT extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelHysterH80FT() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[102];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 108, 108, textureX, textureY, "wheel"); // Box 136 Wheel1
		bodyModel[1] = new ModelRendererTurbo(this, 108, 102, textureX, textureY, "wheel"); // Box 9 Wheel1
		bodyModel[2] = new ModelRendererTurbo(this, 108, 118, textureX, textureY, "wheel"); // Box 12 Wheel1
		bodyModel[3] = new ModelRendererTurbo(this, 96, 93, textureX, textureY, "wheel"); // Box 17 Wheel1
		bodyModel[4] = new ModelRendererTurbo(this, 108, 108, textureX, textureY, "wheel"); // Box 136 Wheel2
		bodyModel[5] = new ModelRendererTurbo(this, 108, 102, textureX, textureY, "wheel"); // Box 9 Wheel2
		bodyModel[6] = new ModelRendererTurbo(this, 108, 118, textureX, textureY, "wheel"); // Box 12 Wheel2
		bodyModel[7] = new ModelRendererTurbo(this, 96, 93, textureX, textureY, "wheel"); // Box 17 Wheel2
		bodyModel[8] = new ModelRendererTurbo(this, 46, 95, textureX, textureY); // Box 23 axle
		bodyModel[9] = new ModelRendererTurbo(this, 44, 93, textureX, textureY); // Box 10 axle
		bodyModel[10] = new ModelRendererTurbo(this, 99, 111, textureX, textureY, "wheel front2"); // Box 11 Wheel 3
		bodyModel[11] = new ModelRendererTurbo(this, 109, 94, textureX, textureY, "wheel front2"); // Box 14 Wheel 3
		bodyModel[12] = new ModelRendererTurbo(this, 99, 106, textureX, textureY, "wheel front2"); // Box 15 Wheel 3
		bodyModel[13] = new ModelRendererTurbo(this, 99, 119, textureX, textureY, "wheel front2"); // Box 17 Wheel 3
		bodyModel[14] = new ModelRendererTurbo(this, 99, 111, textureX, textureY, "wheel front2"); // Box 11 Wheel 4
		bodyModel[15] = new ModelRendererTurbo(this, 109, 94, textureX, textureY, "wheel front2"); // Box 14 Wheel 4
		bodyModel[16] = new ModelRendererTurbo(this, 99, 106, textureX, textureY, "wheel front2"); // Box 15 Wheel 4
		bodyModel[17] = new ModelRendererTurbo(this, 99, 119, textureX, textureY, "wheel front2"); // Box 17 Wheel 4
		bodyModel[18] = new ModelRendererTurbo(this, 60, 106, textureX, textureY); // Box 22
		bodyModel[19] = new ModelRendererTurbo(this, 71, 90, textureX, textureY); // Box 23
		bodyModel[20] = new ModelRendererTurbo(this, 202, 79, textureX, textureY); // Box 24
		bodyModel[21] = new ModelRendererTurbo(this, 59, 21, textureX, textureY, "cull"); // Box 25 cull
		bodyModel[22] = new ModelRendererTurbo(this, 70, 1, textureX, textureY, "cull"); // Box 26 cull
		bodyModel[23] = new ModelRendererTurbo(this, 102, 60, textureX, textureY); // Box 27
		bodyModel[24] = new ModelRendererTurbo(this, 204, 55, textureX, textureY); // Box 28
		bodyModel[25] = new ModelRendererTurbo(this, 78, 21, textureX, textureY, "cull"); // Box 29 cull
		bodyModel[26] = new ModelRendererTurbo(this, 101, 34, textureX, textureY, "cull"); // Box 30 cull
		bodyModel[27] = new ModelRendererTurbo(this, 79, 41, textureX, textureY, "cull"); // Box 31 cull
		bodyModel[28] = new ModelRendererTurbo(this, 57, 39, textureX, textureY, "cull"); // Box 32 cull
		bodyModel[29] = new ModelRendererTurbo(this, 44, 110, textureX, textureY); // Box 38
		bodyModel[30] = new ModelRendererTurbo(this, 171, 87, textureX, textureY); // Box 39
		bodyModel[31] = new ModelRendererTurbo(this, 208, 33, textureX, textureY); // Box 40
		bodyModel[32] = new ModelRendererTurbo(this, 170, 82, textureX, textureY); // Box 41
		bodyModel[33] = new ModelRendererTurbo(this, 144, 82, textureX, textureY); // Box 42
		bodyModel[34] = new ModelRendererTurbo(this, 163, 88, textureX, textureY); // Box 43
		bodyModel[35] = new ModelRendererTurbo(this, 95, 75, textureX, textureY); // Box 46
		bodyModel[36] = new ModelRendererTurbo(this, 137, 75, textureX, textureY); // Box 47
		bodyModel[37] = new ModelRendererTurbo(this, 23, 63, textureX, textureY); // Box 48
		bodyModel[38] = new ModelRendererTurbo(this, 23, 63, textureX, textureY); // Box 49
		bodyModel[39] = new ModelRendererTurbo(this, 10, 58, textureX, textureY); // Box 50 boom extendus up
		bodyModel[40] = new ModelRendererTurbo(this, 10, 58, textureX, textureY); // Box 51 boom extendus up
		bodyModel[41] = new ModelRendererTurbo(this, 2, 100, textureX, textureY); // Box 52 boom extendus up
		bodyModel[42] = new ModelRendererTurbo(this, 1, 63, textureX, textureY); // Box 53 boom extendus up
		bodyModel[43] = new ModelRendererTurbo(this, 1, 63, textureX, textureY); // Box 54 boom extendus up
		bodyModel[44] = new ModelRendererTurbo(this, 21, 109, textureX, textureY); // Box 55 part that holds forks
		bodyModel[45] = new ModelRendererTurbo(this, 1, 75, textureX, textureY, "cull"); // Box 57 cull part that holds forks
		bodyModel[46] = new ModelRendererTurbo(this, 1, 122, textureX, textureY); // Box 58 fork
		bodyModel[47] = new ModelRendererTurbo(this, 1, 122, textureX, textureY); // Box 59 fork
		bodyModel[48] = new ModelRendererTurbo(this, 1, 100, textureX, textureY, "cull"); // Box 57 cull part that holds forks
		bodyModel[49] = new ModelRendererTurbo(this, 129, 98, textureX, textureY); // Box 61
		bodyModel[50] = new ModelRendererTurbo(this, 195, 26, textureX, textureY); // Box 62
		bodyModel[51] = new ModelRendererTurbo(this, 229, 26, textureX, textureY); // Box 63
		bodyModel[52] = new ModelRendererTurbo(this, 211, 27, textureX, textureY); // Box 64
		bodyModel[53] = new ModelRendererTurbo(this, 196, 17, textureX, textureY); // Box 65
		bodyModel[54] = new ModelRendererTurbo(this, 199, 9, textureX, textureY); // Box 66
		bodyModel[55] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 67
		bodyModel[56] = new ModelRendererTurbo(this, 230, 17, textureX, textureY); // Box 68
		bodyModel[57] = new ModelRendererTurbo(this, 135, 70, textureX, textureY, "cull"); // Box 512 cull
		bodyModel[58] = new ModelRendererTurbo(this, 138, 67, textureX, textureY); // Box 409 commander base
		bodyModel[59] = new ModelRendererTurbo(this, 138, 63, textureX, textureY, "glow"); // Box 410 commander beacon
		bodyModel[60] = new ModelRendererTurbo(this, 228, 111, textureX, textureY); // Box 72
		bodyModel[61] = new ModelRendererTurbo(this, 239, 110, textureX, textureY); // Box 73
		bodyModel[62] = new ModelRendererTurbo(this, 215, 110, textureX, textureY); // Box 74
		bodyModel[63] = new ModelRendererTurbo(this, 169, 24, textureX, textureY); // Box 184
		bodyModel[64] = new ModelRendererTurbo(this, 158, 31, textureX, textureY); // Box 185
		bodyModel[65] = new ModelRendererTurbo(this, 182, 31, textureX, textureY); // Box 186
		bodyModel[66] = new ModelRendererTurbo(this, 168, 37, textureX, textureY); // Box 78
		bodyModel[67] = new ModelRendererTurbo(this, 150, 98, textureX, textureY); // Box 79
		bodyModel[68] = new ModelRendererTurbo(this, 201, 120, textureX, textureY); // Box 81
		bodyModel[69] = new ModelRendererTurbo(this, 208, 120, textureX, textureY); // Box 82
		bodyModel[70] = new ModelRendererTurbo(this, 128, 70, textureX, textureY); // Box 83 diesel exhaust
		bodyModel[71] = new ModelRendererTurbo(this, 127, 71, textureX, textureY); // Box 84 diesel exhaust
		bodyModel[72] = new ModelRendererTurbo(this, 126, 70, textureX, textureY); // Box 85 diesel exhaust
		bodyModel[73] = new ModelRendererTurbo(this, 126, 65, textureX, textureY); // Box 86 diesel exhaust
		bodyModel[74] = new ModelRendererTurbo(this, 152, 74, textureX, textureY, "glow"); // Box 188 reverselight
		bodyModel[75] = new ModelRendererTurbo(this, 145, 74, textureX, textureY, "glow"); // Box 188 reverselight
		bodyModel[76] = new ModelRendererTurbo(this, 146, 70, textureX, textureY); // Box 89
		bodyModel[77] = new ModelRendererTurbo(this, 153, 70, textureX, textureY); // Box 90
		bodyModel[78] = new ModelRendererTurbo(this, 121, 72, textureX, textureY, "glow"); // Box 91 taillight
		bodyModel[79] = new ModelRendererTurbo(this, 121, 72, textureX, textureY, "glow"); // Box 92 taillight
		bodyModel[80] = new ModelRendererTurbo(this, 129, 47, textureX, textureY, "glow"); // Box 113 headlight
		bodyModel[81] = new ModelRendererTurbo(this, 122, 47, textureX, textureY, "glow"); // Box 114 headlihhy
		bodyModel[82] = new ModelRendererTurbo(this, 130, 44, textureX, textureY); // Box 115
		bodyModel[83] = new ModelRendererTurbo(this, 123, 44, textureX, textureY); // Box 116
		bodyModel[84] = new ModelRendererTurbo(this, 143, 44, textureX, textureY); // Box 226 steeringwhool
		bodyModel[85] = new ModelRendererTurbo(this, 151, 50, textureX, textureY); // Box 227
		bodyModel[86] = new ModelRendererTurbo(this, 157, 81, textureX, textureY); // Box 179
		bodyModel[87] = new ModelRendererTurbo(this, 160, 69, textureX, textureY); // Box 195
		bodyModel[88] = new ModelRendererTurbo(this, 181, 83, textureX, textureY); // Box 121
		bodyModel[89] = new ModelRendererTurbo(this, 188, 79, textureX, textureY); // Box 122
		bodyModel[90] = new ModelRendererTurbo(this, 188, 83, textureX, textureY); // Box 123
		bodyModel[91] = new ModelRendererTurbo(this, 168, 50, textureX, textureY); // Box 124
		bodyModel[92] = new ModelRendererTurbo(this, 188, 75, textureX, textureY); // Box 125
		bodyModel[93] = new ModelRendererTurbo(this, 181, 75, textureX, textureY); // Box 126
		bodyModel[94] = new ModelRendererTurbo(this, 188, 71, textureX, textureY); // Box 127
		bodyModel[95] = new ModelRendererTurbo(this, 147, 54, textureX, textureY); // Box 128
		bodyModel[96] = new ModelRendererTurbo(this, 122, 114, textureX, textureY); // Box 129
		bodyModel[97] = new ModelRendererTurbo(this, 118, 122, textureX, textureY); // Box 130
		bodyModel[98] = new ModelRendererTurbo(this, 86, 51, textureX, textureY); // Box 131
		bodyModel[99] = new ModelRendererTurbo(this, 118, 122, textureX, textureY); // Box 132
		bodyModel[100] = new ModelRendererTurbo(this, 122, 114, textureX, textureY); // Box 133
		bodyModel[101] = new ModelRendererTurbo(this, 86, 45, textureX, textureY); // Box 102

		bodyModel[0].addBox(-1F, -3F, -1F, 2, 6, 3, 0F); // Box 136 Wheel1
		bodyModel[0].setRotationPoint(-8.5F, 7F, -8F);

		bodyModel[1].addShapeBox(-3F, -1F, -1F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9 Wheel1
		bodyModel[1].setRotationPoint(-8.5F, 7F, -8F);

		bodyModel[2].addShapeBox(1F, -1F, -1F, 2, 2, 3, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12 Wheel1
		bodyModel[2].setRotationPoint(-8.5F, 7F, -8F);

		bodyModel[3].addBox(-3F, -3F, -1.01F, 6, 6, 0, 0F); // Box 17 Wheel1
		bodyModel[3].setRotationPoint(-8.5F, 7F, -8F);

		bodyModel[4].addBox(-1F, -3F, -1F, 2, 6, 3, 0F); // Box 136 Wheel2
		bodyModel[4].setRotationPoint(-8.5F, 7F, 7F);

		bodyModel[5].addShapeBox(-3F, -1F, -1F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9 Wheel2
		bodyModel[5].setRotationPoint(-8.5F, 7F, 7F);

		bodyModel[6].addShapeBox(1F, -1F, -1F, 2, 2, 3, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12 Wheel2
		bodyModel[6].setRotationPoint(-8.5F, 7F, 7F);

		bodyModel[7].addBox(-3F, -3F, 1.01F, 6, 6, 0, 0F); // Box 17 Wheel2
		bodyModel[7].setRotationPoint(-8.5F, 7F, 8F);

		bodyModel[8].addShapeBox(-1F, -1F, -7F, 2, 2, 12, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 23 axle
		bodyModel[8].setRotationPoint(-8.5F, 7F, 1F);

		bodyModel[9].addShapeBox(-1F, -1F, -7F, 2, 2, 14, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 10 axle
		bodyModel[9].setRotationPoint(8.5F, 7.5F, 0F);

		bodyModel[10].addBox(-1F, -2.5F, -1F, 2, 5, 2, 0F); // Box 11 Wheel 3
		bodyModel[10].setRotationPoint(8.5F, 7.5F, -8F);

		bodyModel[11].addBox(-2.5F, -2.5F, -1.01F, 5, 5, 0, 0F); // Box 14 Wheel 3
		bodyModel[11].setRotationPoint(8.5F, 7.5F, -8F);

		bodyModel[12].addShapeBox(-2.5F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F); // Box 15 Wheel 3
		bodyModel[12].setRotationPoint(8.5F, 7.5F, -8F);

		bodyModel[13].addShapeBox(0.5F, -1F, -1F, 2, 2, 2, 0F,-0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.5F, 0F); // Box 17 Wheel 3
		bodyModel[13].setRotationPoint(8.5F, 7.5F, -8F);

		bodyModel[14].addBox(-1F, -2.5F, -1F, 2, 5, 2, 0F); // Box 11 Wheel 4
		bodyModel[14].setRotationPoint(8.5F, 7.5F, 8F);

		bodyModel[15].addBox(-2.5F, -2.5F, 1.01F, 5, 5, 0, 0F); // Box 14 Wheel 4
		bodyModel[15].setRotationPoint(8.5F, 7.5F, 8F);

		bodyModel[16].addShapeBox(-2.5F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F); // Box 15 Wheel 4
		bodyModel[16].setRotationPoint(8.5F, 7.5F, 8F);

		bodyModel[17].addShapeBox(0.5F, -1F, -1F, 2, 2, 2, 0F,-0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.5F, 0F); // Box 17 Wheel 4
		bodyModel[17].setRotationPoint(8.5F, 7.5F, 8F);

		bodyModel[18].addBox(0F, 0F, 0F, 10, 3, 18, 0F); // Box 22
		bodyModel[18].setRotationPoint(-4.5F, 6F, -9F);

		bodyModel[19].addBox(0F, 0F, 0F, 7, 5, 10, 0F); // Box 23
		bodyModel[19].setRotationPoint(5.5F, 4F, -5F);

		bodyModel[20].addBox(0F, 0F, 0F, 3, 7, 18, 0F); // Box 24
		bodyModel[20].setRotationPoint(5.5F, -3F, -9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25 cull
		bodyModel[21].setRotationPoint(-6.5F, -17F, -8F);

		bodyModel[22].addBox(0F, 0F, 0F, 10, 1, 18, 0F); // Box 26 cull
		bodyModel[22].setRotationPoint(-4.5F, -17F, -9F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 13, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 27
		bodyModel[23].setRotationPoint(4.5F, -16F, -8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 7, 16, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 28
		bodyModel[24].setRotationPoint(8.5F, -3F, -8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 18, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 29 cull
		bodyModel[25].setRotationPoint(-6.5F, -17F, -9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 30 cull
		bodyModel[26].setRotationPoint(-7.5F, -15F, -9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 11, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 31 cull
		bodyModel[27].setRotationPoint(-8.5F, -9F, -9F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32 cull
		bodyModel[28].setRotationPoint(-7.5F, -16F, -9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 6, 3, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 38
		bodyModel[29].setRotationPoint(-10.5F, 6F, -5F);

		bodyModel[30].addBox(0F, 0F, 0F, 6, 7, 18, 0F); // Box 39
		bodyModel[30].setRotationPoint(-0.5F, -1F, -9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 7, 14, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 40
		bodyModel[31].setRotationPoint(11.5F, -3F, -7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 41
		bodyModel[32].setRotationPoint(-1.5F, -1F, -9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[33].setRotationPoint(-1.5F, -1F, 1F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 43
		bodyModel[34].setRotationPoint(-1.5F, -1F, -1F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 46
		bodyModel[35].setRotationPoint(3.5F, -16F, -9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 47
		bodyModel[36].setRotationPoint(3.5F, -16F, 8F);

		bodyModel[37].addBox(0F, 0F, 0F, 3, 26, 2, 0F); // Box 48
		bodyModel[37].setRotationPoint(-13F, -17F, -5F);

		bodyModel[38].addBox(0F, 0F, 0F, 3, 26, 2, 0F); // Box 49
		bodyModel[38].setRotationPoint(-13F, -17F, 3F);

		bodyModel[39].addBox(0F, 0F, 0F, 4, 3, 3, 0F); // Box 50 boom extendus up
		bodyModel[39].setRotationPoint(-12.75F, -17.5F, -5.5F);

		bodyModel[40].addBox(0F, 0F, 0F, 4, 3, 3, 0F); // Box 51 boom extendus up
		bodyModel[40].setRotationPoint(-12.75F, -17.5F, 2.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 52 boom extendus up
		bodyModel[41].setRotationPoint(-10.75F, -17.5F, -2.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 26, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 53 boom extendus up
		bodyModel[42].setRotationPoint(-13.5F, -17F, -5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 26, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 54 boom extendus up
		bodyModel[43].setRotationPoint(-13.5F, -17F, 3F);

		bodyModel[44].addBox(0F, 0F, 0F, 2, 1, 17, 0F); // Box 55 part that holds forks
		bodyModel[44].setRotationPoint(-15.25F, 8F, -8.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 7, 17, 0F); // Box 57 cull part that holds forks
		bodyModel[45].setRotationPoint(-14.25F, -3F, -8.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 58 fork
		bodyModel[46].setRotationPoint(-27.25F, 9F, -6.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 59 fork
		bodyModel[47].setRotationPoint(-27.25F, 9F, 3.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 4, 17, 0F); // Box 57 cull part that holds forks
		bodyModel[48].setRotationPoint(-14.25F, 4F, -8.5F);

		bodyModel[49].addBox(0F, 0F, 0F, 9, 4, 10, 0F); // Box 61
		bodyModel[49].setRotationPoint(-9.5F, 2F, -5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[50].setRotationPoint(4.5F, -4F, -9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[51].setRotationPoint(4.5F, -4F, 2F);

		bodyModel[52].addBox(0F, 0F, 0F, 8, 1, 4, 0F); // Box 64
		bodyModel[52].setRotationPoint(4.5F, -4F, -2F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[53].setRotationPoint(8.5F, -4F, -9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[54].setRotationPoint(11.5F, -4F, -8F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 67
		bodyModel[55].setRotationPoint(11.5F, -4F, 2F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 68
		bodyModel[56].setRotationPoint(8.5F, -4F, 2F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 512 cull
		bodyModel[57].setRotationPoint(4.5F, -16F, -1F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[58].setRotationPoint(6F, -17F, -0.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[59].setRotationPoint(6F, -18F, -0.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 12, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[60].setRotationPoint(12.5F, -3F, -2F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 12, 5, 0F,0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[61].setRotationPoint(12.5F, -3F, 2F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 12, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[62].setRotationPoint(12.5F, -3F, -7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 4, 8, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 184
		bodyModel[63].setRotationPoint(7.5F, -8F, -4F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, -0.25F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0F, -0.25F, 0F); // Box 185
		bodyModel[64].setRotationPoint(6.5F, -7F, -4F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0.25F, 1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 1F, 0F); // Box 186
		bodyModel[65].setRotationPoint(9.5F, -7F, -4F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 78
		bodyModel[66].setRotationPoint(7.5F, -6F, -4.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[67].setRotationPoint(5.5F, 4F, -9F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 81
		bodyModel[68].setRotationPoint(11.5F, 4F, -7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 82
		bodyModel[69].setRotationPoint(11.5F, 4F, 5F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 83 diesel exhaust
		bodyModel[70].setRotationPoint(5F, -13F, -9.25F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 84 diesel exhaust
		bodyModel[71].setRotationPoint(6F, -13F, -9.25F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, -2F); // Box 85 diesel exhaust
		bodyModel[72].setRotationPoint(6F, -13F, -8.25F);

		bodyModel[73].addBox(-1F, 0F, -1F, 2, 2, 2, 0F); // Box 86 diesel exhaust
		bodyModel[73].setRotationPoint(7.25F, -15F, -7F);
		bodyModel[73].rotateAngleY = -0.78539816F;

		bodyModel[74].addShapeBox(-1F, 0F, -1F, 1, 2, 2, 0F,-0.5F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F); // Box 188 reverselight
		bodyModel[74].setRotationPoint(5.5F, -16F, 2F);

		bodyModel[75].addShapeBox(-1F, 0F, -1F, 1, 2, 2, 0F,-0.5F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F); // Box 188 reverselight
		bodyModel[75].setRotationPoint(5.5F, -16F, -2F);

		bodyModel[76].addBox(-1F, 0F, -1F, 1, 2, 1, 0F); // Box 89
		bodyModel[76].setRotationPoint(5F, -16.5F, -1.5F);

		bodyModel[77].addBox(-1F, 0F, -1F, 1, 2, 1, 0F); // Box 90
		bodyModel[77].setRotationPoint(5F, -16.5F, 2.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 91 taillight
		bodyModel[78].setRotationPoint(5.5F, -17F, -9F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 92 taillight
		bodyModel[79].setRotationPoint(5.5F, -17F, 8F);

		bodyModel[80].addShapeBox(-1F, 0F, -1F, 1, 2, 2, 0F,0F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 113 headlight
		bodyModel[80].setRotationPoint(-6.5F, -17F, -7F);

		bodyModel[81].addShapeBox(-1F, 0F, -1F, 1, 2, 2, 0F,0F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 114 headlihhy
		bodyModel[81].setRotationPoint(-6.5F, -17F, 7F);

		bodyModel[82].addBox(-1F, 0F, -1F, 1, 1, 1, 0F); // Box 115
		bodyModel[82].setRotationPoint(-6F, -16.5F, -6.5F);

		bodyModel[83].addBox(-1F, 0F, -1F, 1, 1, 1, 0F); // Box 116
		bodyModel[83].setRotationPoint(-6F, -16.5F, 7.5F);

		bodyModel[84].addShapeBox(-3F, 0F, -3F, 5, 0, 5, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 226 steeringwhool
		bodyModel[84].setRotationPoint(-6F, -7F, 0F);
		bodyModel[84].rotateAngleZ = -0.78539816F;

		bodyModel[85].addBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F); // Box 227
		bodyModel[85].setRotationPoint(-6F, -7F, 0F);
		bodyModel[85].rotateAngleZ = -0.78539816F;

		bodyModel[86].addBox(0F, 0F, 0F, 4, 1, 5, 0F); // Box 179
		bodyModel[86].setRotationPoint(-2F, -2F, -2.5F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 6, 5, 0F); // Box 195
		bodyModel[87].setRotationPoint(2F, -7F, -2.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[88].setRotationPoint(-0.5F, -2F, -9F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[89].setRotationPoint(0.5F, -3F, -9F);

		bodyModel[90].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 123
		bodyModel[90].setRotationPoint(0.5F, -2F, -9F);

		bodyModel[91].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 124
		bodyModel[91].setRotationPoint(4.5F, -3F, -9F);

		bodyModel[92].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 125
		bodyModel[92].setRotationPoint(0.5F, -2F, 7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[93].setRotationPoint(-0.5F, -2F, 7F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[94].setRotationPoint(0.5F, -3F, 7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 128
		bodyModel[95].setRotationPoint(-8F, -6F, -2F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 0, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 129
		bodyModel[96].setRotationPoint(-5.5F, 3F, -9F);

		bodyModel[97].addBox(0F, 0F, 0F, 6, 0, 4, 0F); // Box 130
		bodyModel[97].setRotationPoint(-11.5F, 3F, -9F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 131
		bodyModel[98].setRotationPoint(-9.5F, 2F, -9F);

		bodyModel[99].addBox(0F, 0F, 0F, 6, 0, 4, 0F); // Box 132
		bodyModel[99].setRotationPoint(-11.5F, 3F, 5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 0, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 133
		bodyModel[100].setRotationPoint(-5.5F, 3F, 5F);

		bodyModel[101].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 102
		bodyModel[101].setRotationPoint(-9.5F, 2F, 5F);
	}
	/*@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		for(ModelRendererTurbo m :bodyModel) {
			if(m.boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				m.render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}else if(m.boxName.equals("nocull")){
				GL11.glDisable(GL11.GL_CULL_FACE);
				m.render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			}else{
				m.render(f5);
			}
		}
	}*/
}