package seleniumPract;

public class ReverseSentence {

	public static void main(String[] args) {

		String str = "my name is sumedh";

		String words[] = str.split(" ");

		String rev = "";

		for (int i = words.length - 1; i >= 0; i--) {

			rev = rev + words[i] + " ";
		}

		System.out.println(rev);

		String wordss[] = rev.split(" ");

		String reve = "";

		for (String word : wordss) {

			String revword = "";

			for (int i = word.length() - 1; i >= 0; i--) {

				revword = revword + word.charAt(i);
			}

			reve = reve + revword + " ";
			// System.out.println(rev);
		}
		System.out.println(reve);

	}

}
