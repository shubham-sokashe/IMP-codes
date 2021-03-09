package homeWork15022021;

// use of math.toIntExact() method

public class MathToExactMethod {

	 static long i = 8806010156L; // we have declared long filed
	 
	 int i2 = Math.toIntExact(i);
	
	public void LongToInt() {
		int i1 = (int)i;
		System.out.print("Explicit Conversion from Long = " + i + " to int = " + i1);
		
	}
	
	
	public static void main(String[] args) {

		MathToExactMethod object1 = new MathToExactMethod();
		object1.LongToInt();
		//System.out.println(object1.i2);
		
	}

}
