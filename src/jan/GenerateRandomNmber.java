package jan;

import java.util.Random;

public class GenerateRandomNmber {

	public static void main(String[] args) {


		
		Random random = new Random();
		
		int num=0;
		
		for(int i=0;i<=10;i++) {
			
			num=random.nextInt(15);
			
			System.out.println("vallue" + " "+  num);
			
		}

	}

}
