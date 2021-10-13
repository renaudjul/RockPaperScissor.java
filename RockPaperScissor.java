/*
 * Name:		Julie Renaud 
 * Date:		10/1/2021
 * Course Number:	CSC-111 D01
 * Course Name:		Intro to Java
 * Problem Number:	Chapter 3 - Rock Paper Scissors
 * Email: 		jmrenaud2001@student.stcc.edu
 * Description:		Rock Paper Scissors Game 
 */

import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) {

		// variables for the game
		final int ROCK = 0;
		final int PAPER = 1;
		final int SCISSORS = 2;

		// Human input & scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Choose your move! Your choices are...\n\nRock = 0\nPaper = 1\nScissors = 2\n\nType here: ");
		int humanPlayer = input.nextInt();
		input.close();

		// Computer input based off of the Math.random calculation
		int computerPlayer = (int) (Math.random() * 3);

		// For invalid entries
		if (humanPlayer > 2) {
			System.out.print("\nNot a valid entry, please try again.");
		}

		// if - else if - else block for when human player chooses Rock
		if (humanPlayer == ROCK) {
			if (computerPlayer == ROCK) {
				System.out.println("\n\nIts a Draw! You both chose Rock! Try again.");
			} else if (computerPlayer == PAPER) {
				System.out.println("\n\nPaper Beats Rock! The computer wins this round!\n\nYour play: Rock\nComputer's play: Paper");
			} else {
				System.out.println("\n\nRock beats Scissors! You win!!! Woot Woot!\nYour play: Rock\nComputer's play: Scissors");
			}
		}

		// if - else if - else block for when human player chooses Paper
		if (humanPlayer == PAPER) {
			if (computerPlayer == PAPER) {
				System.out.println("\n\nIts a Draw! You both chose Paper! Try again.");
			} else if (computerPlayer == SCISSORS) {
				System.out.println("\n\nScissors beats Paper! The computer wins this round!\n\nYour play: Paper\nComputer's play: Scissors");
			} else {
				System.out.println("\n\nPaper beats Rock! You win!!! Woot Woot!\n\nYour play: Paper\nComputer's play: Rock");
			}
		}

		// if - else if - else block for when human player chooses Scissors
		if (humanPlayer == SCISSORS) {
			if (computerPlayer == SCISSORS) {
				System.out.println("\n\nIts a Draw! You both chose Scissors! Try again.");
			} else if (computerPlayer == ROCK) {
				System.out.println("\n\nRock beats Scissors! The computer wins this round!\n\nYour play: Scissors\nComputer's play: Rock");
			} else {
				System.out.println("\n\nScissors beats paper! You win!!! Woot Woot!\n\nYour play: Scissors\nComputer's play: Paper");
			}
		}

	}
	
}
