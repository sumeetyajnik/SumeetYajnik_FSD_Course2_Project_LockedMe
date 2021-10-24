package main;

public class SearchFile {
	
	public void searchFile(String filename) throws Exception {
	        String[] list = LockedMe.FOLDER_NAME.list();
	        for (String file: list) {
	            if (filename.equals(file)) {
	                System.out.println("FOUND : File " + filename + " exists at " + LockedMe.FOLDER_NAME);
	                return;
	            }
	        }
	        FileValidation.validation(null, null);
	    }

}
