package jan;

public class FindduplicateInTwostring {

	public static void main(String[] args) {
		
		String str = "sumedh";
		
		String str2 = "poleswar";
		
		char [] s1 = str.toCharArray();
		
		char [] s2 = str2.toCharArray();
		
		for(int i=0;i<=s1.length-1;i++) {
			
			for(int j=0;j<=s2.length-1;j++) {
				
				if(s1[i] ==(s2[i])){
					
					System.out.println(s1[i]);
				}
			}
		}
		

	}

	
}
