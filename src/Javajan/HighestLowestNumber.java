package Javajan;

public class HighestLowestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[] = {10,5,20,30,40,50};
		
		int smallest= num[0];
		
		int largest=num[0];
		
		for(int i=0;i<=num.length-1;i++) {
			
			if(num[i]>largest) {
				
				largest=num[i];
				
			}
				
			else if(num[i]<smallest) {
					
					smallest=num[i];
					
					
				}
				
			}
		
		System.out.println("smallest number is: " + smallest);
		
		
		
		System.out.println("largest number is:" + largest);
			
		}
		
	}


