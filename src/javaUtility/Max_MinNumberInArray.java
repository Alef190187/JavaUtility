package javaUtility;

import java.util.Arrays;

public class Max_MinNumberInArray {

	public static void main(String[] args) {
		int numbers[] = {7,23,1,0,32,34};
		
		int max = numbers[0];
		int min = numbers[0];
		int sum = 0;
		for(int j=0; j<numbers.length; j++) {
			sum=sum+numbers[j];
		}
		System.out.println("The sum is ::" +sum);
		System.out.println("The avg is ::"+sum/numbers.length);
		for ( int i=1; i<numbers.length; i++) {
			if(numbers[i]>max) {
				max = numbers[i];
			}
			else if(numbers[i]<min) {
				min=numbers[i];
			}
		}
		System.out.println("array is::" + Arrays.toString(numbers));
		System.out.println("The maximum number is::" + max);
		System.out.println("The minimum number is::" + min);
		

	}

}
