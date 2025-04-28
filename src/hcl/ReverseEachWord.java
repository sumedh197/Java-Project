package hcl;

public class ReverseEachWord {

	public static void main(String[] args) {
		
		
		String str = "welcome to java";
		
		String reverseString= "";
		
		String[] words = str.split(" ");
		
		for(String word : words) {
			
			String reverseWord= "";
			
			for(int i=word.length()-1;i>=0;i--) {
				
				reverseWord = reverseWord + word.charAt(i);
			}
			reverseString = reverseString + reverseWord + "  ";
			
		}
		System.out.println(reverseString);
		


	}

}
