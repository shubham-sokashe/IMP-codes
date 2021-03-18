package InterviewScenarioOnPolymorphism;

public abstract class Example5 {
	
	
	private void m1() {
		System.out.println("A");
	}

	public static void main(String[] args) {
		
		Example5 e1 = new SubClassB();
		e1.m1();
	}

}

class SubClassB extends Example5{
	protected void m1() {
		System.out.println("B");
	}
	
}