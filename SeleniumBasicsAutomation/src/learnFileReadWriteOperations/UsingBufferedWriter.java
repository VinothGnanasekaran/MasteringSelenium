package learnFileReadWriteOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBufferedWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location = "usingBufferedWriter.txt"; //This creates a file within the project folder itself as no spec path is defined.
		String content = "This is a sample content from the class to pass into the destination file";

		FileWriter filewriter = new FileWriter(location);
		BufferedWriter bfwriter = new BufferedWriter(filewriter);
		
		bfwriter.write(content);
		bfwriter.close();
		
		System.out.println("Operation completed, Refresh the project to see newly created file");

		

	}

}
