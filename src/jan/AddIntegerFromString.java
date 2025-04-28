package jan;

public class AddIntegerFromString {

	public static void main(String[] args) {

		String str = "sum12ed52as8";

		char[] chararr = str.toCharArray();

		int sum = 0;

		for (char c : chararr) {

			if (Character.isDigit(c)) {

				sum = sum + Integer.parseInt(String.valueOf(c));

			}

		

		}
		System.out.println(sum);

	}

}
