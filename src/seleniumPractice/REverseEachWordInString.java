package seleniumPractice;

public class REverseEachWordInString {

	public static void main(String[] args) {

		String str = "welcome to java";

		String words[] = str.split(" ");

		String revstring = "";

		for (String word : words) {

			String RevWord = "";

			for (int i = word.length() - 1; i >= 0; i--) {

				RevWord = RevWord + word.charAt(i);
			}
			revstring = revstring + RevWord + " ";
		}

		System.out.println(revstring);

	}

}
