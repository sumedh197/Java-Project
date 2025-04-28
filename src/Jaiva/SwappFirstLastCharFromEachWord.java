package Jaiva;

public class SwappFirstLastCharFromEachWord {

	public static void main(String[] args) {

		String str = "welcome to java";

		String[] words = str.split(" ");

		String reversestring = "";

		for (String word : words) {

			String result = "";

			char first = word.charAt(0);

			char last = word.charAt(word.length() - 1);

			String middle = word.substring(1, word.length() - 1);

			result = last + middle + first;

			reversestring = reversestring + result + " ";

		}
		
		System.out.println(reversestring);
	}
}
