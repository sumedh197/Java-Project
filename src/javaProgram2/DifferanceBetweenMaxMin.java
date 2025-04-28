package javaProgram2;

public class DifferanceBetweenMaxMin {

	public static String Longestword(String str) {

		String[] arr = str.split(" ");

		String Longestword = arr[0];

		for (String a : arr) {

			if (Longestword.length() < a.length()) {

				Longestword = a;

			}
		}

		return Longestword;

	}

	public static void main(String[] args) {

		System.out.println(Longestword("my name is sumedh polewar"));

	}

}
