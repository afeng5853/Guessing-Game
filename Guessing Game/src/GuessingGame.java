import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {
		int randNum = (int) (Math.random() * 10 + 1);
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.print("Guess a number from 1-10: ");
			try {
				int guess = Integer.parseInt(input.nextLine());
				if (guess == randNum) {
					System.out.println("You got it right! It was " + guess);
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("Error type: " + e);
				System.out.println("Please enter a valid number");
			}
		}
		input.close();
	}
}
