package ioPackage;

// code to get file info that is number of lines ..number of sentences , words etc


import java.io.File;
import java.io.Reader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class GetFileInfo {

	public static void main(String[] args) {

		// to get file
		
		File input = new File("E:\\JAVA\\WORK_SPACE\\home_work\\src\\ioPackage\\Input.txt");
		
		try {
			
			Reader readFile = new FileReader(input);
			BufferedReader reader  = new BufferedReader(readFile);
			
			String line;
			int wordCount =0 ;
			int charCount = 0 ;
			int sentenceCount = 0;
			int whitespaceCount = 0 ;
			int paragraphCount = 1;
			
			// read line by line
			
			while((line = reader.readLine()) != null) {
				if(line.equals("")) {
					paragraphCount++;
				}
				else {
					charCount += line.length();
					String [] wordsInFile = line.split("\\s+");
					wordCount += wordsInFile.length;
					whitespaceCount += wordCount -1;
					
					String [] sentenceInFile = line.split("[!?.:]+");
					sentenceCount += sentenceInFile.length;
					
				}
			}

			System.out.println("Number of paragraphs in file : " + paragraphCount);
			System.out.println("Number of Sentences in file : " + sentenceCount);
			System.out.println("number of white spaces in file : " + whitespaceCount);
			System.out.println("number of words in file : " + wordCount);
			System.out.println("number of characters in file " + charCount);
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
