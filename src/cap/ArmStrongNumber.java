package cap;

public class ArmStrongNumber {

	public static void main(String[] args) {

		int num = 153;

		int rev = 0;

		int temp;

		temp = num;

		int cube = 0;

		while (num > 0) {

			rev = num % 10;
			num = num / 10;

			cube = cube + (rev * rev * rev);
		}
		
		System.out.println(cube);
		
		if(temp==cube) {
			
			System.out.println("this is armstrong number");
		}
		else {
			
			
			System.out.println("this is not a armstrong number");
		}

	}

}
