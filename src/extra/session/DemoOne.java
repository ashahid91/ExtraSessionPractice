package extra.session;

public class DemoOne {
	public static void main(String[] args) {
		System.out.println("Let the fun begin");
		System.out.println("I am ready ;)");
		
		getName("Amanda");
		getMyname("Najib");
	}
	
	public static void CherylMethod() {
		System.out.println("let's start the conflicts");
	}
	public static void getMyname(String name) {
		System.out.println("My name is: " + name);
	}


	public static void OscartestingOne() {
		System.out.println("Attempting to create a conflict");
		
		System.out.println("Shada");
		
	}
	public static void getName(String name) {
		
		System.out.println("Tahmina");
		System.out.println("Hello everyone");
	}
	
	public static void getName2(String name) {
		System.out.println(name);
	}
	
	public static void OscartestingTwo() {
		System.out.println("I feel lucky right now");
	}
}
