package numberOperation;

import java.util.Scanner;

public class ArmStrongNumber3Digits {

	public void checkAmrStrongNumber(int number) {

		double sum = 0;
		int temp = number;
		while (number > 0) {
			int a = number % 10;
			number = number / 10;
			sum = sum + (a * a * a);
		}
		if (sum == temp) {
			System.out.println("Number is Armstrong and temp value is: " + temp);
		} else {

			System.out.println("Number is not Armstrong");
		}
	}

	public static void main(String[] args) {

		ArmStrongNumber3Digits obj = new ArmStrongNumber3Digits();
		System.out.println("Please three digit  the number to check Armstrong");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		if (number > 100 || number < 100) {

			System.out.println("Entered number is should be of 3 digit, kindly enter the 3 digit number");
		}

		else {

			obj.checkAmrStrongNumber(number);

		}
	}
}
