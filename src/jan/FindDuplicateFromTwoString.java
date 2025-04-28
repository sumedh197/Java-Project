package jan;

import java.util.Arrays;

public class FindDuplicateFromTwoString {

	public static void main(String[] args) {

		
		String s1 = "sumedhpolewar";
		
		String s2 = "ankurKinhukar";
		
		char[] c1 = s1.toCharArray();
		
		char[] c2 =s2.toCharArray();
		
		
		for(int i=0;i<=c1.length-1;i++) {
			
			
			for(int j=0;j<=c2.length-1;j++) {
				
				if(c1[i]==c2[j]) {
					
					System.out.println("duplicate char are:" +  c1[i]);
					
				}
				
			}
			
			
			
		}
		

	}

}
