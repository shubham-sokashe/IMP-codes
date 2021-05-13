package ioPackage;


// code to write the stream into the txt file

import java.io.OutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {

	// method to create output stream 
	public static OutputStream getTxtFile(String path) {
		System.out.println("Step 3 : \n\t File is being Loaded..");
		File Destination = new File(path);
		OutputStream out = null;
		try {
			OutputStream outStream = new FileOutputStream(Destination);
			out  = outStream;
			System.out.println("Step 4 : \n\t file is loaded succesfully...");
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		return out;
		
	}
	
	// method to get data to read
	public static byte []  getData(String data) {
		 byte [] byteData = data.getBytes();
		 System.out.println("Step 1 : \n\t Data is been Converted to byte array ....");
		 return byteData;
	}
	
	
	// method to write the byte data into the out-stream
	public static void writetxtFile(byte [] data , OutputStream out) {
		try{
			out.write(data);
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Step 2 : \n\t byte data from array has been writted into the file successfully...");
	}
	
	
	// method to get data from uses from console
	public static String getInput() {
		String enteredData = "";
		Scanner input = new Scanner(System.in);
		System.out.println("please enter Statements to write into file...");
		enteredData = input.nextLine();
		
//		input.close();
		return enteredData;
	}
	
	public static void main(String[] args) {
		
//		String secondIp = getInput();
		writetxtFile( getData(getInput()) ,getTxtFile("E:\\JAVA\\WORK_SPACE\\home_work\\src\\ioPackage\\Output.txt") );
	}
	
}
