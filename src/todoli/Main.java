package todoli;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		boolean exit = false;
		int userChoice;
		Scanner scnr = new Scanner(System.in);
		ArrayList<ToDoList> userCreatedLists = new ArrayList<>();;
		
		while (!exit) {
			// Main menu - Prompt user to select an option
			System.out.println("What would you like to do?: ");
			System.out.println();
			System.out.println("1. View lists");
			System.out.println("2. Create new list");
			System.out.println("3. Edit existing list");
			System.out.println("4. Exit");
			
			userChoice = scnr.nextInt();
			
			ToDoList testList = new ToDoList("Test List");
			userCreatedLists.add(testList);
			
			switch(userChoice) {
				case 1:
					if (userCreatedLists.size() > 0) {
						for (int i = 0; i < userCreatedLists.size(); ++i) {
							ToDoList currentList = userCreatedLists.get(i);
							System.out.println(currentList.getName());
						}
						break;
					}
					else {
						System.out.println("No lists found.");
						break;
					}
				case 2:
					System.out.print(" **  CREATE NEW LIST  ** ");
					break;
				case 3:
					
					break;
				case 4:
					exit = true;
					break;
				default:
			}
			
		}
		
		System.out.println();
		System.out.println("Saving and closing...");
		scnr.close();
	}
}
