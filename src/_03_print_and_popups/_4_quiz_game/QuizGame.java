package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
	
				// 2.  Ask the user a question 
		String input = JOptionPane.showInputDialog("How many elements are there in the period table");
				// 3.  Use an if statement to check if their answer is correct
		if(input.equals("118")){
			JOptionPane.showMessageDialog(null,"Correct!");
			score +=1;
		}
		else {
			JOptionPane.showMessageDialog(null,"Incorrect!");
			score +=-1;
		}
		String input1 = JOptionPane.showInputDialog("How many fingers are on the average human hand?");
		if(input1.equals("5")) {
			JOptionPane.showMessageDialog(null,"Correct!");
			score +=1;
		}
		else {
			JOptionPane.showMessageDialog(null,"Incorrect!");
			score +=-1;
		}
		String input2 = JOptionPane.showInputDialog("What is 10*5");
		if(input2.equals("50")) {
			JOptionPane.showMessageDialog(null,"Correct!");
			score +=1;
		}
		else {
			JOptionPane.showMessageDialog(null,"Incorrect!");
			score +=-1;
		}
		String input3 = JOptionPane.showInputDialog("How many sides does a square have?");
		if(input3.equals("4")) {
			JOptionPane.showMessageDialog(null,"Correct!");
			score +=1;
		}
		else {
			JOptionPane.showMessageDialog(null,"Incorrect!");
			score +=-1;
		}
		String input4 = JOptionPane.showInputDialog("How many questions have you answered so far?");
		if(input4.equals("4")) {
			JOptionPane.showMessageDialog(null,"Correct!");
			score +=1;
		}
		else {
			JOptionPane.showMessageDialog(null,"Incorrect!");
			score +=-1;
		}
		JOptionPane.showMessageDialog(null,"Your final score was: "+score);
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
