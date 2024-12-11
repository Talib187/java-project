package javaCodingNovember2024;

public class ArrayAdditions {

	public static void main(String[] args) {

		int[] arr1 = { 23, 45, 67, 88, 99 };
		int[] arr2 = { 13, 35, 47, 58, 19 };

		
		for(int i=0; i<=arr1.length; i++) {
			
			for (int j=0; j<arr2.length; j++) {
				
				if(i==j) {
					
					System.out.println(arr1[i]+arr2[j]+" ");
				}
			}
		}
	}

}
