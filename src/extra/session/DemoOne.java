package extra.session;

public class DemoOne {
	public static void main(String[] args) {
		System.out.println("Let the fun begin");
		System.out.println("I am ready ;)");
		
		getName("Amanda");
	}

	public static void OscartestingOne() {
		System.out.println("Attempting to create a conflict");
	}
	public static void getName(String name) {
		
		System.out.println("Tahmina");
	}
	
	public static void getName(String name) {
		System.out.println(name);
	}
}
