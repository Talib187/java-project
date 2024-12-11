package javaCoding;

public class MaxNumberArray {

	public static void main(String[] args) {
		
		int[] num = {23, 34, 55, 66, 123, 77, 135};
		int max = 0;
		int secmax = 0;
		for(int i=0; i<=num.length-1; i++) {
			
			if(num[i]>max) {
				
				secmax = max;
				max = num[i];
			}
		}
		
		System.out.println("Maximum number is: "+ max);
		System.out.println("Second maximum number is; "+ secmax);
	};
}
