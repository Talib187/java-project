package javaCodingNovember2024;

public class EvenOddNumbers {

	public static void main(String[] args) {
		
		int numbers[] = { 3, 4, 5, 34, 1, 34, 67, 93};
		
		for(int i=0; i<numbers.length-1; i++) {
			
			if(numbers[i]%2==0) {
				
				System.out.println("Even numbers: "+numbers[i]);
			}
			if(numbers[i]%2!=0) {
				System.out.println("Odd numbers: "+numbers[i]);


			}
		}
	}
}
