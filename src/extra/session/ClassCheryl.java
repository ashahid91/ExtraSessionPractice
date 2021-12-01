package extra.session;

public class ClassCheryl {

	public static void main(String[] args) {

		System.out.println("new class is created");// Cheryl

	}

	public static void overloading(int a, int b) {

		System.out.println(a + b);
	}

	public static void overloading(int a, int b, int c) {

		System.out.println(a + b + c);

	}

	public static void overloading(int a, String name) {
		a = 10;
		System.out.println(a);
		name = "Cheryl";
		System.out.println(name);
	}
	
}
