package singletonDesignPattern;

public class EagerInitalization {
	
private static final EagerInitalization object1 = new EagerInitalization(); // object created at class loading

private EagerInitalization() {}		// private constructor

public static EagerInitalization getInstance() { 	// static factory method
	return object1;
}



}
