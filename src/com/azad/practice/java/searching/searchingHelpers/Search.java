package com.azad.practice.java.searching.searchingHelpers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.azad.practice.java.Utility;

public class Search {

	private List<Integer> collection = new ArrayList<>();
	private int key;

	public Search() {
	}

	public void init() {
		
		System.out.print("How many items: ");
		int itemCount = Utility.getIntegerInput("Error: Please enter integer");
		
		System.out.println("Enter the numbers: ");
		while (itemCount > 0) {
			int item = Utility.getIntegerInput("Not Allowed");
			collection.add(item);
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
		for (int i = 0; i < collection.size(); i++) {
			if (key == collection.get(i)) {
				index = i;
			}
		}
		
		if (index == -1) {
			System.out.println(key + " is not found");
		}
		else {
			System.out.println(key + " is found");
		}
	}
	
	public void doBinarySearch() {
		
		Collections.sort(collection);
		
		int first = 0;
		int last = collection.size() - 1;
		
		int index = binarySearch(collection, key, first, last);
		
		if (index == -1) {
			System.out.println(key + " is not found");
		}
		else {
			System.out.println(key + " is found");
		}
	}
	
	private int binarySearch(List<Integer> collection, int key, int first, int last) {
		
		int mid = (first + last) / 2;
		
		while (first <= last ) {
			
			int itemToCheck = collection.get(mid);
			
			if (itemToCheck == key) { 
				return mid;
			}
			
			else if (itemToCheck < key) 
				first = mid + 1;
			
			else 
				last = mid - 1;
			
			mid = (first + last) / 2;
		}
		
		return -1;
	}
}
