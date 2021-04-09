package Enumeration;

public class EnumsDemo {
	
	// method to access constants from the months enum
	public static void monthsArray() {
		Months [] allMonths = Months.values();
		System.out.println("Total months in year : ");
		for(Months m : allMonths) {
			System.out.println(m + "	Number of days init : " + m.getnumberOfDays());
		}
	}
	
// ---------------------------------------------------------------------------------------------------------------------	
	
	// print months precedence
	public static void printMonths(Months m) {
		System.out.println("Precedence of month : " + m.name() + "  is	" + m.precedence);
	}
	
//	---------------------------------------------------------------------------------------------------------------------
	
	// method to getordinal value of day
	public static int getOrdinal(Days d) {
		int ordinal = d.ordinal();
		return ordinal;
	}

//	---------------------------------------------------------------------------------------------------------------------

	
	public static void main(String[] args) {
		monthsArray();
		System.out.println("-----------------------------------------------------------------");
		
		printMonths(Months.MAY);
		System.out.println("-----------------------------------------------------------------");
		
		Days obj1 = Days.SUNDAY ;
		System.out.println("Day is : " + obj1 + "  its oridnal value is : "  + getOrdinal(obj1) + " Status is :  " + obj1.getStatus());
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("Tuesday is : " + Days.TUESDAY.compareTo(Days.MONDAY) + "  Days Away from " + Days.MONDAY); 
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("What day is it : " + Days.SATUREDAY.toString());
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println(Days.SUNDAY);
		Days.SUNDAY.isWeekend();
		System.out.println("-----------------------------------------------------------------");
		
		Days obj2 = Days.MONDAY;
		System.out.println(obj2.name() );
		obj2.isWeekend();
		
		
	}

}


// enum inside the java class
enum Days{
	MONDAY("Weekday"),
	TUESDAY("Weekday"),
	WEDNESDAY("Weekday"),
	THURSDAY("Weekday"),
	FRIDAY("Weekday"),
	
	SATUREDAY("Weekend"){
		public String toString() {
			return "This is Satureday..";
			
		}
	},
	
	SUNDAY("Weekend");
	
	
	private String status; // instance filed
	
	private Days(String day) { // constructor
		this.status = day;
	}
	 
	 public String getStatus() {
		 return this.status;
	 }
	 
	 
	 // method to check is weekend or not
	 public void isWeekend() {
		switch( this.status) {
		case "Weekday":
			System.out.println("Its a Working Day");
			break;
		case "Weekend":
			System.out.println("Its a weekend...!!");
			break;
		default:
			System.out.println("It doesnt matter.");
			break;
			
		}
	 }
	
	
	
}