package cap;

public class PrimeNumber {
	
	
	public static  boolean isPrimeNumvber(int num) {
		
		while(num<1) {
			
			return false;
		}
		
		for(int i=2;i<num;i++) {
			
			
			if(num%2==0) {
				
				return false;
			}
		} return true;
	}

	public static void main(String[] args) {
		
		
		if(isPrimeNumvber(4)) {
			
			System.out.println("prime number");
		}
		else {
			
			System.out.println("its not a prime number");
		}
		
		

	}

}
