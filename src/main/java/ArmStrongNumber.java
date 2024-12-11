import java.util.Scanner;

public class ArmStrongNumber {

	public void checkAmrStrongNumber(int number) {

		double sum = 0;
		int temp = number;
		int temp0 = number;
		int power = 0;

		while (temp0 > 0) {

			temp0 = temp0 / 10;
			power++;

		}

		System.out.println(
				"So there is total digit: " + power + " , now we need to find the armstrong of the given number");

		while (number > 0) {

			int a = number % 10;
			number = number / 10;

			sum = sum + (Math.pow(a, power));
		}

		if (sum == temp) {

			System.out.println("Number is Armstrong and temp value is: " + temp);
		} else {

			System.out.println("Number is not Armstrong");
		}
	}

	public static void main(String[] args) {

		ArmStrongNumber obj = new ArmStrongNumber();
		System.out.println("Please enter the number to check Armstrong");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		obj.checkAmrStrongNumber(number);
	}
}
