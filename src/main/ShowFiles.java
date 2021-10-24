package main;

import java.util.Arrays;

public class ShowFiles {
	
	public static void showFiles() {
		
	        if (LockedMe.FOLDER_NAME.list().length==0)
	        	System.out.println("Folder not found in the director: " +LockedMe.FOLDER_NAME);
	        else {
	            String[] list = LockedMe.FOLDER_NAME.list();
	            System.out.println("The files in the director"+ LockedMe.FOLDER_NAME +" are :");
	            Arrays.sort(list);
	            for (String str:list) {
	                System.out.println(str);
	            }
	        }
	    }

}
