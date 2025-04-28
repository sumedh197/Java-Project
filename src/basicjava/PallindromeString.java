package basicjava;

public class PallindromeString {

	public static void main(String[] args) {

		String str = "alayalam";

		String temp;

		temp = str;

		int len = str.length();

		String rev = "";

		for (int i = len - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);
		}
		System.out.println(rev);

		if (temp.equals(rev)) {

			System.out.println("string is pallindrome");
		} else {

			System.out.println("not a pallindrome string");
		}

	}

}
