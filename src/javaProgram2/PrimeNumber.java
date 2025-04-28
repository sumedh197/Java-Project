package javaProgram2;

public class PrimeNumber {

	public static boolean isPrimenumber(int num) {

		while (num < 2) {

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

		System.out.println("number is primr:" + isPrimenumber(4));

	}

}
