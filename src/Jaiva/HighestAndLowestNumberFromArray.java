package Jaiva;

public class HighestAndLowestNumberFromArray {

	public static void main(String[] args) {

		int num[] = { 10, 20, 30, 5, 40 };

		int largest = num[0];

		int smallest = num[0];

		for (int i = 0; i <= num.length - 1; i++) {

			if (num[i] > largest) {

				largest = num[i];
			}
			if (num[i] < smallest) {

				smallest = num[i];
			}
		}

		System.out.println("largest number is:" + largest);

		System.out.println("smallest number is:" + smallest);

	}

}
