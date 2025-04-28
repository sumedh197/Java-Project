package javaProgram2;

public class SwappingString {

	public static void main(String[] args) {
		
		
		String a = "hello";
		String b = "world";
		
		a = a+b;
		
		b=a.substring(0, a.length()-b.length());
		
		a= a.substring(b.length());
		
		System.out.println("vallue of a is:"+ a);
		
		System.out.println("vallue of b is:"+ b);
	}

}
