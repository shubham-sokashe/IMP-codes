package singletonDesignPattern;

public class BillPughSingletonImplementation {
	
	
	private BillPughSingletonImplementation() {}
	
	private static class Helper { 		// inner static helper class
		
		private static BillPughSingletonImplementation object1 = new BillPughSingletonImplementation();
	}
	
	
	public static BillPughSingletonImplementation getInstance() {
		return Helper.object1;
		
	}

}
