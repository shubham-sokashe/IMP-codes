package AnonymousClass;

public class Main extends Calculate {

	public static void main(String[] args) {

		int result = new Calculate() {public int add(int a , int b) {return a+b;}}.add(10, 20); // here we have written anonymous class
		
		System.out.println(result);
	}


}
