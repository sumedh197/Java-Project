package Jaiva;

public class PrimeNumberRange {

	public static boolean isPrimenumber(int num) {

		while (num < 1) {

			return false;
		}

		for (int i = 2; i <= num; i++) {

			if (num % 2 == 0) {

				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		
		for(int i=2;i<=100;i++) {
			
			if(isPrimenumber(i)) {
				
				System.out.println("this is prime number:" + i);
			}
			else {
				
				System.out.println("this is not a prime number:" + i);
			}
		}

	}

}
