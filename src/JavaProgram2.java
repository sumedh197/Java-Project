
public class JavaProgram2 {

	public static void main(String[] args) {
	
		String str = "selenium";
		
		int len = str.length();
		
		String rev ="";
		
		for(int i=len-1;i>=0;i--) {
			
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
	}

}
