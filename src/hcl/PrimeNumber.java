package hcl;

public class PrimeNumber {

	public static boolean isPrimeNumber(int num) {

		while (num < 2) {

			return false;
		}

		for (int i = 2; i <= num / 2; i++) {

			if (num % i == 0) {

				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {

		int num = 5;

		if (isPrimeNumber(num)) {

			System.out.println("this is prime number");

		} else {

			System.out.println("this is not a prime number");

		}

	}

}
