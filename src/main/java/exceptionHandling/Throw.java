package exceptionHandling;

public class Throw {

	public static void getAge(int age) {
		if (age < 18) {

			throw new ArithmeticException("Access Denied - You must be at least of 18 year old");
		}

		else {
			System.out.println("You are old enough to proceed further.");
		}
	}

	public static void main(String[] args) {

		getAge(3);
	}
}
