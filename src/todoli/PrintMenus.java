package todoli;

import java.util.List;

public class PrintMenus {
	
	public void mainMenu() {
		System.out.println("----------------------------");
		System.out.println(" **  MAIN MENU  ** ");
		System.out.println("What would you like to do?: ");
		System.out.println("1. View lists");
		System.out.println("2. Create new list");
		System.out.println("3. Edit existing list");
		System.out.println("4. Exit");
	}
	
	public void viewLists(List<ToDoList> userCreatedList) {
		System.out.println("----------------------------");
		System.out.println(" **  VIEW LISTS  ** ");
		for (int i = 0; i < userCreatedList.size(); ++i) {
			ToDoList currentList = userCreatedList.get(i);
			System.out.println(currentList.getName());
			for (int j = 0; j < currentList.getTaskCount(); ++j) {
				System.out.println(" - " + currentList.getTask(j));
			}
		}
		System.out.println();
	}
	
	public void noListFound() {
		System.out.println("No lists found.");
	}
	
	public void createNewList() {
		System.out.println("----------------------------");
		System.out.println(" **  CREATE NEW LIST  ** ");
		System.out.println("Enter the name of the list: ");
	}
	
	public void editLists(List<ToDoList> userCreatedList) {
		System.out.println("----------------------------");
		System.out.println(" **  EDIT LISTS  ** ");
		for (int i = 0; i < userCreatedList.size(); ++i) {
			ToDoList currentList = userCreatedList.get(i);
			System.out.println(i + ": " + currentList.getName());
		}
		System.out.println();
		System.out.println("Enter the index of the list you would like to edit: ");
	}
	
	public void editingSubmenu(ToDoList listToEdit) {
		System.out.println("----------------------------");
		System.out.println(" **  EDITING " + listToEdit.getName() + "  ** ");
		System.out.println("What would you like to do?: ");
		System.out.println("1. Rename list");
		System.out.println("2. Add task");
		System.out.println("3. Remove task");
		System.out.println("4. Delete list");
		System.out.println("5. Return to main menu");
	}
	
	public void renameList() {
		System.out.println("Enter the new name: ");
	}
	
	public void addTask() {
		System.out.println("Enter the new task: ");
	}
	
	public void removeTask() {
		System.out.println("Enter the index of the task to remove: ");
	}
	
	public void deleteConfirmation() {
		System.out.println("Are you sure? (y/n): ");
	}
	
	public void deleteCompleted(ToDoList listToEdit) {
		System.out.println(listToEdit.getName() + " has been deleted.");
	}
	
	public void closeApplication() {
		System.out.println();
		System.out.println("Saving and closing...");
	}

}
