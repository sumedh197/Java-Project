package javaProgram;

public class PrimeNumber {
	
	public static boolean isPrimeNumber(int num) {
		
		if(num<2) {
			
			return false;
		}
		
		for(int i=2;i<num;i++) {
			
			if(num%i==0) {
				
				
				return false;
			}
		}
		return true;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(isPrimeNumber(7)); <=for single number
		
		//for range
		for(int i=0;i<=100;i++) {
			
			if(isPrimeNumber(i)) {
				
				System.out.println("number is prime"+" "+ i);
			}else {
				
				System.out.println("numbe not prime" + " "+ i);
			}
			
		}
		
	}

}
