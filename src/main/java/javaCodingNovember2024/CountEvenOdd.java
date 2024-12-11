package javaCodingNovember2024;

public class CountEvenOdd {

	// Program to check the total numbe
	public static void main(String[] args) {

				int num = 12345678;
				int lastDigit;
				int evenCount = 0;
				int oddCount = 0;
		while (num > 0) {
					lastDigit = num % 10;
							if (lastDigit % 2 == 0) {
								evenCount++;
							} else {
								oddCount++;
							}

			num = num / 10;
		}

		System.out.println("Even count: "+evenCount + " and Odd count is: "+oddCount);
	}

}
