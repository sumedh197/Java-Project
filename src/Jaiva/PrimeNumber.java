package Jaiva;

public class PrimeNumber {

	public static boolean isPrimeNumber(int num) {

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

		int num = 6;

		if (isPrimeNumber(num)) {

			System.out.println("this is prime number");
		} else {

			System.out.println("this is not a prime number");
		}

	}

}
