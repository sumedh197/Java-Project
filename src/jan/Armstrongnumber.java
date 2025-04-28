package jan;

public class Armstrongnumber {

	public static void main(String[] args) {
		
		
		int num = 155;
		
		
		
		int cube = 0;
		
		int r =0;
		
		int temp;
		
		temp=num;
		
		while(num>0) {
			
			r=num%10;
			
			num=num/10;
			
			cube = cube + (r*r*r);
		
		}
		
		System.out.println(cube);
		if(temp==cube) {
			
			System.out.println("this is armstrong number");
			
			
		}else {
			
			System.out.println("this is not armstrong number");
			
		}

	}

}
