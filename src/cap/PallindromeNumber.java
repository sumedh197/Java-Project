package cap;

public class PallindromeNumber {

	public static void main(String[] args) {

		int num = 123;

		int rev = 0;

		int temp;

		temp = num;

		while (num > 0) {

			rev = rev * 10 + num % 10;

			num = num / 10;
		}
		System.out.println(rev);

		if (temp == rev) {

			System.out.println("this is pallindrome number");

		} else {

			System.out.println("this s not pallindrome number");
		}
	}

}
