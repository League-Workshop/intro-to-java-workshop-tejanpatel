package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score=0;
		// 2.  Ask the user a question 
		String input= JOptionPane.showInputDialog("what is 10*10?");
		// 3.  Use an if statement to check if their answer is correct
		if (input.equals("100")) {score=score+1;}
		else {}
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String input2=JOptionPane.showInputDialog("what is 255/5?");
		if(input2.equals("51")) {score=score+1;}
		else {}
		// 6.  After all the questions have been asked, print the user's score 
		String input3=JOptionPane.showInputDialog("What is 27/3?");
		if(input.equals("9")) {score=score+1;}
		else {}
		JOptionPane.showMessageDialog(null, "You got "+score+" out of 3.");
	}
}
