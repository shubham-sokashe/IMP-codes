package SeralizationAndDeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustomerInfo implements Serializable {
	
	private static final long serialVersionUID = -6209012439676009652L;
		public long customerAccountNo;
	 public  String accountHolderName;
	public transient  String accountPassward;
	 
	 public CustomerInfo(long accno , String name , String password) {
		 this.customerAccountNo = accno;
		 this.accountHolderName = name;
		 this.accountPassward = password;
	 }
	 
	 public CustomerInfo() {
		 
	 }
	 
	 public static void main(String[] args) {
		 CustomerInfo customer1 = new CustomerInfo(8806010156l , "shubham sokashe" , "dontknow123");
		 
		 try {
			FileOutputStream file = new FileOutputStream("CustomerDetails.txt"); // throws FileNotFoundException
			ObjectOutputStream object1 = new ObjectOutputStream(file); // throws IOException
			object1.writeObject(customer1);
			System.out.println("object has been serialized");
			object1.close();
			file.close();
		
		 } 
		 catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
