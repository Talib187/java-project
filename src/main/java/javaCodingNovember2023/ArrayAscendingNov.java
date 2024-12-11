package javaCodingNovember2023;

import java.util.Arrays;

public class ArrayAscendingNov {

	public static void main(String[] args) {

		int[] arr = { 45, 34, 12, 99, 123, 41 };

		int temp = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}


			}
		}

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}

	}
}
