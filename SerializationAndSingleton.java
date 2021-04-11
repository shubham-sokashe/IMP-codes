package singletonDesignPattern;

import java.io.Serializable;

public class SerializationAndSingleton  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private SerializationAndSingleton() {}
	
	private static class Helper{
		private static SerializationAndSingleton object1 = new SerializationAndSingleton();
	}

	public static SerializationAndSingleton getInstance() {
		return Helper.object1;
	}
	
	protected Object readReslove() {
		return getInstance();
	}
}
