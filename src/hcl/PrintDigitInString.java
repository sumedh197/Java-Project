package hcl;

public class PrintDigitInString {

	public static void main(String[] args) {
		
		
		String str = "india scored 100 runs";
		
		for(int i=0;i<=str.length()-1;i++) {
			
			char ch = str.charAt(i);
			
			if(Character.isDigit(ch)) {
				
				System.out.print(ch);
			}
		}
	}

}
