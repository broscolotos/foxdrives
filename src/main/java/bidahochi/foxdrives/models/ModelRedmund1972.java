//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Redmund 1972
// Model Creator: bidahochi
// Created on: 28.05.2023 - 08:24:06
// Last changed on: 28.05.2023 - 08:24:06

package bidahochi.foxdrives.models; //Path where the model is located


import bidahochi.foxdrives.util.BoxName;
import fdfexcraft.tmt_slim.ModelConverter;
import fdfexcraft.tmt_slim.ModelRendererTurbo;

public class ModelRedmund1972 extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelRedmund1972() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[106];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY, "wheel front"); // Box 136 Wheel1
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY, "wheel front"); // Box 9 Wheel1
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY, "wheel front"); // Box 12 Wheel1
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY, "wheel front"); // Box 17 Wheel1
		bodyModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY, "wheel front"); // Box 136 Wheel2
		bodyModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY, "wheel front"); // Box 9 Wheel2
		bodyModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY, "wheel front"); // Box 12 Wheel2
		bodyModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY, "wheel front"); // Box 17 Wheel2
		bodyModel[8] = new ModelRendererTurbo(this, 129, 1, textureX, textureY, "wheel"); // Box 136 Wheel3
		bodyModel[9] = new ModelRendererTurbo(this, 145, 1, textureX, textureY, "wheel"); // Box 9 Wheel3
		bodyModel[10] = new ModelRendererTurbo(this, 161, 1, textureX, textureY, "wheel"); // Box 12 Wheel3
		bodyModel[11] = new ModelRendererTurbo(this, 177, 1, textureX, textureY, "wheel"); // Box 17 Wheel3
		bodyModel[12] = new ModelRendererTurbo(this, 193, 1, textureX, textureY, "wheel"); // Box 136 Wheel4
		bodyModel[13] = new ModelRendererTurbo(this, 209, 1, textureX, textureY, "wheel"); // Box 9 Wheel4
		bodyModel[14] = new ModelRendererTurbo(this, 225, 1, textureX, textureY, "wheel"); // Box 12 Wheel4
		bodyModel[15] = new ModelRendererTurbo(this, 241, 1, textureX, textureY, "wheel"); // Box 17 Wheel4
		bodyModel[16] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 23 axle
		bodyModel[17] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 23 axle
		bodyModel[18] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 34
		bodyModel[35] = new ModelRendererTurbo(this, 25, 9, textureX, textureY, BoxName.headLight); // Box 188 headlight
		bodyModel[36] = new ModelRendererTurbo(this, 97, 9, textureX, textureY, BoxName.headLight); // Box 36 headlight
		bodyModel[37] = new ModelRendererTurbo(this, 121, 9, textureX, textureY, BoxName.leftTurnLight); // Box 188 turnlight L
		bodyModel[38] = new ModelRendererTurbo(this, 145, 9, textureX, textureY, BoxName.rightTurnLight); // Box 188 turnlight R
		bodyModel[39] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 39
		bodyModel[40] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 40
		bodyModel[41] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 41
		bodyModel[42] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 42
		bodyModel[43] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 43
		bodyModel[44] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 44
		bodyModel[45] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 45
		bodyModel[46] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 46
		bodyModel[47] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 47
		bodyModel[48] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 48
		bodyModel[49] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 49
		bodyModel[50] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 50
		bodyModel[51] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 346
		bodyModel[52] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 352
		bodyModel[53] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 53
		bodyModel[54] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 54
		bodyModel[55] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 55
		bodyModel[56] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 56
		bodyModel[57] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 57
		bodyModel[58] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 58
		bodyModel[59] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 59
		bodyModel[60] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 60
		bodyModel[61] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 61
		bodyModel[62] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 62
		bodyModel[63] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 63
		bodyModel[64] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 64
		bodyModel[65] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 65
		bodyModel[66] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 66
		bodyModel[67] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 67
		bodyModel[68] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 68
		bodyModel[69] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 69
		bodyModel[70] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 70 door swing left
		bodyModel[71] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 72 door swing right
		bodyModel[72] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 73 door swing left
		bodyModel[73] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 74 door swing right
		bodyModel[74] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 75
		bodyModel[75] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 76
		bodyModel[76] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 77
		bodyModel[77] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 78
		bodyModel[78] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 79
		bodyModel[79] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 80
		bodyModel[80] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 81
		bodyModel[81] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 165
		bodyModel[82] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 83
		bodyModel[83] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 84
		bodyModel[84] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 85
		bodyModel[85] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 226 steeringwhool
		bodyModel[86] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 227
		bodyModel[87] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 88
		bodyModel[88] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 89
		bodyModel[89] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 90
		bodyModel[90] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 91
		bodyModel[91] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 92
		bodyModel[92] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 93
		bodyModel[93] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 94
		bodyModel[94] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 95 tailgate swing -90 z
		bodyModel[95] = new ModelRendererTurbo(this, 65, 17, textureX, textureY, BoxName.brakeLight); // Box 96 taillight
		bodyModel[96] = new ModelRendererTurbo(this, 81, 25, textureX, textureY, BoxName.brakeLight); // Box 97 taillight
		bodyModel[97] = new ModelRendererTurbo(this, 25, 9, textureX, textureY, BoxName.rightTurnLight); // Box 98 turnlight R
		bodyModel[98] = new ModelRendererTurbo(this, 41, 9, textureX, textureY, BoxName.leftTurnLight); // Box 99 turnlight L
		bodyModel[99] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 100 hitch ball
		bodyModel[100] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 101 hitch
		bodyModel[101] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 102
		bodyModel[102] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 103
		bodyModel[103] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 104
		bodyModel[104] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 183 plate
		bodyModel[105] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 106 plate

		bodyModel[0].addBox(-1F, -3F, -1F, 2, 6, 2, 0F); // Box 136 Wheel1
		bodyModel[0].setRotationPoint(-13.5F, 7F, -8F);

		bodyModel[1].addShapeBox(-3F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9 Wheel1
		bodyModel[1].setRotationPoint(-13.5F, 7F, -8F);

		bodyModel[2].addShapeBox(1F, -1F, -1F, 2, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12 Wheel1
		bodyModel[2].setRotationPoint(-13.5F, 7F, -8F);

		bodyModel[3].addBox(-3F, -3F, -1.01F, 6, 6, 0, 0F); // Box 17 Wheel1
		bodyModel[3].setRotationPoint(-13.5F, 7F, -8F);

		bodyModel[4].addBox(-1F, -3F, -1F, 2, 6, 2, 0F); // Box 136 Wheel2
		bodyModel[4].setRotationPoint(-13.5F, 7F, 8F);

		bodyModel[5].addShapeBox(-3F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9 Wheel2
		bodyModel[5].setRotationPoint(-13.5F, 7F, 8F);

		bodyModel[6].addShapeBox(1F, -1F, -1F, 2, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12 Wheel2
		bodyModel[6].setRotationPoint(-13.5F, 7F, 8F);

		bodyModel[7].addBox(-3F, -3F, 1.01F, 6, 6, 0, 0F); // Box 17 Wheel2
		bodyModel[7].setRotationPoint(-13.5F, 7F, 8F);

		bodyModel[8].addBox(-1F, -3F, -1F, 2, 6, 2, 0F); // Box 136 Wheel3
		bodyModel[8].setRotationPoint(11.5F, 7F, -8F);

		bodyModel[9].addShapeBox(-3F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9 Wheel3
		bodyModel[9].setRotationPoint(11.5F, 7F, -8F);

		bodyModel[10].addShapeBox(1F, -1F, -1F, 2, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12 Wheel3
		bodyModel[10].setRotationPoint(11.5F, 7F, -8F);

		bodyModel[11].addBox(-3F, -3F, -1.01F, 6, 6, 0, 0F); // Box 17 Wheel3
		bodyModel[11].setRotationPoint(11.5F, 7F, -8F);

		bodyModel[12].addBox(-1F, -3F, -1F, 2, 6, 2, 0F); // Box 136 Wheel4
		bodyModel[12].setRotationPoint(11.5F, 7F, 8F);

		bodyModel[13].addShapeBox(-3F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9 Wheel4
		bodyModel[13].setRotationPoint(11.5F, 7F, 8F);

		bodyModel[14].addShapeBox(1F, -1F, -1F, 2, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12 Wheel4
		bodyModel[14].setRotationPoint(11.5F, 7F, 8F);

		bodyModel[15].addBox(-3F, -3F, 1.01F, 6, 6, 0, 0F); // Box 17 Wheel4
		bodyModel[15].setRotationPoint(11.5F, 7F, 8F);

		bodyModel[16].addShapeBox(-1F, -1F, -7F, 2, 2, 14, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 23 axle
		bodyModel[16].setRotationPoint(-13.5F, 7F, 0F);

		bodyModel[17].addShapeBox(-1F, -1F, -7F, 2, 2, 14, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 23 axle
		bodyModel[17].setRotationPoint(11.5F, 7F, 0F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Box 18
		bodyModel[18].setRotationPoint(-19F, 5F, -9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[19].setRotationPoint(-18F, 5F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[20].setRotationPoint(-18F, 3F, -9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 21
		bodyModel[21].setRotationPoint(-11F, 3F, -9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 22
		bodyModel[22].setRotationPoint(-10F, 5F, -9F);

		bodyModel[23].addBox(0F, 0F, 0F, 16, 2, 18, 0F); // Box 23
		bodyModel[23].setRotationPoint(-9F, 5F, -9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 24
		bodyModel[24].setRotationPoint(14F, 3F, -9F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 25
		bodyModel[25].setRotationPoint(15F, 5F, -9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[26].setRotationPoint(7F, 5F, -9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[27].setRotationPoint(7F, 3F, -9F);

		bodyModel[28].addBox(0F, 0F, 0F, 5, 2, 18, 0F); // Box 28
		bodyModel[28].setRotationPoint(16F, 5F, -9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 9, 4, 10, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[29].setRotationPoint(-18F, 3F, -5F);

		bodyModel[30].addBox(0F, 0F, 0F, 9, 2, 12, 0F); // Box 30
		bodyModel[30].setRotationPoint(7F, 5F, -6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 31
		bodyModel[31].setRotationPoint(-20.75F, 5F, -9F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 5, 5, 0F); // Box 32
		bodyModel[32].setRotationPoint(-19F, 0F, -9F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 5, 5, 0F); // Box 33
		bodyModel[33].setRotationPoint(-19F, 0F, 4F);

		bodyModel[34].addBox(0F, 0F, 0F, 9, 3, 18, 0F); // Box 34
		bodyModel[34].setRotationPoint(-18F, 0F, -9F);

		bodyModel[35].addShapeBox(-1F, 0F, -1F, 1, 3, 3, 0F,0F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 188 headlight
		bodyModel[35].setRotationPoint(-18.1F, -0.25F, -7F);

		bodyModel[36].addShapeBox(-1F, 0F, -1F, 1, 3, 3, 0F,0F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 36 headlight
		bodyModel[36].setRotationPoint(-18.1F, -0.25F, 6F);

		bodyModel[37].addShapeBox(-1F, 0F, -1F, 1, 2, 2, 0F,0F, -0.45F, -0.45F, -0.5F, -0.45F, -0.45F, -0.5F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, -0.5F, -0.45F, -0.45F, -0.5F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 188 turnlight L
		bodyModel[37].setRotationPoint(-18.1F, 2.25F, -6.5F);

		bodyModel[38].addShapeBox(-1F, 0F, -1F, 1, 2, 2, 0F,0F, -0.45F, -0.45F, -0.5F, -0.45F, -0.45F, -0.5F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, -0.5F, -0.45F, -0.45F, -0.5F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 188 turnlight R
		bodyModel[38].setRotationPoint(-18.1F, 2.25F, 6.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, -1F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[39].setRotationPoint(-19F, -1F, -8F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 40
		bodyModel[40].setRotationPoint(-19F, -1F, 4F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[41].setRotationPoint(-19F, -1F, -4F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 42
		bodyModel[42].setRotationPoint(-19F, 0F, -4F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 43
		bodyModel[43].setRotationPoint(14F, 3F, 6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[44].setRotationPoint(7F, 3F, 6F);

		bodyModel[45].addBox(0F, 0F, 0F, 9, 2, 1, 0F); // Box 45
		bodyModel[45].setRotationPoint(7F, 3F, -6F);

		bodyModel[46].addBox(0F, 0F, 0F, 9, 2, 1, 0F); // Box 46
		bodyModel[46].setRotationPoint(7F, 3F, 5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[47].setRotationPoint(21.75F, 5F, -9F);

		bodyModel[48].addBox(0F, 0F, 0F, 4, 1, 18, 0F); // Box 48
		bodyModel[48].setRotationPoint(-11F, -1F, -9F);

		bodyModel[49].addBox(0F, 0F, 0F, 9, 3, 2, 0F); // Box 49
		bodyModel[49].setRotationPoint(-9F, 2F, -1F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[50].setRotationPoint(-9F, 0F, -1F);

		bodyModel[51].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 346
		bodyModel[51].setRotationPoint(-5F, 2F, -7.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 352
		bodyModel[52].setRotationPoint(-1F, -3F, -7.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 53
		bodyModel[53].setRotationPoint(-1F, -3F, 1.5F);

		bodyModel[54].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 54
		bodyModel[54].setRotationPoint(-5F, 2F, 1.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 3, 2, 16, 0F); // Box 55
		bodyModel[55].setRotationPoint(-4F, 3F, -8F);

		bodyModel[56].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 56
		bodyModel[56].setRotationPoint(-9F, 0F, -9F);

		bodyModel[57].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 57
		bodyModel[57].setRotationPoint(-9F, 0F, 8F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[58].setRotationPoint(-1F, -8F, -9F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[59].setRotationPoint(-1F, -8F, 8F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 6, 18, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[60].setRotationPoint(-10F, -7F, -9F);

		bodyModel[61].addBox(0F, 0F, 0F, 9, 1, 16, 0F); // Box 61
		bodyModel[61].setRotationPoint(-9F, -8F, -8F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[62].setRotationPoint(-9F, -7F, -9F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[63].setRotationPoint(-9F, -7F, 8F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 64
		bodyModel[64].setRotationPoint(-7F, -7F, 8F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 65
		bodyModel[65].setRotationPoint(-7F, -7F, -9F);

		bodyModel[66].addBox(0F, 0F, 0F, 1, 13, 16, 0F); // Box 66
		bodyModel[66].setRotationPoint(0F, -8F, -8F);

		bodyModel[67].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 67
		bodyModel[67].setRotationPoint(-9F, -8F, -9F);

		bodyModel[68].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 68
		bodyModel[68].setRotationPoint(-9F, -8F, 8F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 69
		bodyModel[69].setRotationPoint(-10F, -8F, -9F);

		bodyModel[70].addShapeBox(0F, 0F, -0.5F, 5, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70 door swing left
		bodyModel[70].setRotationPoint(-6F, -1F, -8.5F);

		bodyModel[71].addShapeBox(0F, 0F, -0.5F, 5, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72 door swing right
		bodyModel[71].setRotationPoint(-6F, -1F, 8.5F);

		bodyModel[72].addShapeBox(0F, 0F, -0.5F, 5, 6, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 73 door swing left
		bodyModel[72].setRotationPoint(-6F, -7F, -8.5F);

		bodyModel[73].addShapeBox(0F, 0F, -0.5F, 5, 6, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 74 door swing right
		bodyModel[73].setRotationPoint(-6F, -7F, 8.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 75
		bodyModel[74].setRotationPoint(8F, 2F, -8F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 76
		bodyModel[75].setRotationPoint(8F, 2F, 5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 77
		bodyModel[76].setRotationPoint(-20F, 5F, -7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 78
		bodyModel[77].setRotationPoint(-20F, 5F, 6F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 79
		bodyModel[78].setRotationPoint(21F, 5F, 6F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 80
		bodyModel[79].setRotationPoint(21F, 5F, -7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 10, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -8F, 0F, -5F, -8F); // Box 81
		bodyModel[80].setRotationPoint(-18.75F, 0F, -4F);

		bodyModel[81].addShapeBox(-1F, -1F, -7F, 23, 2, 2, 0F,0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 165
		bodyModel[81].setRotationPoint(-11.75F, 7F, 6F);

		bodyModel[82].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 83
		bodyModel[82].setRotationPoint(18.5F, 7F, -6F);

		bodyModel[83].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 84
		bodyModel[83].setRotationPoint(12.5F, 7F, -4F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 85
		bodyModel[84].setRotationPoint(17.5F, 7F, -5F);

		bodyModel[85].addShapeBox(0F, -1.75F, -3.25F, 0, 5, 5, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 226 steeringwhool
		bodyModel[85].setRotationPoint(-6.49F, -0.75F, -5F);
		bodyModel[85].rotateAngleZ = 0.29670597F;

		bodyModel[86].addBox(-1F, -0.5F, -0.5F, 1, 1, 1, 0F); // Box 227
		bodyModel[86].setRotationPoint(-6.5F, -0.75F, -5F);
		bodyModel[86].rotateAngleZ = 0.29670597F;

		bodyModel[87].addBox(0F, 0F, 0F, 1, 6, 18, 0F); // Box 88
		bodyModel[87].setRotationPoint(1F, -1F, -9F);

		bodyModel[88].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 89
		bodyModel[88].setRotationPoint(2F, 3F, -9F);

		bodyModel[89].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 90
		bodyModel[89].setRotationPoint(16F, 3F, -9F);

		bodyModel[90].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 91
		bodyModel[90].setRotationPoint(16F, 3F, 8F);

		bodyModel[91].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 92
		bodyModel[91].setRotationPoint(2F, 3F, 8F);

		bodyModel[92].addBox(0F, 0F, 0F, 19, 4, 1, 0F); // Box 93
		bodyModel[92].setRotationPoint(2F, -1F, -9F);

		bodyModel[93].addBox(0F, 0F, 0F, 19, 4, 1, 0F); // Box 94
		bodyModel[93].setRotationPoint(2F, -1F, 8F);

		bodyModel[94].addShapeBox(-1F, -6F, 0F, 1, 6, 16, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 95 tailgate swing -90 z
		bodyModel[94].setRotationPoint(21F, 5F, -8F);

		bodyModel[95].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 96 taillight
		bodyModel[95].setRotationPoint(21.01F, 0F, -9F);

		bodyModel[96].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 97 taillight
		bodyModel[96].setRotationPoint(21.01F, 0F, 8F);

		bodyModel[97].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 98 turnlight R
		bodyModel[97].setRotationPoint(21.01F, 2F, 8F);

		bodyModel[98].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 99 turnlight L
		bodyModel[98].setRotationPoint(21.01F, 2F, -9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 100 hitch ball
		bodyModel[99].setRotationPoint(22.5F, 5.5F, -0.5F);

		bodyModel[100].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 101 hitch
		bodyModel[100].setRotationPoint(19.5F, 6.5F, -0.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[101].setRotationPoint(-9.5F, -3F, -11F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 103
		bodyModel[102].setRotationPoint(-9.5F, -3F, 9F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 104
		bodyModel[103].setRotationPoint(-13F, -10F, 8.5F);

		bodyModel[104].addShapeBox(0F, -2F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 183 plate
		bodyModel[104].setRotationPoint(22.26F, 8F, 2.5F);

		bodyModel[105].addShapeBox(0F, -2F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 106 plate
		bodyModel[105].setRotationPoint(-20.26F, 8F, 2F);
		bodyModel[105].rotateAngleY = -3.14159265F;
	}
}