package javaCodingNovember2024;

public class FibonaciSeries {

	// 0, 1, 1, 2, 3, 5, 8, 13 and so on.
	public static void main(String[] args) {

		// Fibonaci till to number 100;
		int fib = 0;
		int n1 = 0, n2 = 1;
		System.out.print(n1 + " " + n2 + " ");
		for (int i = 1; i <= 10; i++) {

			fib = n1 + n2;

			System.out.print(fib+ " ");
			

			n1 = n2;
			n2 = fib;

		}

	}
}
