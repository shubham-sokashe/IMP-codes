package interview2202;

import java.util.Arrays;

public class Example3 {

	 static String helloWorld = "HELLOWORLD";
	static String java = "JAVAA";
	
	char [] hwArray = new char[helloWorld.length()];
	char [] javaArray = {'J', 'A', 'V', 'A','A'};
	
	
	
	
	
	public static void main(String[] args) {
		Example3 o1 = new Example3();
		
		for(int i=0 ; i<o1.hwArray.length ; i++) {
			
			o1.hwArray[i] = helloWorld.charAt(i);
			
			
		}
		
		int indexNo =0;
		for(int j=5; j<o1.hwArray.length; j++) {
			o1.hwArray[j] = o1.javaArray[indexNo];
			indexNo++;
			
		}
		
		Arrays.toString(o1.hwArray);
		System.out.println(o1.hwArray);
	}

}
