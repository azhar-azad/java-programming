package com.azad.java.learning.Searching;

import com.azad.java.learning.Searching.searchingHelpers.Search;

public class MainSearching {

	public static void main(String[] args) {

		Search search = new Search();
		
		/*
		SEARCH 1: Linear Search
		 */
		System.out.println("\n\nLinear Search Demo\n============================\n");

		search.init();

		search.doLinearSearch();
		/*
		END SEARCH 1
		 */

		
		/*
		SEARCH 2: Binary Search 
		 */
		System.out.println("\n\nBinary Search Demo\n============================\n");
		
		search.init();
		
		search.doBinarySearch();
		/*
		END SEARCH 2
		 */
	}

}
