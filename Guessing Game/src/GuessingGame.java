/*
 * Name: Alex Feng
 * Date: 9/26/2017
 * Description: Guessing game from 1 to 10.
 */

import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {
		//Random number from 1 to 10 to be guessed
		int randNum = (int) (Math.random() * 10 + 1);
		
		Scanner input = new Scanner(System.in);
		while (true) {
		//Will break when the number is guessed correctly
			System.out.print("Guess a number from 1-10: ");
			try {
				int guess = Integer.parseInt(input.nextLine());
				if (guess == randNum) {
					System.out.println("You got it right! It was " + guess);
					break;
				}
			} catch (NumberFormatException e) {
				//Occurs when anything but a number is read in
				System.out.println("Error type: " + e);
				System.out.println("Please enter a valid number");
			}
		}
		input.close();
		//Hi.
	}
}
