package main;

import java.io.File;

public class AddFile {

	public void addFile(String fileName) throws Exception {
		File filepath = new File(LockedMe.FOLDER_NAME + "/" + fileName);
		String[] list = LockedMe.FOLDER_NAME.list();
		for (String file : list) {
			FileValidation.validation(file, fileName);
		}
		filepath.createNewFile();
		System.out.println("File " + fileName + " added to " + LockedMe.FOLDER_NAME);
	}

}
