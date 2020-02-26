package javaUtility;

public class SwapingInt_and_String {

	public static void main(String[] args) {
		
		int x=20;
		int y=10;
		System.out.println("Before swaping x is ::" + x);
		System.out.println("Before swaping y is ::" + y);
		
		
		x = x+y;//30
		y= x-y; //20
		x = x-y; //10
		System.out.println("After swaping x is ::" + x);
		System.out.println("After swaping y is ::" + y);
		
		
		int a=20;
		int b=10;
		System.out.println("Before swaping a is ::" + a);
		System.out.println("Before swaping b is ::" + b);
		
		a = a*b; //200
		b = a/b; // 20
		a = a/b; //10
		System.out.println("After swaping a is ::" + a);
		System.out.println("After swaping b is ::" + b);
		
		String s = "Hello";
		String n = "World";
		
		System.out.println("Before swaping s is ::" + s);
		System.out.println("Before swaping n is ::" + n);
		
		s = s+n; // hellow world
		n = s.substring(0, s.length()-n.length()); //hello
		s = s.substring(n.length() ); //world/
		System.out.println("After swaping s is ::" + s);
		System.out.println("After swaping n is ::" + n);
		
	}
	 
}
