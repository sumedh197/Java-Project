package javaProgram;

public class FindDuplicatewithoutusingHashMap {

	public static void main(String[] args) {
		
		
		String name[] = {"java","python","selenium","c#","selenium","python","java"};
		
		for(int i=0;i<=name.length-1;i++) {
			
			for(int j=i+1;j<=name.length-1;j++) {
				
				
				if(name[i].equals(name[j])) {
					
					
					System.out.println("duplicate element id:" + name[i]);
				}
			}
			
			
		}
		
	}

}
