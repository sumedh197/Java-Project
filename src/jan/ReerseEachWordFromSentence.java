package jan;

public class ReerseEachWordFromSentence {

	public static void main(String[] args) {

		String str = "welcome to java";

		String[] words = str.split(" ");

		String reversestring = "";

		for (String word : words) {

			String reverseword = "";

			for (int i = word.length() - 1; i >= 0; i--) {

				reverseword = reverseword + word.charAt(i);

			}

			reversestring = reversestring + reverseword + " ";

		}

		System.out.println(reversestring);

	}

}
