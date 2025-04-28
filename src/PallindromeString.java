
public class PallindromeString {

	public static void main(String[] args) {
		
		
		String str = "sumedh";
		
		String rev ="";
		
		String temp;
		
		temp=str;
		
		for(int i=str.length()-1;i>=0;i--) {
			
			
			rev= rev + str.charAt(i);
		}
		System.out.println(rev);
		
		if(temp.equals(rev)) {
			
			System.out.println("string is pallindrome");
		}
		else {
			
			System.out.println("string is not pallindrome");
		}

	}

}
