package cap;

import java.util.Arrays;

public class FindSecondHighrstNumberFromArray {

	public static void main(String[] args) {
		
		
		int num[] = {10,20,30,40,100};
		
		int size = num.length;
		
		Arrays.sort(num);
		
		System.out.println(num[size-2]);
				
	}

}
