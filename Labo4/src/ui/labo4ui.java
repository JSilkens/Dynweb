package ui;

import javax.swing.JOptionPane;

import domain.LetterCounter;;

public class labo4ui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choise = -1 ;
		String menu = "1. Count a certain letter! \n 0. Quit";
		
		
		while (choise != 0){
			choise = Integer.parseInt(JOptionPane.showInputDialog(menu));
			if(choise == 1 ){
				CountLetters();
			}
		}
		
		
		
		
		

	}

	private static void CountLetters() {
		LetterCounter lc = new LetterCounter();
		String w = JOptionPane.showInputDialog("Enter the word..");
		char c  =  JOptionPane.showInputDialog("Enter the character").charAt(0);
		JOptionPane.showMessageDialog(null, "The letter " + c + " exists " + lc.CountCertainLetters(c, w) + " time(s)");
		
		
		
		
		
	}

}
