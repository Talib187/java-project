package javaCodingNovember2024;

public class ReversingNumber {

	public static void main(String[] args) {
		
		int num = 1234;
		int rev=0;
		
		// Logic 1
		/*
		while(num>0) {
			rev =  rev*10+num%10;
			num = num/10;
		}
		*/
		// Logic 2 using String buffer:	
		/*
		StringBuffer sbf = new StringBuffer(Integer.toString(num));
		StringBuffer rev1 = sbf.reverse();
		System.out.println("Reversed Number: " +rev1);
		
		*/
	// Logic 3 Using String Builder
	
	StringBuilder sbl = new StringBuilder();
	StringBuilder rev2 = sbl.append(num).reverse();
	System.out.println(rev2);
}
}