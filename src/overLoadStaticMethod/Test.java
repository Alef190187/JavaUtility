package overLoadStaticMethod;

public class Test {

	public static void main(String[] args) {

		Samsung sam = new Samsung();
		
		Mobile.Camera();
        sam.Battery();
        sam.Camera();
	}

}
