package innerClasses.demo;

public class MethodInnerClass {
	
	
	// class inside a method
	public static void InnerClassMethod() {
		
		class InnerClass{
			
			int id;
			int pincode;
			String city = "Kop";
			
			private void printinfo() {
				id = 10;
				pincode  = 411046;
				
				System.out.println("city :" + city);
				System.out.println("pincode : " + pincode);
				System.out.println("id :" + id);
			}
			
			
		}
		
		new InnerClass().printinfo();
		
	}

	public static void main(String[] args) {
		InnerClassMethod();
	}

}
