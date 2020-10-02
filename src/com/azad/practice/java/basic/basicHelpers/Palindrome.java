package com.azad.practice.java.basic.basicHelpers;

public class Palindrome {

    public static boolean isPalindrome(String str) {
    	
    	StringBuilder strWithoutSpaces = new StringBuilder();
    	
    	for (char ch: str.toCharArray()) {
    		
    		if (ch == 32) {
    			continue;
    		}
    		
    		strWithoutSpaces.append(ch);
    	}

        return strWithoutSpaces.toString().equalsIgnoreCase(strWithoutSpaces.reverse().toString());
    }
}
