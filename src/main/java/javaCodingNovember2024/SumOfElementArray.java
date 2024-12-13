package javaCodingNovember2024;

public class SumOfElementArray {

	public static void main(String[] args) {
		
		int[] arr = {2, 4, 5, 7, 10};
		int sum=0;
	/*	for(int i=0; i<=arr.length-1; i++) {
			
			sum = sum+arr[i];
		}
		*/
		
		// By using enhance for loop.
		
		for(int a:arr) {
			sum = sum+a;
			
		}
		
		System.out.println(sum);
	}
}
