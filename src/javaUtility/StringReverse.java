package javaUtility;

public class StringReverse {

	public static void main(String[] args) {
		
		String st = "Selenium";
		StringBuffer sf = new StringBuffer(st);
		System.out.println(sf.charAt(2));
		System.out.println(sf.length());
		
		System.out.println(sf.reverse());
		//excluding other thing.
		
		String j ="@@@@123$$$$$*******Ban!!!!gla%%%%desh";
		j = j.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(j);
		
		
		int num = 1234;
		int rev = 0;
		while(num!= 0) {
			rev = rev * 10 + num %10;
			num = num/10;
		}
     System.out.println(rev);
	}

}
