package games;

import java.util.Random;
import java.util.Scanner;

public class GuessIt {
	

	public static void main(String[] args) {
		
		
		// guesses left
		int guessesLeft = 10;
		// number of guesses made
		int guessesTaken = 0;
		// guess input from user
		int guess = -1;
		// welcome user
		System.out.println("Hello! What is your name?");
		// Scanner class to read input from user
		Scanner in  = new Scanner(System.in);
		// capture name of user
		String name = in.nextLine();
		// random number generator to pick a number for user to guess
		Random rand = new Random();
		// randomly generated number to be guessed by user
		int number = rand.nextInt(19)+1;
		System.out.println("Well, " + name + ", I am thinking of a number between 1 and 20. You have "+ guessesLeft +" guesses left.");

		while (guessesTaken < 10){
			System.out.println("Take a guess!");
			guess = in.nextInt();
			// increment number of guesses taken at each iteration of the loop			
			guessesTaken= guessesTaken + 1;
			guessesLeft--;
			// if the guess made by the user is lower/higher than the randomly generated number print the appropriate statement  
			if (guess < number){
				System.out.println("Your guess is too low");
			}
			if (guess > number){
				System.out.println("Your guess is too high");
			}
			System.out.println("Previous guess: "+ guess);
			System.out.println("Number of guesses left: "+ guessesLeft);
			// if the number guessed by the user matches the number break out of while loop
			if (guess == number)
				break;
		}
		
			String guesses = "";
		if (guess == number){
			guesses = String.valueOf(guessesTaken);
			System.out.println("Good job, "+ name + "! You guessed my number in " + guesses + " guesses!");
		}
		if (guess != number)
			System.out.println("Nope. The number I was thinking of was " + number);
	}

}
