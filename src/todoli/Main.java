package todoli;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		boolean exit = false;
		int userChoice;
		Scanner scnr = new Scanner(System.in);
		HashMap<Integer, ToDoList> userCreatedLists = new HashMap<Integer, ToDoList>();
		int count = 0;
		
		while (!exit) {
			// Main menu - Prompt user to select an option
			System.out.println("----------------------------");
			System.out.println(" **  MAIN MENU  ** ");
			System.out.println("What would you like to do?: ");
			System.out.println("1. View lists");
			System.out.println("2. Create new list");
			System.out.println("3. Edit existing list");
			System.out.println("4. Exit");
			
			// Get user selection and clear nextLine
			userChoice = scnr.nextInt();
			scnr.nextLine();
			
			switch(userChoice) {
				case 1:
					if (userCreatedLists.size() > 0) {
						System.out.println("----------------------------");
						System.out.println(" **  VIEW LISTS  ** ");
						for (int i = 0; i < userCreatedLists.size(); ++i) {
							ToDoList currentList = userCreatedLists.get(i);
							System.out.println(currentList.getName());
							for (int j = 0; j < currentList.getTaskCount(); ++j) {
								System.out.println(" - " + currentList.getTask(j));
							}
						}
						System.out.println();
						break;
					}
					else {
						System.out.println("No lists found.");
						break;
					}
				case 2:
					System.out.println("----------------------------");
					System.out.println(" **  CREATE NEW LIST  ** ");
					System.out.println("Enter the name of the list: ");
					
					String newListName = scnr.nextLine();
					ToDoList newList = new ToDoList(newListName);
					userCreatedLists.put(count, newList);
					count++;
					break;
				case 3:
					System.out.println("----------------------------");
					System.out.println(" **  EDIT LISTS  ** ");
					for (int i = 0; i < userCreatedLists.size(); ++i) {
						ToDoList currentList = userCreatedLists.get(i);
						System.out.println(i + ": " + currentList.getName());
					}
					System.out.println();
					System.out.println("Enter the index of the list you would like to edit: ");
					
					int indexOfListToEdit = scnr.nextInt();
					scnr.nextLine();
					
					// Load user selected ToDoList object to variable
					ToDoList listToEdit = userCreatedLists.get(indexOfListToEdit);
					
					
					// Editing specified list menu
					System.out.println("----------------------------");
					System.out.println(" **  EDITING " + listToEdit.getName() + "  ** ");
					System.out.println("What would you like to do?: ");
					System.out.println("1. Rename list");
					System.out.println("2. Add task");
					System.out.println("3. Remove task");
					System.out.println("4. Delete list");
					System.out.println("5. Return to main menu");
					
					// Get user selection
					int userEditOption = scnr.nextInt();
					scnr.nextLine();
					
					// User selects Rename list
					if (userEditOption == 1) {
						System.out.println("Enter the new name: ");
						String renamedList = scnr.nextLine();
						
						listToEdit.setName(renamedList);
					}
					// User selected Add task
					else if (userEditOption == 2) {
						System.out.println("Enter the new task: ");
						String taskToAdd = scnr.nextLine();
						
						listToEdit.addTask(taskToAdd);
					}
					// User selected Remove task
					else if (userEditOption == 3) {
						System.out.println("Enter the task to remove: ");
//						String taskToAdd = scnr.nextLine();
//						scnr.nextLine();
						
						System.out.println("** FIX ME **");
					}
					// User selected Delete list
					else if (userEditOption == 4) {
						System.out.println("Are you sure? (y/n): ");
						String userConfirmation = scnr.nextLine();
						
						if (userConfirmation.equalsIgnoreCase("y")) {
							userCreatedLists.remove(indexOfListToEdit);
							System.out.println(listToEdit.getName() + " has been deleted.");
							break;
						}
						else {
							break;
						}
					}
					// Default/User selected Return to main menu
					else {
						break;
					}
					break;
				case 4:
					exit = true;
					break;
				default:
					exit = true;
					break;
			}
			
		}
		
		System.out.println();
		System.out.println("Saving and closing...");
		scnr.close();
	}
}
