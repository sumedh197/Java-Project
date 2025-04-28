package seleniumPractice;

public class Pallindromestring {

	public static void main(String[] args) {
		
		String str = "malayalam";
		
		String rev = "";
		
		String temp;
		
		temp=str;
		
		for(int i=str.length()-1;i>=0;i--) {
			
			
			rev =rev + str.charAt(i);
		}
		
		System.out.println(rev);
		
		if(temp.equals(rev)) {
			
			System.out.println("this is pallindrome string");
		}
		
		else {
			
			System.out.println("this is not a pallindrome number");
		}
	}

}
