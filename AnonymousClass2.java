package innerClasses.demo;

public class AnonymousClass2 extends Parent11 {

	
	// main method
	public static void main(String[] args) {
		AnonymousClass2 a1 = new AnonymousClass2() { // anonymous class using childs object
			public void info() {
				System.out.println("inside child anonymous class");
			}

		};
		a1.info(); // calling of method  from anonymous class associated with object

		
		
		
		Parent11 p1 = new Parent11() { // anonymous class using parent object
			public void info() {
				System.out.println("Parent class is used as anonymous class.");
			}

			@Override
			public void name() {
				// TODO Auto-generated method stub
				
			}
		};

		p1.info(); // calling of method  from anonymous class associated with object
	}

	@Override
	public void info() {
		System.out.println("inside overriding method");
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		
	}
}

abstract class Parent11 { // parent abstract class
	public abstract void info();
	public abstract void name();
}