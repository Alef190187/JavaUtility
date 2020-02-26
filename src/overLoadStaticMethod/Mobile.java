package overLoadStaticMethod;

public class Mobile {
	
	public static void Camera() {
		System.out.println("This is Mobile Camera Method");
	}
	public  void Camera(String name) {
		System.out.println("This is one param  Mobile Camera Method");
	}
	public void Screen() {
		System.out.println("This is mobile Screen method");
	}
	
	public void Battery() {
		System.out.println("this is mobile battery method");
	}
}
