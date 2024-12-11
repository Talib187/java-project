package javaCodingNovember2023;

public class ArrayAscending {

	public static void main(String[] args) {

		int[] arr = { 45, 34, 12, 99, 123, 41 };
		int temp = 0;
		for (int i = 0; i <= arr.length-1; i++) {

			for (int j = 1; j <= arr.length-1; j++) {

				if (arr[i] > arr[j]) { //Compare two numbers.
					temp = arr[i];  // Swap if the first is bigger.
					arr[i] = arr[j]; // Largest number moves to the top in each round
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.err.print(arr[i]+" ");
		}
	}
}

/*Key Steps to Remember:
Compare two numbers.
Swap if the first is bigger.
Largest number moves to the top in each round.
Repeat until all numbers are sorted.*/