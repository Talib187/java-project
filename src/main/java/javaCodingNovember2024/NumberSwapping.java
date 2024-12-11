package javaCodingNovember2024;

public class NumberSwapping {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int temp;

		// Using temp variable
		/*
		temp = a;
		a = b;
		b = temp;
		*/
		
		// Using no third value:
		
		a= a+b;
		b= a-b;
		a = a-b;
		
		System.out.println("Valueo of a and b is: " + a + "   " + b);

	}
}
