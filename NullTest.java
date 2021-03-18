package InterviewScenarioOnPolymorphism;

public class NullTest {
	
	
	// overloading scenario
	
	public static void method(Object obj , Object obj1) {
		System.out.println("method accepting two argumetns of object is called");
	}

	public static void method(String str ,  Object obj) {
		System.out.println("Method accepting string parameter and object parameter is called");
		
	}
	
	
	public static void main (String [] args) {
		
		method(null , null); // method accepting String and object is called as it will consider child first for the method resolving
	}
}
