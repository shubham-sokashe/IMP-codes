package InterviewScenarioOnPolymorphism;

public class Example1 {
	
	public static void main(String [] args) {
		
		new Child().method(10); // this will call inherited method from Parent class
		new Child().method(10.2); // this will call overriding method from the Child class
		
		
	}

}


class Parent{
	strictfp void method(int i) {
		System.out.println("Inside Parent Class int  Method");
	}
	
	strictfp void method (double d) {
		System.out.println("Inside Parent Class double method");
	}
	
}



class Child extends Parent{
	
	void method (double f) { // overriding method
		System.out.println("Inside Child Class double method");
	}
	
	
}