package domain;


public class Dice {
	 private int number;
	
	public Dice(){
		
	}
	
	
	//Roll the dice!
	public int Roll(){
		number = (int) Math.ceil(Math.random()*6);
		return number;
	}
	

}
