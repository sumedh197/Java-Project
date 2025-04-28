package seleniumPractice;

import java.util.Arrays;

public class SecondHighestNumberFromArray {

	public static void main(String[] args) {
		
		
		int arr[]= {10,20,30,40,50};
		
		int size = arr.length;
		
		Arrays.sort(arr);
		
		System.out.println(arr[size-2]);

	}

}
