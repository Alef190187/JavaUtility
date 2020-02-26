package overLoadStaticMethod;

public class CopyArrayWithClone {

	public static void main(String[] args) {
	
    String [] array = {"Selenium", "Java", "Ruby", "C#", "Python"};
    String [] array1 = new String[array.length];
        
     array1= array.clone();
     
     for(String str: array) {
    	 System.out.println("The values of original array==>" +str);
     }
     
     System.out.println("=====================");
     
     for(String st:array1) {
    	 System.out.println("The value of copy array==>" +st);
     }
     
     
	}

}
