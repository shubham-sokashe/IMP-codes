package innerClasses.demo;

public class AnonymousClass extends Parent {
	
	
	 Parent object1 = new Parent() {
		public void printinfo() {
			System.out.println("inside Child method");
		}
	};

	
	private void display() {
		AnonymousClass a1 = new AnonymousClass() {
			
			public void printinfo() {
				System.out.println("inside	Display method ");
			}
		};
		
		a1.printinfo();
	}
	public static void main(String[] args) {
		new AnonymousClass().printinfo();
		new AnonymousClass().display();
		
		//------------
		
	}

}

class Parent{
	
	
	public void printinfo() {
		System.out.println("inside Parent method");
	}
	
	public void name() {
		System.out.println("name");
	}
}