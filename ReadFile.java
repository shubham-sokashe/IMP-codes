package ioPackage;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

// code to read file using IO package


import java.io.InputStream;

public class ReadFile {
	
	// method to get file  in stream
	public static InputStream readTxtFile(String path) {
		InputStream streameOfTxt = null;
		
		try{
		File inputTxtFile =  new File(path);
		InputStream txtStream =  new FileInputStream(inputTxtFile);
		System.out.println("Step 1 :\n\tFile has been converted into byte-stream....");
		streameOfTxt = txtStream;
		
//		txtStream.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		return streameOfTxt;
		
	}
	
	
	// method to read stream
	
	public static byte[] readStream(InputStream input) {
		byte [] dataArray = new byte [100];
		try {
			System.out.println("Step 2 : \n\tAvailable bytes into the stream : " + input.available());
			System.out.println("Step 3 : \n\t file is being readed.....");
			input.read(dataArray);
			System.out.println("Step 4 : \n\t file has been readed successfully...");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return dataArray;
	}
	
	
	
	// method to print the readed data
	public static void printData(byte [] inputArray) {
		String data = new String(inputArray);
		System.out.println("Step 4 : \n\t data from the file is ....\n\n" + data );
	}
	
	
	
	
	public static void main(String[] args) {
		
		InputStream streamedfile = readTxtFile("E:\\JAVA\\WORK_SPACE\\home_work\\src\\ioPackage\\Input.txt");
		byte [] readedBytes = readStream(streamedfile);
		printData(readedBytes);
		
		
	}
	

}
