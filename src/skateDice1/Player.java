package skateDice1;

public class Player {
	
	private int score;
	
	private letters letters;
	
	
	
	public Player() {
		score = 0;
		letters = new letters();
	}//end constructor



	public int getScore() {
		return score;
	}



	public void setScore(int score) {
		this.score = score;
	}



	public letters getLetters() {
		return letters;
	}



	public void setLetters(letters letters) {
		this.letters = letters;
	}
	
	
	
	

}//end class
