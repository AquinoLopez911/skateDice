package skateDice1;

public class letters {
	/*
	public static String s = "S.";
	public static String k = "K.";
	public static String a = "A.";
	public static String t = "T.";
	public static String e = "E";
	*/
	
	
	final private String[] LETTERS = {"S","K","A","T","E"};
	
	private StringBuilder str;
	
	private int i;
	
	boolean gameOver;
	
	
	
	
	public StringBuilder getStr() {
		return str;
	}

	public void setStr(StringBuilder str) {
		this.str = str;
	}

	public letters() {
		str = new StringBuilder();
		i = 0;
	}
	
	//the purpose of this method is to add the next letter to the StringBuilder
	public void addLetters() {
		try {
			str.append(LETTERS[i++]);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("game is over. you lose");
		}
	}//end addLetters
	
	
	//the purpose of this method is to check if player has "skate"
	public boolean checkScore() {
		StringBuilder let = new StringBuilder();
		
		for(String s : LETTERS) {
			let.append(s);
		}
		
		System.out.println(str.toString());
		
		if(str.toString().equals(let.toString())) {
			gameOver = true;
		}
		
		return gameOver;
	}//end checkScore
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	


