package InterviewScenarioOnPolymorphism;

public class Example4 extends A {

	public static void main(String[] args) {
		Example4 e1 = new Example4();
		A a = new A();
		
		
		// so first instance block will get executed as object is created
		// in instance block m1() method will call the method of a class of which object is created
		// then it will execute no args constructor of child class as object is created
		// the child's no agrs constructor contains super() ,  so it will call constructor of parent class. 
	}

	
	
	void m1() { // overriding method
		System.out.println("Class Example4 m1 method called");
	}
}


class A{
	
	
	// instance block
	{
		m1();
	}
	
	void m1() {
		System.out.println("Class A method m1 called");
	}
	
	A(){
		System.out.println("Class A Constructor called");
	}
}