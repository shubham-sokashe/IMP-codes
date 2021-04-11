package singletonDesignPattern;

public class ThreadSafeSingleton {

		private static ThreadSafeSingleton object1 ;
		
		private ThreadSafeSingleton() {}
		
		public static synchronized ThreadSafeSingleton getInstance() {
			if(object1 == null) {
				object1 = new ThreadSafeSingleton();
			}
			return object1;
		}
		
		// synchronized methods reduces performance 
		
		// so double checked lock principle is used..
		
		public static ThreadSafeSingleton getInstanceDoubleCheck() {
			if(object1 == null) {
				synchronized(ThreadSafeSingleton.class) { // synchronized block is used
					if(object1 == null) {
						object1 = new ThreadSafeSingleton();
					}
				}
			}
			return object1;
		}
}

