package cap;

public class FindMissingNumberFromArray {

	public static void main(String[] args) {
		
		int num[] = {1,2,4,5};
		
		int sum = 0;
		
		for(int i=0;i<=num.length-1;i++) {
			
			sum = sum+ num[i];
		}
		System.out.println(sum);
		
		int sum1=0;
		
		for(int i=1;i<=5;i++) {
			
			sum1= sum1+i;
		}
		
		System.out.println(sum1);
		
		System.out.println(sum1-sum);
		
		
		
		
		
	}

}
