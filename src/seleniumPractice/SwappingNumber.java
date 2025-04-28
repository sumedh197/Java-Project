package seleniumPractice;

public class SwappingNumber {

	public static void main(String[] args) {

		int x = 10;

		int y = 20;

		x = x + y; //30
		y = x - y;//10
		x = x - y;//20
		
		System.out.println("after swapping");
		
		System.out.println("vallue of x is:"+ x);
		
		System.out.println("vallue of y is:"+ y);

	}

}
