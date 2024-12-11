package javaCoding;

import java.math.BigInteger;

public class FibonaciSeries {

	public static void main(String[] args) {

		int n1 = 0, n2 = 1, n3;

//        BigInteger n1 = BigInteger.valueOf(0);
//        BigInteger n2 = BigInteger.valueOf(1);
//        BigInteger n3;
		System.out.print(n1 + " " + n2 + " ");
		for (int i = 2; i < 10; i++) {

			n3 = n1 + n2;
//			n3 = n1.add(n2);
			System.out.print(n3 + " ");

			n1 = n2;
			n2 = n3;
		}
	}
}
