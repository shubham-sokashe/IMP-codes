package innerClasses.demo;

public class AnonymousClassDeclaration {
	
	
	// 1st method to declare anonymous class
	static Anonymous a1 = new Anonymous() {
		
		void printInfo() { //  this is over riding method 
			System.out.println("Inside Caller Class , print method using anonymous class .");
		}
	};
	
	
	// 2nd method to declare anonymous class -- inside the method
	public static void useAnonymous() {
		Anonymous ann1 = new Anonymous() {
			int id = 10;
			void printInfo() { // over riding method
				System.out.println("Inside useAnonymous method ..." + id);
			}
			
			void staticMethod() {
				System.out.println("Inside useAnonymous method of static method");
			}
		};
		ann1.printInfo();
		ann1.staticMethod();
		
		
	}
	public static void main(String[] args) {
		a1.printInfo();
		useAnonymous();

	}

}

// class to be used as anonymously
class Anonymous{
	
	int id;
	 void printInfo() {
		System.out.println("Inside Anonymous class print info method");
	}
	 
	  void staticMethod() {
		 System.out.println("Inside static method of Anonymous class");
	 }
}
