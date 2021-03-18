package InterviewScenarioOnPolymorphism;


// method overriding is applied to the method having same method name and arguments , then the rules for the access modifiers , no access modifiers , return type and exception get applied
// if those rules fails then compile time error is thrown

/// suppose the arguments are different then that will be existing as a different method

public class Example3 extends Parent1 {
	
	void method1(double d) { // this is not method overriding as the arguments are different
		System.out.println("Example3(child class) - method1 called");
	}
	

	
	public static void main(String[] args) {
		
		Example3 c1 = new Example3();
		c1.method1(1);
		c1.method1(null);

	}

}



class Parent1{
	
	void method1(Number n) {
		System.out.println("Parent1 class - method 1 called");
		
	}
	
}