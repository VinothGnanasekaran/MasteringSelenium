package learnFileReadWriteOperations;

import java.io.FileWriter;
import java.io.IOException;

public class UsingFileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location = "usingFileWriter.txt"; //This creates a file within the project folder itself as no spec path is defined.
		String content = "This is a sample content from the class to pass into the destination file";

		FileWriter obj = new FileWriter(location); // Initiatizing fileWriter
		obj.write(content); // writing the content into file
		obj.close(); //closing the filewriter
		System.out.println("Operation completed, Refresh the project to see newly created file");

	}

}
