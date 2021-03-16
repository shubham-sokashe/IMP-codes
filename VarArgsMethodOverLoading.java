package ExampleOfVarArgs;

public class VarArgsMethodOverLoading {

	
	public static  void sumNum(int ... args) {
		int s =0 ;
		for(int i : args) {
			s+= i;
		}
		System.out.println("Sum is : " + s);
	}
	
	private void sumNum(boolean b , String ...str) {
		boolean opposite = !b;
		System.out.println("Opposite of given value is :" + opposite);
		System.out.println("Give String is : " + str[0]);
	}
	
	public static void main(String[] args) {
		
		sumNum(10, 20, 30);
		
		new VarArgsMethodOverLoading().sumNum(true, "AShubham");

	}

}
