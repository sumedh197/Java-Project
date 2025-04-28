package jan;

public class CountUpperCaseLowerCase {

	public static void main(String[] args) {

		String str = "SumedhPolewar";

		int countupper = 0;

		int countLower = 0;

		for (int i = 0; i <= str.length() - 1; i++) {

			char c = str.charAt(i);

			if (c >= 'A' && c <= 'Z') {

				countupper++;
			} else if (c >= 'a' && c <= 'z') {

				countLower++;
			}

		}

		System.out.println(countupper);

		System.out.println(countLower);

	}

}
