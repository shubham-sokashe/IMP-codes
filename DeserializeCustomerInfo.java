package SeralizationAndDeserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeserializeCustomerInfo implements Serializable {

	private static final long serialVersionUID = 2949129298719328117L;
	

	public static void printinfo(CustomerInfo info) {
		System.out.println("Customer name :" + info.accountHolderName);
		System.out.println("Customer Account name :" + info.customerAccountNo);
		System.out.println("Account Password:" + info.accountPassward);
	}
	
	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream("CustomerDetails.txt"); // throws FileNotFoundException
			ObjectInputStream inputobject = new ObjectInputStream(file); // throws IOException
			CustomerInfo readinfo = new CustomerInfo();
			readinfo = (CustomerInfo) inputobject.readObject();
			System.out.println("Object is deserialzied");
			inputobject.close();
			file.close();
			printinfo(readinfo);
			
		}
		catch(ClassNotFoundException e){
			System.out.println("Class not found exception caught");
		}
		catch(IOException e) {
			System.out.println("IOException caught");
			
		}
		
		
		

	}

}
