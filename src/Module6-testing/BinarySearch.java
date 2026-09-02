// package files;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Random rNumber = new Random();
		List<Double> data = new ArrayList<>();
		final int MAX_LIST_LENGTH = 99999999;
		final int DATA_MULTIPLE = 1000000;
		double searchTarget;
		
		// Generate testing data
		for (int i = 0; i < MAX_LIST_LENGTH; i++) {
			data.add(rNumber.nextDouble(DATA_MULTIPLE));
		}
		
		// Sort the ArrayList
		Collections.sort(data);
		
		// Set the search target
		searchTarget = data.get(999900);
		
		// Implement binary search algorithm to find search target
		int loopCount = 0;
		double minThreshold = data.get(0);
		double maxThreshold = data.get(MAX_LIST_LENGTH - 1);
		double middleValue = (minThreshold + (maxThreshold - minThreshold)) / 2;
//		double searchResult = data.get(middleValue);
		
		System.out.println("SEARCH TARGET = " + searchTarget);
		System.out.println();
		System.out.println("Start search?");
		scnr.nextLine();
		
		while (!(searchTarget == middleValue)) {
			// Check if searchTarget is higher than search result
			if (searchTarget > middleValue) {
				// Move lower threshold to middle
				minThreshold = middleValue;
				// Find the new middle value
				middleValue = minThreshold + (maxThreshold - minThreshold) / 2;
//				searchResult = data.get(middleValue);
				// Increment loop count
				loopCount += 1;
			}
			// Else lower than middle value
			else if (searchTarget < middleValue){
				// Move max threshold to middle
				maxThreshold = middleValue;
				// Find the new middle value
				middleValue = minThreshold + (maxThreshold - minThreshold) / 2;
//				searchResult = data.get(middleValue);
				// Increment loop count
				loopCount += 1;
			}
		}
		
		System.out.println();
		System.out.println("Found result in " + loopCount + " loops.");
		System.out.println("Search Target = " + searchTarget);
		System.out.println("Final Result = " + middleValue);
		System.out.println("Complete");
		scnr.close();
	}

}
