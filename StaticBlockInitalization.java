package singletonDesignPattern;

public class StaticBlockInitalization {
	
	private static  StaticBlockInitalization object1; 	// object created
	
	private StaticBlockInitalization() {}	// private constructor
	
	static {
		try {
			object1 = new StaticBlockInitalization();
			
		}
		catch(Exception e) {
			System.out.println("Exception caught while creating Instance of singleton class");
		}
		
	}
	
	
	public static StaticBlockInitalization getInstance() {
		return object1;
	}
	

}
