package javaCodingNovember2024;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int target = random.nextInt(100) + 1; // Generate a random number between 1 and 100
		int attempts = 0;
		int guess = 0;

		System.out.println("Guess a number between 1 and 100.");

		while (guess != target) {
			System.out.print("Enter your guess: ");
			try {
				guess = scanner.nextInt(); // Read user input
				attempts++;

				if (guess < target) {
					System.out.println("Too low! Try again.");
				} else if (guess > target) {
					System.out.println("Too high! Try again.");
				} else {
					System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
				}
			} catch (Exception e) {
				System.out.println("Please enter a valid number.");
				scanner.next(); // Clear invalid input
			}
		}

		scanner.close();
	}
}
