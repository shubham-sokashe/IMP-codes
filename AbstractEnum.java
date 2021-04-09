package Enumeration;

public enum AbstractEnum {
	
	MONDAY{

		@Override
		public void display() {
			System.out.println("This is monday.....");
		}
		
	} ,
	
	SUNDAY{
		public void display() {
			System.out.println("THis is sunday........");
		}
	};
	
	final int days = 7;
	
	
	
	public abstract void display();
	
	public static void main(String [] args) {
		
		AbstractEnum.MONDAY.display();
		System.out.println("Days in week : " + AbstractEnum.MONDAY.days);
		
	}
}
