package javaUtility;

public class CopyArray {

	public static void main(String[] args) {
        int []number= {1,4,5,7,9};
		
		int [] num = number.clone();
		
		for(int i=0; i<=num.length; i++) {
			System.out.println(num[i]);
		}
		

	}

}
