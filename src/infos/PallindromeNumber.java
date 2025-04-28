package infos;

public class PallindromeNumber {

	public static void main(String[] args) {
		
		
		int num =151;
		
		int rev = 0;
				
		int temp;
		
		temp=num;
		
		while(num>0) {
			
			rev = rev * 10 + num%10;
			
			num = num/10;
		}
		if(temp==(rev)) {
			
			System.out.println("this is pallindrome number");
		}
		else {
			
			System.out.println("this is not a pallindrome number");
		}

	}

}
