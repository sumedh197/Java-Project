package jan;

public class FindVovelAndConsonant {

	public static void main(String[] args) {

		String str = "sumedhpolewar";

		int vowel = 0;

		int consonant = 0;

		for (int i = 0; i <= str.length() - 1; i++) {

			char c = str.charAt(i);

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

				vowel++;

			} else {

				consonant++;
			}

		}
		System.out.println(vowel);
		System.out.println(consonant);
 
	}

}
