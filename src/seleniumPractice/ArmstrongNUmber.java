package seleniumPractice;

public class ArmstrongNUmber {

	public static void main(String[] args) {

		int num = 153;

		int cube = 0;

		int r = 0;

		int temp;

		temp = num;

		while (num > 0) {

			r = num % 10;

			num = num / 10;

			cube = cube + (r * r * r);

		}

		System.out.println(cube);

		if (temp == cube) {

			System.out.println("number is pallindrome");
		}

	}

}
