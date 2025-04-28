package basicjava;

public class PrimeNumber {

	public static boolean isPrimeNumber(int num) {

		for (int i = 2; i <= num; i++) {

			if (num % 2 == 0) {

				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (isPrimeNumber(9)) {

			System.out.println("prime number");
		} else {

			System.out.println("not prime number");
		}
	}

}
