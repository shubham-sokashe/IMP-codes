package innerClasses.demo;

public class InnerInterFace {
	
	
	// innner interface
	interface Writeable{
		
		void write();
	}
	
	
	// Inner class implementing Inner interface
	class Inner implements Writeable, Readable.Closable , Readable{

		@Override
		public void write() {
			System.out.println("Inside write method of Inner class implementing Writeable");
		}

		@Override
		public void read() {
			System.out.println("inside read method of inner class implemeting readable");
			
		}

		@Override
		public void close() {
			System.out.println("Inside close method of inner class implemeting closeable ");
		}
		
	}

	
	
	public static void main(String[] args) {
		InnerInterFace.Inner obj1 = new InnerInterFace().new Inner();
		obj1.write();
		obj1.read();
		obj1.close();
	}

}

//outer interface
interface Readable{
	void read();
	
	interface Closable{
		void close();
	}
}

