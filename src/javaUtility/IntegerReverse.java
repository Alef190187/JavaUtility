package javaUtility;

public class IntegerReverse {

	public static void main(String[] args) {
		
		int num = 123,
	    sum =0,  
	    temp;//12345,121
		//int r;
		temp = num;
		while (temp!=0) {
			//r = temp%10;
			sum = sum * 10 + temp % 10;
			temp = temp/10;
		
		//long num = 12345;
		//long num = 121;
		//long rev = 0;
		//while(num!=0) {
			//rev = rev * 10 + num %  10;//5
			//num = num/10;
			 
		}
      //System.out.println(" The reverse number is===>" +rev);
      System.out.println(" The reverse number is===>" + sum);
      if(temp==sum) {
    	  System.out.println("This is pelindrome number");
      }else{
    	 System.out.println("This is not pelindrome "); 
      }
       
      
	}

}
