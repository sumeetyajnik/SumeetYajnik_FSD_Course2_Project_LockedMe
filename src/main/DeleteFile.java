package main;

import java.io.File;

public class DeleteFile {
	
	public void deleteFile(String filename) throws Exception {
        File filepath = new File(LockedMe.FOLDER_NAME +"/"+filename);
        String[] list = LockedMe.FOLDER_NAME.list();
        for (String file: list) {
            if (filename.equals(file) && filepath.delete()) {
                System.out.println("File " + filename + " deleted from " + LockedMe.FOLDER_NAME);
                return;
            }
        }
        FileValidation.validation(null, null);
    }

}
