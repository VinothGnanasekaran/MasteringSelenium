package learnFileReadWriteOperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class UsingPath {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String location = "usingPath.txt"; //This creates a file within the project folder itself as no spec path is defined.
		String content = "This is a sample content from the class to pass into the destination file";
		
		//Path class to be used for location 
		Path path = Paths.get(location);
		
		//File class to be write
		Files.write(path, content.getBytes(), StandardOpenOption.CREATE);
		

	}

}
