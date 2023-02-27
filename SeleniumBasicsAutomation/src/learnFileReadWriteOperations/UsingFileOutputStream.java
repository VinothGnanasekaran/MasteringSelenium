package learnFileReadWriteOperations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFileOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		String location = "usingFOS.txt"; //This creates a file within the project folder itself as no spec path is defined.
		String content = "This is a sample content from the class to pass into the destination file";
		
		FileOutputStream fs = new FileOutputStream(location);
		byte[] bytes = content.getBytes();
		//Here in FOS the data is written to the file as raw bytes as is, without any encode/decode, hence, it is converted as byte []  and then written
		fs.write(bytes);
		fs.close();
		
	}

}
