package seleniumPractice;

public class PrimeNumber {
	
	public static boolean isprimeNumber(int num) {
		
		if(num<2) {
			
			return false;
		}
		
		for(int i=2;i<=num;i++) {
			
			if(num%2==0) {
				
				return false;
			}
			
		}
		return true;
		
		
		
	}

	public static void main(String[] args) {
		
		if(isprimeNumber(7)) {
			
			
			System.out.println("it is prime number");
		}
		else {
			
		System.out.println("it nt prime number");
		}
		
	}

}
