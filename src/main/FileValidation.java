package main;

import java.io.IOException;

public class FileValidation extends Exception {

	public static void validation(String fileName, String file) throws Exception {
		try {
			if (fileName == null || file == null) {
				System.out.println("File not found");
				throw new FileValidation("File not found");  
			}
			else if (fileName.equalsIgnoreCase(file)) {
				System.out.println("File " + fileName + " already exists at " + LockedMe.FOLDER_NAME);
				throw new FileValidation("File " + fileName + " already exists at " + LockedMe.FOLDER_NAME);  
			} 

		} catch (Exception e) {
              throw e;
		}
	}
	
	FileValidation(String s) {
		super(s);
	}
}
