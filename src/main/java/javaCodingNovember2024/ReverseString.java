package javaCodingNovember2024;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Talib";
		
		String rev= "";

		// Logic 1, using +(concatenation) operator
						/*		
							for(int i=str.length()-1; i>=0; i--) {
								
								rev = rev+str.charAt(i);  
						//		rev2 = str.charAt(i)+rev2 ;   this will not reverse.
								
							}
						*/	
		
		// Logic 2 using character array.
						/*	char[] ch = str.toCharArray();
							for(int i=ch.length-1; i>=0; i--) {
								
								rev = rev+ch[i];
							}
							*/
		// Using String Buffer:
					/*		StringBuffer sbf = new StringBufer(str);
					StringBuffer reverse = sbf.reverse(); 					*/

	
	// Using String Builder
	
				/*	StringBuilder sbl = new StringBuilder();
					StringBuilder revString = sbl.append(str).reverse();
					System.out.println(revString); */
	}
	


}
