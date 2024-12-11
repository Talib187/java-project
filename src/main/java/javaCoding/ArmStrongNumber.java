package javaCoding;

import java.util.Scanner;

public class ArmStrongNumber {
	// 1634
	public void getArmstrongNumber(int input) {

		int temp = input;
		int temp1 = input;
		int sum = 0;
		int count = 0;

		while (temp > 0) {

			temp = temp / 10;
			count++;

		}

		System.out.println("Number of the digits in the input is: " + count);
		
		while (temp1 > 0) {

			int num = temp1 % 10;
			sum = (int) (sum + Math.pow(num, count));

			temp1 = temp1 / 10;
		}

		if (sum == input) {

			System.out.println("Number is Armstrong number");

		}

		else {
			System.out.println("Number is not armstrong");
		}

	}

	public static void main(String[] args) {

		System.out.println("Please enter the number");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		ArmStrongNumber obj = new ArmStrongNumber();
		obj.getArmstrongNumber(input);
	}
}
