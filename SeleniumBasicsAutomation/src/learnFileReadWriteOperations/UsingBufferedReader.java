package learnFileReadWriteOperations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UsingBufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location = "usingBufferedWriter.txt";
		
		FileReader fileReader = new FileReader(location);
		
		BufferedReader reader = new BufferedReader(fileReader);
		
		//String currentLine = reader.readLine();  //Reads only the first line or upto escape character and terminates the read operations for further lines
		//System.out.println(currentLine);
		
		String currentLine;
		//This helps in reading the entire content of the file
		while((currentLine = reader.readLine())!=null){
			System.out.println(currentLine);
			}

		
		
		
	}

	
}
