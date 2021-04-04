package innerClasses.demo;

public class OuterClassDemo {
	
	static String name = "shubham";
	
	public static class InnerClass{
		
		 int rollNO = 4 ;
		 static void PrintName() {
			System.out.println("My name is " + name);
		}
		
		void printSurname() {
			System.out.println("Surname is Sokashe.");
		}
	}
	
	
	 
	 static void printage() {
		 
		 int age = 10 ;
		 
		 class Age{
			 
			private   void AgeIs() {
				 System.out.println("Age is : " + age);
				 name = "candy";
				 System.out.println("name is : " + name);
			 }
			 
		 }
		 
		 Age a1 = new Age();
		 a1.AgeIs();
		 
	 }
	public static void main(String[] args) {
		OuterClassDemo.InnerClass.PrintName();
		new InnerClass().printSurname();
		printage();
		 new InnerClass().printSurname();
		 
		 
		
	}

}
