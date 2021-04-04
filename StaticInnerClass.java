package innerClasses.demo;

public class StaticInnerClass {
	
	static String city;
	static int pinCode = 416115;
	int streetno;
	
	
	
	// static inner class
	static class InnerClass{
		
		int rollNo;
		static String name;
		
		 void printRollNO() {
			System.out.println("Roll no :" + rollNo);
		}
		 
		 static void printName() {
			 System.out.println("Name :" + name);
		 }
		 
		 static void printInfo() {
			 StaticInnerClass obj1 = new StaticInnerClass();
			 city = "Ichalkaranji";
			 obj1.streetno = 5;
			 System.out.println("City is :" + city);
			 System.out.println("Pincode : " + pinCode);
			 System.out.println("StreetNo : " + obj1.streetno);
		 }
		 
		 
		 
	}
	
	

	public static void main(String[] args) {
		
		// calling method from the static inner class
	InnerClass i1 =	new InnerClass();
		i1.rollNo = 10;
		InnerClass.name = "shubham";
		StaticInnerClass.InnerClass.printName(); // static resolve with class name so ..if Inner class have static context then that class should be static too
		i1.printRollNO();
		
		i1.printInfo();
		
	}

}
