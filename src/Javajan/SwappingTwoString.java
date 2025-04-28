package Javajan;

public class SwappingTwoString {

	public static void main(String[] args) {
		
		String a = "Sumedh";
		
		String b = "Polewar";
		
		a = a+b;
		
		b= a.substring(0,a.length()-b.length());
		
		a =a.substring(b.length());
		
		System.out.println("vallue of a is :" + a);
		
		System.out.println("vallue of b is :" + b);

	}

}
