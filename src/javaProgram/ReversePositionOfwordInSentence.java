package javaProgram;

public class ReversePositionOfwordInSentence {

	public static void main(String[] args) {
		//input= welcome to java => output = java to welcome

		
		String str ="welcome to java";
		
		String[] words = str.split(" ");
		
		String rev = "";
		
		for(int i=words.length-1;i>=0;i--) {
			
			
			rev = rev + words[i]+" " ;
		}
		
		System.out.println(rev);
	}

}
