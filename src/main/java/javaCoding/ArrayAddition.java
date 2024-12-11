package javaCoding;

public class ArrayAddition {

	public static void main(String[] args) {
		
		int[] arr1 = {23, 45, 67, 88, 99};
		int[] arr2 = {13, 35, 47, 58, 19};

		
		for(int i=0; i<=arr1.length-1; i++) {
			
			for(int j=0; j<=arr2.length-1; j++) {
				
				if(i==j) {
					
					System.out.print(arr1[i]+arr2[j]+"  ");
				}
			}
		}
	}
}
