package javaCodingNovember2024;

public class checkEqualArray {

	public static void main(String[] args) {

		int[] arr1 = { 2, 5, 4, 9 };
		int[] arr2 = { 2, 5, 4, 9 };

		boolean status = true;
		if (arr1.length == arr2.length) {
			for (int i = 0; i <= arr1.length - 1; i++) {

				if (arr1[i] != arr2[i]) {

					status = false;
					break;
				}

				else {

					status = false;
				}

			}

		} else {
			status = false;
		}

		if (status == true) {
			System.out.println("Equals");
		}
		if (status == false) {
			System.out.println("Not Equal");
		}
	}
}
