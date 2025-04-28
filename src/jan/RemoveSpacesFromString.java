package jan;

public class RemoveSpacesFromString {

	public static void main(String[] args) {

//		String str = "my name is sumedh polewar";
//		
//		 String str1=str.replaceAll("\\s", "");
//		 
//		 System.out.println(str1);
//	}

		String str = "my name is sumedh";

		String word = "";

		for (int i = 0; i <= str.length() - 1; i++) {

			char ch = str.charAt(i);

			if (ch != ' ') {

				word = word + str.charAt(i);

			}

		}
		System.out.println(word);

	}
}