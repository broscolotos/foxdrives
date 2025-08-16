//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 26.01.2025 - 21:17:18
// Last changed on: 26.01.2025 - 21:17:18

package bidahochi.foxdrives.models; //Path where the model is located

import bidahochi.foxdrives.util.BoxName;
import fdfexcraft.tmt_slim.ModelConverter;
import fdfexcraft.tmt_slim.ModelRendererTurbo;

public class Modelawooga extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public Modelawooga() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[100];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 7, 23, textureX, textureY); // Box 23 axle 1-2
		bodyModel[1] = new ModelRendererTurbo(this, 7, 23, textureX, textureY); // Box 23 axle 3-4
		bodyModel[2] = new ModelRendererTurbo(this, 66, 9, textureX, textureY); // Box 18
		bodyModel[3] = new ModelRendererTurbo(this, 40, 34, textureX, textureY); // Box 19
		bodyModel[4] = new ModelRendererTurbo(this, 80, 41, textureX, textureY); // Box 20
		bodyModel[5] = new ModelRendererTurbo(this, 59, 41, textureX, textureY); // Box 21
		bodyModel[6] = new ModelRendererTurbo(this, 101, 33, textureX, textureY); // Box 22
		bodyModel[7] = new ModelRendererTurbo(this, 91, 2, textureX, textureY); // Box 23
		bodyModel[8] = new ModelRendererTurbo(this, 100, 2, textureX, textureY); // Box 24
		bodyModel[9] = new ModelRendererTurbo(this, 91, 5, textureX, textureY); // Box 25
		bodyModel[10] = new ModelRendererTurbo(this, 100, 5, textureX, textureY); // Box 26
		bodyModel[11] = new ModelRendererTurbo(this, 91, 2, textureX, textureY); // Box 27
		bodyModel[12] = new ModelRendererTurbo(this, 100, 2, textureX, textureY); // Box 28
		bodyModel[13] = new ModelRendererTurbo(this, 91, 5, textureX, textureY); // Box 29
		bodyModel[14] = new ModelRendererTurbo(this, 100, 5, textureX, textureY); // Box 30
		bodyModel[15] = new ModelRendererTurbo(this, 100, 9, textureX, textureY); // Box 31
		bodyModel[16] = new ModelRendererTurbo(this, 100, 12, textureX, textureY); // Box 32
		bodyModel[17] = new ModelRendererTurbo(this, 91, 12, textureX, textureY); // Box 33
		bodyModel[18] = new ModelRendererTurbo(this, 91, 9, textureX, textureY); // Box 34
		bodyModel[19] = new ModelRendererTurbo(this, 100, 9, textureX, textureY); // Box 35
		bodyModel[20] = new ModelRendererTurbo(this, 91, 9, textureX, textureY); // Box 36
		bodyModel[21] = new ModelRendererTurbo(this, 100, 12, textureX, textureY); // Box 37
		bodyModel[22] = new ModelRendererTurbo(this, 91, 12, textureX, textureY); // Box 38
		bodyModel[23] = new ModelRendererTurbo(this, 39, 4, textureX, textureY); // Box 43
		bodyModel[24] = new ModelRendererTurbo(this, 39, 9, textureX, textureY); // Box 44
		bodyModel[25] = new ModelRendererTurbo(this, 39, 1, textureX, textureY); // Box 45
		bodyModel[26] = new ModelRendererTurbo(this, 39, 4, textureX, textureY); // Box 46
		bodyModel[27] = new ModelRendererTurbo(this, 39, 1, textureX, textureY); // Box 47
		bodyModel[28] = new ModelRendererTurbo(this, 39, 9, textureX, textureY); // Box 48
		bodyModel[29] = new ModelRendererTurbo(this, 40, 12, textureX, textureY); // Box 49
		bodyModel[30] = new ModelRendererTurbo(this, 40, 12, textureX, textureY); // Box 50
		bodyModel[31] = new ModelRendererTurbo(this, 80, 48, textureX, textureY); // Box 51
		bodyModel[32] = new ModelRendererTurbo(this, 59, 48, textureX, textureY); // Box 52
		bodyModel[33] = new ModelRendererTurbo(this, 56, 22, textureX, textureY); // Box 53
		bodyModel[34] = new ModelRendererTurbo(this, 51, 38, textureX, textureY); // Box 54
		bodyModel[35] = new ModelRendererTurbo(this, 51, 34, textureX, textureY); // Box 55
		bodyModel[36] = new ModelRendererTurbo(this, 68, 5, textureX, textureY); // Box 56
		bodyModel[37] = new ModelRendererTurbo(this, 68, 1, textureX, textureY); // Box 57
		bodyModel[38] = new ModelRendererTurbo(this, 71, 19, textureX, textureY); // Box 58
		bodyModel[39] = new ModelRendererTurbo(this, 57, 53, textureX, textureY); // Box 59
		bodyModel[40] = new ModelRendererTurbo(this, 107, 53, textureX, textureY); // Box 60
		bodyModel[41] = new ModelRendererTurbo(this, 107, 56, textureX, textureY); // Box 61
		bodyModel[42] = new ModelRendererTurbo(this, 107, 61, textureX, textureY); // Box 62
		bodyModel[43] = new ModelRendererTurbo(this, 38, 50, textureX, textureY); // Box 63
		bodyModel[44] = new ModelRendererTurbo(this, 26, 38, textureX, textureY); // Box 67
		bodyModel[45] = new ModelRendererTurbo(this, 18, 60, textureX, textureY); // Box 68
		bodyModel[46] = new ModelRendererTurbo(this, 8, 61, textureX, textureY); // Box 69
		bodyModel[47] = new ModelRendererTurbo(this, -1, 61, textureX, textureY); // Box 70
		bodyModel[48] = new ModelRendererTurbo(this, 18, 60, textureX, textureY); // Box 71
		bodyModel[49] = new ModelRendererTurbo(this, 32, 61, textureX, textureY); // Box 74
		bodyModel[50] = new ModelRendererTurbo(this, 39, 61, textureX, textureY); // Box 75
		bodyModel[51] = new ModelRendererTurbo(this, 46, 61, textureX, textureY); // Box 76
		bodyModel[52] = new ModelRendererTurbo(this, 98, 24, textureX, textureY); // Box 226 steeringwhool
		bodyModel[53] = new ModelRendererTurbo(this, 100, 26, textureX, textureY); // Box 227
		bodyModel[54] = new ModelRendererTurbo(this, 102, 38, textureX, textureY); // Box 84
		bodyModel[55] = new ModelRendererTurbo(this, 102, 35, textureX, textureY); // Box 85
		bodyModel[56] = new ModelRendererTurbo(this, 29, 50, textureX, textureY); // Box 86
		bodyModel[57] = new ModelRendererTurbo(this, 36, 3, textureX, textureY, BoxName.headLight); // Box 87 headlight
		bodyModel[58] = new ModelRendererTurbo(this, 36, 1, textureX, textureY, BoxName.headLight); // Box 88 headlight
		bodyModel[59] = new ModelRendererTurbo(this, 33, 1, textureX, textureY, BoxName.headLight); // Box 89 headlight
		bodyModel[60] = new ModelRendererTurbo(this, 36, 3, textureX, textureY, BoxName.headLight); // Box 87 headlight
		bodyModel[61] = new ModelRendererTurbo(this, 36, 1, textureX, textureY, BoxName.headLight); // Box 88 headlight
		bodyModel[62] = new ModelRendererTurbo(this, 33, 1, textureX, textureY, BoxName.headLight); // Box 89 headlight
		bodyModel[63] = new ModelRendererTurbo(this, 46, 4, textureX, textureY); // Box 93
		bodyModel[64] = new ModelRendererTurbo(this, 53, 1, textureX, textureY); // Box 94
		bodyModel[65] = new ModelRendererTurbo(this, 118, 48, textureX, textureY); // Box 95
		bodyModel[66] = new ModelRendererTurbo(this, 125, 46, textureX, textureY, BoxName.brakeLight); // Box 96 taillight lantern
		bodyModel[67] = new ModelRendererTurbo(this, 65, 10, textureX, textureY); // Box 97
		bodyModel[68] = new ModelRendererTurbo(this, 66, 19, textureX, textureY); // Box 98
		bodyModel[69] = new ModelRendererTurbo(this, 84, 53, textureX, textureY); // Box 99
		bodyModel[70] = new ModelRendererTurbo(this, 83, 33, textureX, textureY); // Box 100
		bodyModel[71] = new ModelRendererTurbo(this, 120, 45, textureX, textureY); // Box 101
		bodyModel[72] = new ModelRendererTurbo(this, 48, 0, textureX, textureY); // Box 102
		bodyModel[73] = new ModelRendererTurbo(this, 26, 10, textureX, textureY); // Box 14 Wheel1
		bodyModel[74] = new ModelRendererTurbo(this, 14, 18, textureX, textureY); // Box 17 Wheel1
		bodyModel[75] = new ModelRendererTurbo(this, 17, 10, textureX, textureY); // Box 20 Wheel1
		bodyModel[76] = new ModelRendererTurbo(this, 8, 10, textureX, textureY); // Box 22 Wheel1
		bodyModel[77] = new ModelRendererTurbo(this, 26, 10, textureX, textureY); // Box 114 Wheel2
		bodyModel[78] = new ModelRendererTurbo(this, 14, 18, textureX, textureY); // Box 115 Wheel2
		bodyModel[79] = new ModelRendererTurbo(this, 8, 10, textureX, textureY); // Box 116 Wheel2
		bodyModel[80] = new ModelRendererTurbo(this, 17, 10, textureX, textureY); // Box 117 Wheel2
		bodyModel[81] = new ModelRendererTurbo(this, 8, 10, textureX, textureY); // Box 118 Wheel3
		bodyModel[82] = new ModelRendererTurbo(this, 8, 10, textureX, textureY); // Box 119 Wheel4
		bodyModel[83] = new ModelRendererTurbo(this, 26, 10, textureX, textureY); // Box 120 Wheel4
		bodyModel[84] = new ModelRendererTurbo(this, 17, 10, textureX, textureY); // Box 121 Wheel4
		bodyModel[85] = new ModelRendererTurbo(this, 14, 18, textureX, textureY); // Box 122 Wheel4
		bodyModel[86] = new ModelRendererTurbo(this, 14, 18, textureX, textureY); // Box 123 Wheel3
		bodyModel[87] = new ModelRendererTurbo(this, 17, 10, textureX, textureY); // Box 124 Wheel3
		bodyModel[88] = new ModelRendererTurbo(this, 26, 10, textureX, textureY); // Box 125 Wheel3
		bodyModel[89] = new ModelRendererTurbo(this, 8, 28, textureX, textureY); // Box 126
		bodyModel[90] = new ModelRendererTurbo(this, 14, 36, textureX, textureY); // Box 127
		bodyModel[91] = new ModelRendererTurbo(this, 17, 28, textureX, textureY); // Box 128
		bodyModel[92] = new ModelRendererTurbo(this, 26, 28, textureX, textureY); // Box 129
		bodyModel[93] = new ModelRendererTurbo(this, 8, 61, textureX, textureY); // Box 130
		bodyModel[94] = new ModelRendererTurbo(this, -1, 61, textureX, textureY); // Box 131
		bodyModel[95] = new ModelRendererTurbo(this, 32, 61, textureX, textureY); // Box 132
		bodyModel[96] = new ModelRendererTurbo(this, 39, 61, textureX, textureY); // Box 133
		bodyModel[97] = new ModelRendererTurbo(this, 46, 61, textureX, textureY); // Box 134
		bodyModel[98] = new ModelRendererTurbo(this, 12, 47, textureX, textureY); // Box 410 plate
		bodyModel[99] = new ModelRendererTurbo(this, 12, 47, textureX, textureY); // Box 183 plate

		bodyModel[0].addShapeBox(0F, -1F, -1F, 12, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 23 axle 1-2
		bodyModel[0].setRotationPoint(-8.5F, 7F, -6F);
		bodyModel[0].rotateAngleY = 1.57079633F;

		bodyModel[1].addShapeBox(0F, -1F, -1F, 12, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 23 axle 3-4
		bodyModel[1].setRotationPoint(7.5F, 7F, -6F);
		bodyModel[1].rotateAngleY = 1.57079633F;

		bodyModel[2].addShapeBox(0F, 0F, 0F, 7, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 18
		bodyModel[2].setRotationPoint(-11F, 0F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // Box 19
		bodyModel[3].setRotationPoint(-4F, 0F, -4F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[4].setRotationPoint(-4F, 0F, -5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[5].setRotationPoint(-4F, 0F, 4F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[6].setRotationPoint(4F, -1F, -4F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 23
		bodyModel[7].setRotationPoint(-11F, 5F, -4F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[8].setRotationPoint(-8F, 5F, -4F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 25
		bodyModel[9].setRotationPoint(-11F, 7F, -4F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[10].setRotationPoint(-8F, 7F, -4F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 27
		bodyModel[11].setRotationPoint(-11F, 5F, 3F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[12].setRotationPoint(-8F, 5F, 3F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 29
		bodyModel[13].setRotationPoint(-11F, 7F, 3F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[14].setRotationPoint(-8F, 7F, 3F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[15].setRotationPoint(7.05F, 5F, -4F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[16].setRotationPoint(7.05F, 7F, -4F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 33
		bodyModel[17].setRotationPoint(4.05F, 7F, -4F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 34
		bodyModel[18].setRotationPoint(4.05F, 5F, -4F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[19].setRotationPoint(7.05F, 5F, 3F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 36
		bodyModel[20].setRotationPoint(4.05F, 5F, 3F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[21].setRotationPoint(7.05F, 7F, 3F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[22].setRotationPoint(4.05F, 7F, 3F);

		bodyModel[23].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 43
		bodyModel[23].setRotationPoint(-12F, 2F, -4F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 44
		bodyModel[24].setRotationPoint(-12F, 3F, -5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[25].setRotationPoint(-12F, 3F, -3F);

		bodyModel[26].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 46
		bodyModel[26].setRotationPoint(-12F, 2F, 3F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[27].setRotationPoint(-12F, 3F, 4F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 48
		bodyModel[28].setRotationPoint(-12F, 3F, 2F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 49
		bodyModel[29].setRotationPoint(-10F, 3F, -4F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 50
		bodyModel[30].setRotationPoint(-10F, 3F, 3F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[31].setRotationPoint(-4F, 5F, -5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 52
		bodyModel[32].setRotationPoint(-4F, 5F, 4F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[33].setRotationPoint(-4F, -6F, -6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[34].setRotationPoint(-4F, 0F, -6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 55
		bodyModel[35].setRotationPoint(-4F, 0F, 5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, -1F, 0F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[36].setRotationPoint(-11F, -1F, -2F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 57
		bodyModel[37].setRotationPoint(-11F, -1F, 0F);

		bodyModel[38].addBox(0F, 0F, 0F, 5, 3, 4, 0F); // Box 58
		bodyModel[38].setRotationPoint(-9F, 5F, -2F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[39].setRotationPoint(-4F, 7F, -4F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[40].setRotationPoint(6F, 2F, -4.5F);
		bodyModel[40].rotateAngleY = 1.57079633F;

		bodyModel[41].addBox(0F, 0F, 0F, 9, 3, 1, 0F); // Box 61
		bodyModel[41].setRotationPoint(7F, 1F, -4.5F);
		bodyModel[41].rotateAngleY = 1.57079633F;

		bodyModel[42].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 62
		bodyModel[42].setRotationPoint(8F, 2F, -4.5F);
		bodyModel[42].rotateAngleY = 1.57079633F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[43].setRotationPoint(4F, 4F, -4F);

		bodyModel[44].addBox(-1F, -1F, -4F, 2, 2, 3, 0F); // Box 67
		bodyModel[44].setRotationPoint(9.5F, 2F, 0.25F);
		bodyModel[44].rotateAngleX = 0.62831853F;
		bodyModel[44].rotateAngleY = -1.57079633F;

		bodyModel[45].addShapeBox(0F, 0F, 0F, 6, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[45].setRotationPoint(-3F, 6F, -7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 5, 0, 2, 0F,0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[46].setRotationPoint(-8F, 3.5F, -7F);

		bodyModel[47].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 70
		bodyModel[47].setRotationPoint(-12F, 3.5F, -7F);

		bodyModel[48].addShapeBox(-6F, 0F, -3F, 6, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[48].setRotationPoint(-3F, 6F, 4F);
		bodyModel[48].rotateAngleY = -3.14159265F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F); // Box 74
		bodyModel[49].setRotationPoint(3F, 3.5F, -7F);

		bodyModel[50].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 75
		bodyModel[50].setRotationPoint(6F, 3.5F, -7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[51].setRotationPoint(9F, 3.5F, -7F);

		bodyModel[52].addShapeBox(0F, -1.75F, -3.25F, 0, 5, 5, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 226 steeringwhool
		bodyModel[52].setRotationPoint(-2.25F, 0.5F, 0F);
		bodyModel[52].rotateAngleZ = 0.29670597F;

		bodyModel[53].addBox(-2F, -0.5F, -0.5F, 2, 1, 1, 0F); // Box 227
		bodyModel[53].setRotationPoint(-2.26F, 0.5F, 0F);
		bodyModel[53].rotateAngleZ = 0.29670597F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[54].setRotationPoint(3F, -1F, -5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[55].setRotationPoint(3F, -1F, 4F);

		bodyModel[56].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 86
		bodyModel[56].setRotationPoint(5F, 5F, -2F);

		bodyModel[57].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 87 headlight
		bodyModel[57].setRotationPoint(-12.01F, 2F, -4F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 88 headlight
		bodyModel[58].setRotationPoint(-12.01F, 3F, -5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89 headlight
		bodyModel[59].setRotationPoint(-12.01F, 3F, -3F);

		bodyModel[60].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 87 headlight
		bodyModel[60].setRotationPoint(-12.01F, 2F, 3F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 88 headlight
		bodyModel[61].setRotationPoint(-12.01F, 3F, 2F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89 headlight
		bodyModel[62].setRotationPoint(-12.01F, 3F, 4F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 93
		bodyModel[63].setRotationPoint(0F, 7.5F, 2F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -2.25F, 0F, -0.25F, 1.75F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -2.25F, 0F, 0F, 1.75F, 0F, 0F, -0.25F); // Box 94
		bodyModel[64].setRotationPoint(-6F, 7.5F, 0F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 95
		bodyModel[65].setRotationPoint(8F, 2F, -5F);

		bodyModel[66].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 96 taillight lantern
		bodyModel[66].setRotationPoint(9.76F, 2F, -4.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[67].setRotationPoint(-11F, -1F, -0.5F);

		bodyModel[68].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 98
		bodyModel[68].setRotationPoint(-11F, 5F, -0.5F);

		bodyModel[69].addShapeBox(0F, 0F, -3F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[69].setRotationPoint(1F, 4F, -4F);
		bodyModel[69].rotateAngleY = 1.57079633F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 100
		bodyModel[70].setRotationPoint(-4F, -1F, -3F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 101
		bodyModel[71].setRotationPoint(8.5F, 1F, -4.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 0, 10, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -4F, 0F, -5F, -4F); // Box 102
		bodyModel[72].setRotationPoint(-11.01F, 0F, -2F);

		bodyModel[73].addShapeBox(-1F, -3F, -1.01F, 3, 6, 1, 0F,0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F); // Box 14 Wheel1
		bodyModel[73].setRotationPoint(-8.5F, 7F, -5.75F);

		bodyModel[74].addShapeBox(-3F, -1F, -0.99F, 6, 3, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 17 Wheel1
		bodyModel[74].setRotationPoint(-8.5F, 7F, -5.75F);

		bodyModel[75].addShapeBox(-1F, -3F, -0.98F, 3, 6, 1, 0F,-2.25F, 0F, 0F, 1F, -1.75F, 0F, 1F, -1.75F, 0F, -2.25F, 0F, 0F, 2F, -1.75F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, 2F, -1.75F, 0F); // Box 20 Wheel1
		bodyModel[75].setRotationPoint(-8.5F, 7F, -5.75F);

		bodyModel[76].addShapeBox(-2F, -3F, -1F, 3, 6, 1, 0F,1F, -1.75F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 1F, -1.75F, 0F, -3.25F, 0F, 0F, 2F, -1.75F, 0F, 2F, -1.75F, 0F, -3.25F, 0F, 0F); // Box 22 Wheel1
		bodyModel[76].setRotationPoint(-8.5F, 7F, -5.75F);

		bodyModel[77].addShapeBox(-1F, -3F, -0.01F, 3, 6, 1, 0F,0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F); // Box 114 Wheel2
		bodyModel[77].setRotationPoint(-8.5F, 7F, 5.75F);

		bodyModel[78].addShapeBox(-3F, -1F, 0.01F, 6, 3, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 115 Wheel2
		bodyModel[78].setRotationPoint(-8.5F, 7F, 5.75F);

		bodyModel[79].addShapeBox(-2F, -3F, 0F, 3, 6, 1, 0F,1F, -1.75F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 1F, -1.75F, 0F, -3.25F, 0F, 0F, 2F, -1.75F, 0F, 2F, -1.75F, 0F, -3.25F, 0F, 0F); // Box 116 Wheel2
		bodyModel[79].setRotationPoint(-8.5F, 7F, 5.75F);

		bodyModel[80].addShapeBox(-1F, -3F, 0.02F, 3, 6, 1, 0F,-2.25F, 0F, 0F, 1F, -1.75F, 0F, 1F, -1.75F, 0F, -2.25F, 0F, 0F, 2F, -1.75F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, 2F, -1.75F, 0F); // Box 117 Wheel2
		bodyModel[80].setRotationPoint(-8.5F, 7F, 5.75F);

		bodyModel[81].addShapeBox(-2F, -3F, -1F, 3, 6, 1, 0F,1F, -1.75F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 1F, -1.75F, 0F, -3.25F, 0F, 0F, 2F, -1.75F, 0F, 2F, -1.75F, 0F, -3.25F, 0F, 0F); // Box 118 Wheel3
		bodyModel[81].setRotationPoint(7.5F, 7F, -5.75F);

		bodyModel[82].addShapeBox(-2F, -3F, 0F, 3, 6, 1, 0F,1F, -1.75F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 1F, -1.75F, 0F, -3.25F, 0F, 0F, 2F, -1.75F, 0F, 2F, -1.75F, 0F, -3.25F, 0F, 0F); // Box 119 Wheel4
		bodyModel[82].setRotationPoint(7.5F, 7F, 5.75F);

		bodyModel[83].addShapeBox(-1F, -3F, -0.01F, 3, 6, 1, 0F,0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F); // Box 120 Wheel4
		bodyModel[83].setRotationPoint(7.5F, 7F, 5.75F);

		bodyModel[84].addShapeBox(-1F, -3F, 0.02F, 3, 6, 1, 0F,-2.25F, 0F, 0F, 1F, -1.75F, 0F, 1F, -1.75F, 0F, -2.25F, 0F, 0F, 2F, -1.75F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, 2F, -1.75F, 0F); // Box 121 Wheel4
		bodyModel[84].setRotationPoint(7.5F, 7F, 5.75F);

		bodyModel[85].addShapeBox(-3F, -1F, 0.01F, 6, 3, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 122 Wheel4
		bodyModel[85].setRotationPoint(7.5F, 7F, 5.75F);

		bodyModel[86].addShapeBox(-3F, -1F, -0.99F, 6, 3, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 123 Wheel3
		bodyModel[86].setRotationPoint(7.5F, 7F, -5.75F);

		bodyModel[87].addShapeBox(-1F, -3F, -0.98F, 3, 6, 1, 0F,-2.25F, 0F, 0F, 1F, -1.75F, 0F, 1F, -1.75F, 0F, -2.25F, 0F, 0F, 2F, -1.75F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, 2F, -1.75F, 0F); // Box 124 Wheel3
		bodyModel[87].setRotationPoint(7.5F, 7F, -5.75F);

		bodyModel[88].addShapeBox(-1F, -3F, -1.01F, 3, 6, 1, 0F,0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F); // Box 125 Wheel3
		bodyModel[88].setRotationPoint(7.5F, 7F, -5.75F);

		bodyModel[89].addShapeBox(-2F, -3F, 0F, 3, 6, 1, 0F,1F, -1.75F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 1F, -1.75F, 0F, -3.25F, 0F, 0F, 2F, -1.75F, 0F, 2F, -1.75F, 0F, -3.25F, 0F, 0F); // Box 126
		bodyModel[89].setRotationPoint(9.5F, 2F, 0.25F);
		bodyModel[89].rotateAngleX = -0.62831853F;
		bodyModel[89].rotateAngleY = 1.57079633F;

		bodyModel[90].addShapeBox(-3F, -1F, 0.00999999999999979F, 6, 3, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 127
		bodyModel[90].setRotationPoint(9.5F, 2F, 0.25F);
		bodyModel[90].rotateAngleX = -0.62831853F;
		bodyModel[90].rotateAngleY = 1.57079633F;

		bodyModel[91].addShapeBox(-1F, -3F, 0.0199999999999996F, 3, 6, 1, 0F,-2.25F, 0F, 0F, 1F, -1.75F, 0F, 1F, -1.75F, 0F, -2.25F, 0F, 0F, 2F, -1.75F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, 2F, -1.75F, 0F); // Box 128
		bodyModel[91].setRotationPoint(9.5F, 2F, 0.25F);
		bodyModel[91].rotateAngleX = -0.62831853F;
		bodyModel[91].rotateAngleY = 1.57079633F;

		bodyModel[92].addShapeBox(-1F, -3F, -0.00999999999999979F, 3, 6, 1, 0F,0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F); // Box 129
		bodyModel[92].setRotationPoint(9.5F, 2F, 0.25F);
		bodyModel[92].rotateAngleX = -0.62831853F;
		bodyModel[92].rotateAngleY = 1.57079633F;

		bodyModel[93].addShapeBox(0F, 0F, 0F, 5, 0, 2, 0F,0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[93].setRotationPoint(-8F, 3.5F, 5F);

		bodyModel[94].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 131
		bodyModel[94].setRotationPoint(-12F, 3.5F, 5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F); // Box 132
		bodyModel[95].setRotationPoint(3F, 3.5F, 5F);

		bodyModel[96].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 133
		bodyModel[96].setRotationPoint(6F, 3.5F, 5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[97].setRotationPoint(9F, 3.5F, 5F);

		bodyModel[98].addShapeBox(0F, -2F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 410 plate
		bodyModel[98].setRotationPoint(-9.26F, 8.5F, -2F);

		bodyModel[99].addShapeBox(0F, -2F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 183 plate
		bodyModel[99].setRotationPoint(9.01F, 8.5F, -2F);
	}
}