package infos;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		int num= 153;
		int cube=0;
		
		int rev=0;
		
		int temp;
		temp=num;
		
		while(num>0) {
			
			rev = num%10;
			
			num = num/10;
			
			cube = cube + (rev*rev*rev);
		}
		
		System.out.println(cube);

	}

}
