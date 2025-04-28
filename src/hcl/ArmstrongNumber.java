package hcl;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int num = 153;

		int cube = 0;

		int rem = 0;

		int temp;

		temp = num;

		while (num > 0) {

			rem = num % 10;

			num = num / 10;

			cube = cube + (rem * rem * rem);
		}

		System.out.println(cube);

		if (temp == cube) {

			System.out.println("this is armstrong number");
		} else {

			System.out.println("this is not a armstrong number");
		}

	}

}
