package numberOperation;

import java.util.Scanner;

public class PrimeNumber {

	public boolean isPrime(int number) {

		if (number <= 1) {

			System.out.println("Number is not prime");
		}

		for (int i = 2; i < number; i++) {

			if (number % i == 0) {
				return false; // Number is divisible by i, so it's not prime
			}

		}
		return true; // // If no divisor found, the number is prime

	}

	public static void main(String[] args) {

		PrimeNumber obj = new PrimeNumber();
		System.out.println("Please enter a number to check prime");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		obj.isPrime(number);

		if (obj.isPrime(number)) {

			System.out.println("Number is prime");
		} else {
			System.out.println("Number is not prime");
		}

	}
}
