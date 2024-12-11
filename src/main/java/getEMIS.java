
public class getEMIS {

	public void getEMI() {

		float currYearTurnOver = 9665670.8f;
		float multiPier = 1.50f;
		int grossMargin = 10;
		int totalObligation = 61992;
		int policyDSCR = 1;

		float annualGrossIncome = currYearTurnOver * multiPier * (grossMargin * 10 / 100);

		System.out.printf("Annual gross income is: %.2f%n", annualGrossIncome);

		float monthlyGrossBusinessIncome = annualGrossIncome / 12;

		System.out.println("Monthly Gross Business Income is: " + monthlyGrossBusinessIncome);

		float totalObligationEMI = monthlyGrossBusinessIncome / 1;

		float proposedEmi = totalObligationEMI - totalObligation;

		System.out.println("Proposed EMI is: " + proposedEmi);

		System.out.println("Total obligation EMI is: " + totalObligationEMI);

		if (totalObligationEMI < totalObligation) {

			proposedEmi = 0;
			
			System.out.println("Proposed EMI is: " + proposedEmi);
		}

		else {

			System.out.println("Proposed EMI is: " + proposedEmi);
		}

		
		
	}

	public static void main(String[] args) {

		getEMIS obj = new getEMIS();
		obj.getEMI();

	}

}
