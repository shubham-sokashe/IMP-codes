package innerClasses.demo;

public class NonStaticInnerClass {
	
	String city ;
	static int pinCode;
	static int StreetNo  = 4 ;
	
	// non static inner class
	class InstanceInnerClass{
		
		 String name ;
		static final int id = 10;
		long contactNO;
		
		private void display() {
			System.out.println("Inside inner non static display method");
			city = "Kolhapur";
			pinCode = 416115;
			System.out.println("City is :" + city);
			System.out.println("Street no :" + StreetNo);
			System.out.println("PinCode is : " + pinCode); 
		}
	}

	
	
	public static void main(String[] args) {
		
		NonStaticInnerClass.InstanceInnerClass i1 = new NonStaticInnerClass() . new InstanceInnerClass();
		i1.name = "candy";
		i1.contactNO = 8806010156l;
		System.out.println("id :" + i1.id);
		System.out.println("name :" + i1.name);
		System.out.println("Contact No :" + i1.contactNO);
		i1.display();
		
		
	}

}
