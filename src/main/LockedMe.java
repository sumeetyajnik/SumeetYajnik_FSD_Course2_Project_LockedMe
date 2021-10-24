package main;

import java.io.File;
import java.util.Scanner;

public class LockedMe {
	static String DIRECTORY;
	static File FOLDER_NAME;

	public LockedMe() {
		DIRECTORY = System.getProperty("user.dir");
		FOLDER_NAME = new File(DIRECTORY + "/files");
		if (!FOLDER_NAME.exists())
			FOLDER_NAME.mkdirs();
		System.out.println("DIRECTORY : " + FOLDER_NAME.getAbsolutePath());
	}

	private static final String WELCOME_LOCKED_ME = "*********** Welcome to LockedMe.com @2021-Sumeet Yajnik***********";

	private static final String MAIN_MENU = "\nMain Menu - Select any of the following: \n"
			+ "1 -> Show files in the directory\n" + "2 -> Add, Delete, Search, GoBack Menu\n" + "3 -> Exit Site";

	private static final String SECONDARY_MENU = "   \nSelect any of the following: \n" + "   a -> Add a file\n"
			+ "   b -> Delete a file\n" + "   c -> Search a file\n" + "   d -> GoBack";

	public static void main(String[] args) {
		System.out.println(WELCOME_LOCKED_ME);
		LockedMe menu = new LockedMe();
		menu.showMainMenu();
	}

	void showMainMenu() {
		System.out.println(MAIN_MENU);
		try {
			Scanner scanner = new Scanner(System.in);
			int option = scanner.nextInt();
			switch (option) {
			case 1: {
				ShowFiles.showFiles();
				showMainMenu();
			}
			case 2: {
				showSecondaryMenu();
			}
			case 3: {
				System.out.println("Thank you and see you soon!");
				System.exit(0);
			}
			default:
				showMainMenu();
			}
		} catch (Exception e) {
			System.out.println("Folder not found in the director: " +LockedMe.FOLDER_NAME);
			System.out.println("Please proceed with enter 1, 2 or 3");
			showMainMenu();
		}
	}

	void showSecondaryMenu() {
		System.out.println(SECONDARY_MENU);
		try {
			Scanner scanner = new Scanner(System.in);
			char[] input = scanner.nextLine().toLowerCase().trim().toCharArray();
			char option = input[0];

			switch (option) {
			case 'a': {
				System.out.print("Enter a File Name to add : ");
				String fileName = scanner.next().trim().toLowerCase();
				AddFile addFileObj = new AddFile();
				addFileObj.addFile(fileName);
				break;
			}
			case 'b': {
				System.out.print("Enter a File Name to delete : ");
				String fileName = scanner.next().trim();
				DeleteFile deleteFileObj = new DeleteFile();
				deleteFileObj.deleteFile(fileName);
				break;
			}
			case 'c': {
				System.out.print("Enter a File Name to search : ");
				String fileName = scanner.next().trim();
				SearchFile searchFileObj = new SearchFile();
				searchFileObj.searchFile(fileName);
				break;
			}
			case 'd': {
				System.out.println("Back to MAIN menu");
				showMainMenu();
				break;
			}
			default:
				System.out.println("Enter a, b, c or d");
			}
			showSecondaryMenu();
		} catch (Exception e) {
			System.out.println("Enter a, b, c or d");
			showSecondaryMenu();
		}
	}

}
