package skateDice1;

import java.util.Random;



public class dice {
	
	private final String[] easyDice = {"Shuv",  "Front Shuv", "BigSipn", "FS BigSpin",
			"KickFlip", "HardFlip", "BS Flip", "FS Flip", "Big Flip", "FS Big Flip","HeelFlip",
			"InwardHeel", "BS Heel", "FS Heel", "Big Heel", "BS Big Heel","BS 360", 
			"FS 360", "Tre Flip", "Lazer Flip"};
		
	private final String[] hardDice = {"Shuv", "Front Shuv", "BigSipn", "FS BigSpin",
			"KickFlip", "HardFlip", "BS Flip", "FS Flip", "Big Flip", "FS Big Flip", "BS 360 Flip", "FS 360 Flip",
			"HeelFlip", "InwardHeel", "BS Heel", "FS Heel", "Big Heel", "FS Big Heel", "BS 360 Heel", "FS 360 Heel",
			"BS 360", "FS 360",
			"Fakie Shuv", "Fakie Front Shuv", "Fakie BigSipn", "Fakie FS BigSpin",
			"Fakie Flip", "Fakie HardFlip", "Fakie BS Flip", "Fakie FS Flip", "Fakie Big Flip", "Fakie FS BigFlip", "Fakie BS 360 Flip", "Fakie FS 360 Flip",
			"Fakie Heel", "Fakie InwardHeel", "Fakie BS Heel", "Fakie FS Heel", "Fakie BS 360 Heel", "Fakie FS 360 Heel",
			"Fakie BS 360", "Fakie FS 360",
			"Switch Shuv", "Switch Front Shuv", "Switch BigSipn", "Switch FS BigSpin",
			"Switch Flip", "Switch HardFlip", "Switch BS Flip", "Switch FS Flip", "Switch Big Flip", "Switch FS BigFlip", "Switch BS 360 Flip", "Switch FS 360 Flip",
			"Switch Heel", "Switch InwardHeel", "Switch BS Heel", "Switch FS Heel", "Switch BS 360 Heel", "Switch FS 360 Heel",
			"Switch BS 360", "Switch FS 360",
			"Nollie Shuv", "Nollie Front Shuv", "Nollie BigSipn", "Nollie FS BigSpin",
			"Nollie Flip", "Nollie HardFlip", "Nollie BS Flip", "Nollie FS Flip", "Nollie Big Flip", "Nollie FS BigFlip", "Nollie BS 360 Flip", "Nollie FS 360 Flip",
			"Nollie Heel", "Nollie InwardHeel", "Nollie BS Heel", "Nollie FS Heel", "Nollie BS 360 Heel", "Nollie FS 360 Heel",
			"Nollie BS 360", "Nollie FS 360", "Tre Flip", "Lazer Flip"};
	
	public static Random rand = new Random();
	
	
	//constructor
	public dice() {
		
	}

	

	
	public String easyDice() {
		int r = rand.nextInt(easyDice.length);
		String Trick = easyDice[r];
		return Trick;
	}
	
	public String hardDice() {
		int r = rand.nextInt(hardDice.length);
		String Trick = hardDice[r];
		return Trick;
	}
	
	

}
