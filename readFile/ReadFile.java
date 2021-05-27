package com.readFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// code to read given file
public class ReadFile {
	private List <String []> Headers = new ArrayList<>();
	private List <String []> entries = new ArrayList<>();
	private String path;
	
	public ReadFile(String path) {
		this.path = path;
	}
	public List<String[]> getHeaders() {
		return Headers;
	}

	public List<String[]> getEntries() {
		return entries;
	}

	// method to read file
	public BufferedReader readFileLines(String path) {
		File toRead = new File(path);
		BufferedReader bufferToReturn = null;
		try{
			FileReader readFl = new FileReader(toRead);
			System.out.println("File is accepted to read..\n\n");
			BufferedReader buffer = new BufferedReader(readFl);
			System.out.println("Is BufferReader is ready to read file : " + buffer.ready() + "\n\n");
			bufferToReturn = buffer;
		}
		catch(FileNotFoundException e){
			System.out.println("Given file in not present in that directory......\n\n");
			e.getMessage();
		}
		catch(IOException e) {
			System.out.println("Found IOException to BufferREader while reading the file...\n\n");
		}
		  
		return bufferToReturn;
	}
	
	// method to read buffer and list of Strings
	public List<String> getListOfLines(BufferedReader buffer)  {
		List <String> allLines = new ArrayList<>();
		String lines = null;
		try {
		if(null != buffer) {
			while((lines = buffer.readLine()) != null) {
				allLines.add(lines);
			}
			
		}
		else {
			System.out.println("There is no data into the BufferReader object...\n\n");
		}
		}
		catch (IOException e) {
			System.out.println("Error in reading the lines from the buffer..\n\n");
		}
		return allLines;
	}
	
	//method to get String array from list to create column
	public boolean SplitAndSagrigate(List<String> rowList) {
		boolean result = false;
		List <String []> arrayOfDataInRow = new ArrayList<>();
		if(null != rowList) {
			Iterator <String> rowItr =rowList.iterator(); 
			while(rowItr.hasNext()) {
				String row = rowItr.next();
				if(row.length()>1) {		
					String [] dataFromRow = row.split("\\|");
					arrayOfDataInRow.add(dataFromRow);
					result = true;
				}
			}
		}
		else {
			System.out.println("List object which contains lines from file is empty...\n\n");
			result = false;
		}
		SagrigateRows(arrayOfDataInRow);
		return result;
	}
	
	private void SagrigateRows(List<String []> list) { 		
		Iterator<String[]> itr = list.iterator();
		while(itr.hasNext()) {
			String [] row =  itr.next();
			if(Integer.parseInt(row[0].trim()) == 0) {
				Headers.add(row);
			}
			else {
				entries.add(row);
			}
		}
	}

	public void sortFile() {
		System.out.println("Buffer Reader has initiated the reading...\n\n");
		BufferedReader bufferToReadFile = readFileLines(this.path);
		System.out.println("Buffer Reader has Completed the reading...\n\n");
		List <String> listOfLines = getListOfLines(bufferToReadFile);
		System.out.println("Buffer Reader has extracted the lines...\n\n");
		System.out.println("Initiating sorting of lines...\n\n");
		boolean result = SplitAndSagrigate(listOfLines);
		if(result) {
			System.out.println("File Sorting is Completed...\n\n Ready to persist..\n\n");
		}
		else {
			System.out.println("Failed in Sorting of file...\n\n");
		}
		closeBufferedReader(bufferToReadFile);
	}

	// method to close buffer reader
public void closeBufferedReader(BufferedReader reader) {
	try {
		reader.close();
		System.out.println("BufferedReader Object closed....\n\n");
	} catch (IOException e) {
		System.out.println("Failed to close BufferedReader Object...\n\n");
		e.printStackTrace();
	}
}
	
}
