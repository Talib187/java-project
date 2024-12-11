package javaCoding;

public class ArrayAscending {

	public static void main(String[] args) {

		int[] arr = { 45, 34, 12, 99, 123, 41 };

		int temp = 0;
		for (int i = 0; i <arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {  	// Just change the condition to arr[i] < arr[j] and this will arrange the array in descending order.

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			
			System.out.println(arr[i]);
		}
	}
}
