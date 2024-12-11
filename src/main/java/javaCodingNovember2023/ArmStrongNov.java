package javaCodingNovember2023;

import java.util.Scanner;

// Armstrong number is the equals to the sum of its digit, 153 = 1+125+27
public class ArmStrongNov {

	public void getArmStrong(int number) {

		int temp = number, sum = 0;

		while (temp > 0) {

			int num = temp % 10;
			sum = sum + (num * num * num);

			temp = temp / 10;

		}

		if (sum == number) {

			System.out.println("Number is armstrong");
		} else {
			System.out.println("Number is not armstrong");
		}
	}

	public static void main(String[] args) {

		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		ArmStrongNov obj = new ArmStrongNov();
		obj.getArmStrong(number);
		
		sc.close();

	}
}
