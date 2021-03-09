package homeWork14022021;
// write implicit and explicit conversion

public class ImplicitExplicitConversion {

	static byte b = 10;
	static short s = 800;
	static int i = 100;
	static long l = 194466l;
	static float f = 3.14f;
	static double d = 137.8946464d;

// implicit conversion
	
	static short s1 = b;
	static int i1 = s;
	static long l1 = i;
	static float f1 = l;
	static double d1 = f;

	// Explicit conversion
	
	static int i2 = (int)d;
	static byte b2 = (byte)f;
	static short s2 = (short)i;
	
	public static void main(String[] args) {

		System.out.println("Implicit conversion from byte = " + b + " to short " + s1);
		System.out.println("Implicit conversion from short = " + s + " to int " + i1);
		System.out.println("Implicit conversion from int = " + i + " to long " + l1);
		System.out.println("Implicit conversion from long = " + l + " to float " + f1);
		System.out.println("Implicit conversion from float = " + f + " to double " + d1);
		
		System.out.println("---------------------------------------------------");
		
		
		System.out.println("Explicit conversion from double = " + d + " to int " + i2);
		System.out.println("Explicit conversion from float = " + f + " to byte " + b2);
		System.out.println("Explicit conversion from int = " + i + " to short " + s2);
	}

}
