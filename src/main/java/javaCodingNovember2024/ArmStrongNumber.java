package javaCodingNovember2024;

import java.util.Scanner;

public class ArmStrongNumber {

	public void checkArmStrong(int input) {
		
		int temp = input;
		int temp1=input;
		int count = 0, sum=0;
	
		while (temp1 > 0) {
		temp1 =	temp1 / 10;
			count++;
		}
		System.out.println("So total digit in the number: " + count);

		while (temp > 0) {
			int num = temp % 10; // 12
			sum = (int) ( Math.pow(num, count)+sum); // or (int) ( sum +Math.pow(num, count)) both are same
			temp = temp / 10;
		}
		
		if(sum==input) {
			System.out.println("number is armstrong");
		}
		
		else {
			System.out.println("number is not armstrong");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		ArmStrongNumber obj = new ArmStrongNumber();
		obj.checkArmStrong(number);
	}
}



/*Trick to Remember Armstrong Number Logic:
"Break, Power, Sum, Match."

Break: Split the number into its digits.
Power: Raise each digit to the power of the total number of digits.
Sum: Add these powered values.
Match: Check if the sum equals the original number.*/