package innerClasses.demo;

public class NestedInnerClass {
	
	// Inner Class
	private static class InnerClass{
		
		// Nested Inner Class
		private   class NestedClass{
			int id;
			String name;
			
			
			public void printId() {
				NestedClass n1 = new NestedClass();
				n1.id = 10;
				System.out.println("id is :" + n1.id);
			}
			
			private void printName() {
				NestedClass n2 = new NestedClass();
				n2.name = "Shubham";
				System.out.println("Name : "+ n2.name);
			}
			
			
		}
		
		
			static 	public void modifiedinfo() {
			InnerClass.NestedClass n3 = new InnerClass(). new NestedClass();
			n3.id = 20;
			n3.name = "abc";
			System.out.println("id is :" + n3.id);
			System.out.println("Name : "+ n3.name);
		}
		
	}

	public static void main(String[] args) {
		
		InnerClass.NestedClass ncs = new InnerClass().new NestedClass();
		ncs.printId();
		ncs.printName();
		new InnerClass().modifiedinfo();
		
		

	}

}
