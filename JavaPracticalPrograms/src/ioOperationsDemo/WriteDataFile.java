package ioOperationsDemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataFile {

	public static void main(String[] args) {
		
		String text = "this is the content to write in the file";
		
		//Try-with-resouce 
		try(BufferedWriter f_writer	= new BufferedWriter(new FileWriter("C:\\Users\\santh\\OneDrive\\Documents\\Edubridge\\Class\\demo.doc"))) 
		{

			// Step 2: Write text(content) to file
			f_writer.write(text);
			f_writer.write(text);
			
			// Step 3: Printing the content inside the file
			System.out.println(text);

			// Step 4: Display message showcasing
			// successful execution of the program
			System.out.println("File is created successfully with the content.");

		}
		// Catch block to handle if exceptions occurs
		catch (IOException e) {

			System.out.print(e.getMessage());
		}
	}
}