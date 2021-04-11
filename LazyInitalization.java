package singletonDesignPattern;

public class LazyInitalization {

	private static LazyInitalization object1;
	
	private LazyInitalization() {}
	
	public static LazyInitalization getInstance() {
		
		if(object1 == null) {
			object1 = new LazyInitalization();
		}
		
		return object1;
	}
}
