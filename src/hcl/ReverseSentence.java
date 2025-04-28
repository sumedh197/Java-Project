package hcl;

public class ReverseSentence {

	public static void main(String[] args) {
		
		
		String str = "welcome to java";           //Output = java to welcome 
		
		String rev = "";
		
		String [] words = str.split(" ");
		
		for(int i=words.length-1;i>=0;i--) {
			
			rev = rev + words[i] + " ";
		}
		System.out.println(rev);

	}

}
