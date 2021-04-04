package innerClasses.demo;

public class AbstractInnerClass {
	
	
	private abstract class InnerClass{
		
		public abstract void display();
		public void printName() {
			System.out.println("Class name : InnerClass" );
		}
		
		
	}
	
	
	public  class Extended extends InnerClass{

		@Override
		public void display() {
			System.out.println("Inside Extended class display method");
		}
		
		public void printName() {
			System.out.println("Class name :  Extended");
		}
		
	}
	
	
	public static void main(String[] args) {
		AbstractInnerClass.Extended ex1 = new AbstractInnerClass(). new Extended();
		ex1.display();
		ex1.printName();
		
		
		AbstractInnerClass.InnerClass inn1 = new AbstractInnerClass(). new InnerClass() {

			@Override
			public void display() {
				System.out.println("Inside anonymous display method");				
			}
			
		};
		inn1.display();
		
		
	}
	

}
