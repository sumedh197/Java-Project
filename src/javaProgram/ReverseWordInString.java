package javaProgram;

public class ReverseWordInString {

	public static void main(String[] args) {

		// input=welcome to java => output= emoclew ot avaj

		String str = "welcome to java";

		String words[] = str.split(" ");

		String revstring = "";

		for (String word : words) {

			String revword = "";

			for (int i = word.length() - 1; i >= 0; i--) {

				char first = str.charAt(0);
				
				char last = str.charAt(str.length()-1);
				
				String middle = str.substring(1,str.length()-1);
				
				String result = last + middle + first;
				
				System.out.println(result);
			}
			// System.out.print(revword+" ");

			
		//System.out.println(revstring);

	}

	}}
