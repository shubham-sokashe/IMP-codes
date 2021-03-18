package InterviewScenarioOnPolymorphism;

public class Example2 {
	
	public static void main(String [] args) throws Throwable {
		
		SuperParent s1 = new FirstChild();
		s1.draw(20, 20.3f);
		
		FirstChild f1 = (FirstChild) s1;
		f1.draw(30, 10.1f);
		
		GrandChild g1 = (GrandChild) f1;// downcast
		g1.draw(1, 1.1f);
	}
	
	

}


class SuperParent{
	
	void draw(int a , float f) throws Throwable{
		System.out.println("Circle");
		
	}
	
	
}


class FirstChild extends SuperParent{
	
	void draw(int a , float f) {
		System.out.println("Rectangle");
		
	}
	
}


class GrandChild extends FirstChild  {
	
	void draw (int a , float f) throws ArithmeticException {
		System.out.println("Square");
	}
}