package Jaiva;

public class swapfirstandlastCharacterFromString {

	public static void main(String[] args) {
		
		
		String str = "sumedh";
		
		char first = str.charAt(0);
		
		char last = str.charAt(str.length()-1);
		
		String middle = str.substring(1,str.length()-1);
		
		String result = last + middle + first;
		
		System.out.println(result);

	}

}
