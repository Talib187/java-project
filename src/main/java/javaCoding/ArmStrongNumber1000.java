package javaCoding;

public class ArmStrongNumber1000 {

	public static void main(String[] args) {
		
		
		for (int i = 2; i<=1000; i++) {
			
			int number = i;
			int temp = i;
			int sum = 0;
			while(number>0) {
				
				int num = number%10;
				sum = sum + num*num*num;
				number = number/10;
			}
			
			if(sum==i) {
				
				System.out.println("Armstrong number is: " + i);
			}
		}
	}
}
