package com.azad.practice.java.Basic.basicHelpers;

public class Palindrome {

    public static boolean isPalindrome(String str) {
    	
    	String strWithoutSpaces = removeWhiteSpaces(str);

        return strWithoutSpaces.equalsIgnoreCase(new StringBuilder(strWithoutSpaces).reverse().toString());
    }
    
    private static String removeWhiteSpaces(String str) {
    	
    	StringBuilder strWithoutSpaces = new StringBuilder();
    	
    	for (char ch: str.toCharArray()) {
    		
    		if (ch == 32) {
    			continue;
    		}
    		
    		strWithoutSpaces.append(ch);
    	}
    	
    	return strWithoutSpaces.toString();
    }
}
