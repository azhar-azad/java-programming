package com.azad.practice.java.searching.searchingHelpers;

import java.util.ArrayList;
import java.util.List;

import com.azad.practice.java.Utility;

public class Search {

	private List<Integer> integerCollection = new ArrayList<>();
	private int key;

	public Search() {
	}
	
	public List<Integer> getIntegerCollection() {
		return integerCollection;
	}
	
	public int getKey() {
		return key;
	}

	public void init() {
		
		System.out.print("How many items: ");
		int itemCount = Utility.getIntegerInput("Error: Please enter integer");
		
		System.out.println("Enter the numbers: ");
		while (itemCount > 0) {
			int item = Utility.getIntegerInput("Not Allowed");
			integerCollection.add(item);
			--itemCount;
		}
		
		System.out.print("Enter the key to search: ");
		key = Utility.getIntegerInput("Not Allowed (Enter Integer)");
	}
	
	public void doLinearSearch() {
		
		/*
		 * Using Collection Methods
		 */
//		if (integerCollection.contains(key)) {
//			System.out.println("Found at position " + integerCollection.indexOf(key));
//			return;
//		}
//		
//		System.out.println("Not Found"); 
		/*
		 * END Using Collection Methods 
		 */
		
		int index = -1;
		for (int i = 0; i < getSize(); i++) {
			if (key == integerCollection.get(i)) {
				index = i;
			}
		}
		
		if (index == -1) {
			System.out.println(key + " is not found");
		}
		else {
			System.out.println(key + " is found at position " + (index + 1));
		}
		
	}
	
	// --
	
	private int getSize() {
		return integerCollection.size();
	}
}
