package javaUtility;

public class StringManipulation {

	public static void main(String[] args) {
		String s = "It's very hot today here";
		String s1 = " So stay cool";
		System.out.println(s.length());//length of string
		System.out.println(s.charAt(10));//h
		System.out.println(s.indexOf("here"));
		System.out.println(s.substring(0, 13));
		System.out.println(s.concat(s1));
		if(s.equalsIgnoreCase(s1)) {
			System.out.println(true);
		}

	}

}
