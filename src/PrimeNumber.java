
public class PrimeNumber {
	
	
	public static boolean isPrimenumber(int num) {
		
		while(num<2) {
			
			return false;
		}
		
		for(int i=2;i<=num/2;i++) {
			
			if(num%i==0) {
				
				return false;
			}
		}return true;
		
		
	}

	public static void main(String[] args) {
		
		if(isPrimenumber(7)) {
			
			System.out.println("this is prime number");
		}
		else{
			
			System.out.println("its not a prime number");
		};
		

	}

}
