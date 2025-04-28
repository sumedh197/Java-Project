package jan;

public class ReverseEachWordFromString {

	public static void main(String[] args) {

		String str = "welcome to chandrapur";

		String arr[] = str.split(" ");

		String reversestring = "";

		for (String words : arr) {

			String reverseword = "";

			for (int i = words.length() - 1; i >= 0; i--) {

				reverseword = reverseword + words.charAt(i);

			}
			reversestring = reversestring + reverseword + " ";

		}

		System.out.println(reversestring);

	}

}
