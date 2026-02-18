package todoli;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		boolean exit = false;
		int userChoice;
		Scanner scnr = new Scanner(System.in);
		PrintMenus printMenus = new PrintMenus();
		List<ToDoList> userCreatedLists = new ArrayList<ToDoList>();
		
		while (!exit) {
			printMenus.mainMenu();
			
			// Get user selection and clear nextLine
			while (!scnr.hasNextInt()) {
				scnr.nextLine();
				printMenus.invalidInput();
			}
			userChoice = scnr.nextInt();
			scnr.nextLine();
			
			switch(userChoice) {
			
				// User selected View Lists menu
				case 1:
					if (userCreatedLists.size() > 0) {
						printMenus.viewLists(userCreatedLists);
						break;
					}
					else {
						printMenus.noListFound();
						break;
					}
					
				// User selected Create New List menu
				case 2:
					printMenus.createNewList();
					
					String newListName = scnr.nextLine();
					ToDoList newList = new ToDoList(newListName);
					userCreatedLists.add(newList);
					break;
					
				// User selected Edit Lists menu
				case 3:
					printMenus.editLists(userCreatedLists);
					
					while (!scnr.hasNextInt()) {
						scnr.nextLine();
						printMenus.invalidInput();
					}
					try {
						int indexOfListToEdit = scnr.nextInt();
						scnr.nextLine();
						
						// Load user selected ToDoList object to variable
						ToDoList listToEdit = userCreatedLists.get(indexOfListToEdit);
						printMenus.editingSubmenu(listToEdit);
						
						// Get user selection
						while (!scnr.hasNextInt()) {
							scnr.nextLine();
							printMenus.invalidInput();
						}
						int userEditOption = scnr.nextInt();
						scnr.nextLine();
						
						// User selects Rename list
						if (userEditOption == 1) {
							printMenus.renameList();
							String renamedList = scnr.nextLine();
							
							listToEdit.setName(renamedList);
						}
						// User selected Add task
						else if (userEditOption == 2) {
							printMenus.addTask();
							String taskToAdd = scnr.nextLine();
							
							listToEdit.addTask(taskToAdd);
						}
						// User selected Remove task
						else if (userEditOption == 3) {
							if (listToEdit.getTaskCount() < 1) {
								printMenus.noTasksFound();
								break;
							}
							else {
								printMenus.removeTask(listToEdit);
								
								while (!scnr.hasNextInt()) {
									scnr.nextLine();
									printMenus.invalidInput();
								}
								int taskToRemove = scnr.nextInt();
								scnr.nextLine();
								
								listToEdit.removeTask(taskToRemove);
								printMenus.taskDeleted();
							}
						}
						// User selected Delete list
						else if (userEditOption == 4) {
							printMenus.deleteConfirmation();
							String userConfirmation = scnr.nextLine();
							
							if (userConfirmation.equalsIgnoreCase("y")) {
								userCreatedLists.remove(indexOfListToEdit);
								printMenus.deleteCompleted(listToEdit);
								break;
							}
							else {
								break;
							}
						}
						else {
							break;
						}
					}
					catch (IndexOutOfBoundsException exception) {
						printMenus.invalidInput();
						break;
					}
					
					break;
				// User selected Exit
				case 4:
					exit = true;
					break;
				default:
					printMenus.invalidInput();
					break;
			}
			
		}
		
		printMenus.closeApplication();
		scnr.close();
	}
}
