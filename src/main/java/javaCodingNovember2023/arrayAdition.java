package javaCodingNovember2023;

public class arrayAdition {

	public static void main(String[] args) {
		int[] arr1 = { 23, 34, 53, 12, 44 };
		int[] arr2 = { 45, 54, 99, 9, 12 };

		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr2.length; j++) {

				if (i == j) {

					System.out.print(arr1[i] + arr2[j] + " ");
				}
			}
		}

	}
}