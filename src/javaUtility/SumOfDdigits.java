package javaUtility;

public class SumOfDdigits {

	public static void main(String[] args) {
		int num=153;
		int sum = 0, rev =0;
		int r;
		int temp = num;
		while(temp!=0) {
			r = temp % 10;//reminder 
			sum = sum + r*r*r;
			//sum = sum + num % 10;
			temp = temp/10;		
		}
		System.out.println(sum);
		if(num==sum) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("not");
		}
		
		while(num!=0) {
			rev = rev * 10 + num %  10;//5
			num = num/10;
			r= num%10;
			
			r = temp % 10;
			sum = sum + r;
			temp = temp/10;
	}
		System.out.println(rev);

}
	
}
