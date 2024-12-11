package javaCodingNovember2024;

public class LastWordReverse {

	public static void main(String[] args) {

		String st = "Talib is in bulandshahr";
		String sp[] = st.split(" ");
		String reverse = "";

		for (String a : sp) {

			if (a.equalsIgnoreCase("bulandshahr")) {

				char[] ch = a.toCharArray();

				for (int j = ch.length - 1; j >= 0; j--) {

					// System.out.println(ch[j]);
					reverse = reverse + ch[j];

				}

				// System.out.print(reverse);

				a = reverse;

			}

			System.out.print(a + " ");

		}
	}
}