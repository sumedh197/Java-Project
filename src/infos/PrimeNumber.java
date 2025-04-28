package infos;

public class PrimeNumber {
	
	
	public static boolean IsPrimeNumber(int num) {
		
		while(num<2) {
			
			return false;

		}
		
		for(int i=2;i<=num;i++) {
			
			if(num%i==0) {
				
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		
		
		
		for(int i=0;i<=10;i++) {
			
			if (IsPrimeNumber(i)) {
				
				System.out.println("prime: " + i);
			}
			else {
				
				System.out.println("no prime:"+ i);
			}
		}


		
	}

}
