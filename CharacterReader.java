package ioPackage;


// this code is to read .txt file using character stream reader

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
public class CharacterReader {
	
	// method to load file 
	public static Reader ReadFile(String path) {
		File inputFile = new File(path);
		Reader returnReader = null;
		try {
			Reader readFile = new FileReader(inputFile);
			returnReader = readFile;
//			readFile.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return returnReader;
		
		
	}
	
	// method to get data into the array
	public static char [] StoreData (Reader fileReader) {
		char [] data = new char [100];
		try {
			System.out.println("file reader is ready to read .....");
			fileReader.read(data);
			System.out.println("File has been readed successfully...");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
		
	}

	
	// method to print data
	public static void printData(char [] data) {
		System.out.println("Data from the file is ......");
		System.out.println(data);
	}
	
	
	public static void main(String[] args) {
		
		printData(StoreData(ReadFile("E:\\JAVA\\JAVA note\\IO package\\notes.txt")));
		
	}
}
