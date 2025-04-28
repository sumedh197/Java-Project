package javaProgram;

import java.util.Arrays;

public class FindSecondHighestNumberFromArray {

	public static void main(String[] args) {
		
		
		int num[] = {10,20,30,40,50};
		
		int size = num.length;
		
		Arrays.sort(num);
		
		System.out.println(num[size-2]);

	}

}
