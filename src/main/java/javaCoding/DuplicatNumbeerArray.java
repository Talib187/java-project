package javaCoding;

public class DuplicatNumbeerArray {

	public static void main(String[] args) {

		int[] arr = { 3, 4, 67, 88, 99, 99, 9, 8, 7, 6, 3, 4, 88 };

		System.out.println("Duplicate number in the array are: ");
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {

					System.out.print(arr[i] + " ");
				}
			}
		}
	}
}
