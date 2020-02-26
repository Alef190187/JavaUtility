package javaUtility;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, sum=0, temp, r;
		System.out.print(" Enter any  number :: ");
	    num = input.nextInt();
	    temp = num;
		while(temp!=0) {
			r = num % 10;
			sum = sum * 10 + r;
			temp = num/10;
		}
		System.out.println("The reverse number is :: " + sum);

	}

}
