package interview2202;

public class Example2 {
	
	int i;
	static String q = "ABC";
	
	
	static
	{	
		System.out.println("Inside Static Block A");
		Example2 sobj = new Example2();
		System.out.println(sobj.i = 10);
	}

	
	{	System.out.println(q);
		System.out.println("Inside Instance Block");
	}
	
	
	
	public Example2() {
		System.out.println("inside Constructor");
	}
	
	public void m1() {
		System.out.println("Inside Method 1");
	}
	
	static
	{
		System.out.println("Inside Static Block B");
	}
	
	
	public static void main(String[] args) {

		Example2 o1 = new Example2();
		o1.m1();
		//Example2 o2 = new Example2();
	}

}
