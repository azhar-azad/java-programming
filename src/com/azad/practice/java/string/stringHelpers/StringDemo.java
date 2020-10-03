package com.azad.practice.java.string.stringHelpers;

import com.azad.practice.java.Utility;
import com.azad.practice.java.basic.basicHelpers.Factorial;
import com.azad.practice.java.basic.basicHelpers.Palindrome;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringDemo {

    private String str;
    private String str2;

    public StringDemo() {
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }

    // ----

    public void init() {
        System.out.print("Enter a string: ");
        str = Utility.getStringInput();
    }

    public void init2() {
        init();
        System.out.print("Enter another string: ");
        str2 = Utility.getStringInput();
    }

    public int getStrLength() {
        return str.length();
    }

    public int getSpecialCharacterCount() {

        int spCharCount = 0;

        for (char ch: str.toCharArray())
            spCharCount += isSpecialCharacter(ch) ? 1 : 0;

        return spCharCount;
    }

    public int getVowelCount() {

        int vowelsCount = 0;

        for (char ch: str.toLowerCase().toCharArray())
            vowelsCount += isVowel(ch) ? 1 : 0;

        return vowelsCount;
    }

    public int getConsonantCount() {

        int constantsCount = 0;

        for (char ch: str.toLowerCase().toCharArray())
            constantsCount += isConsonant(ch) ? 1 : 0;

        return constantsCount;
    }

    public boolean isAnagram() {

        return str.length() == str2.length() && sort(str.toLowerCase()).equals(sort(str2.toLowerCase()));
    }

    public void divideStrEqual(int noOfPart) {
    	
    	String[] strParts = new String[noOfPart];

        if (getStrLength() % noOfPart != 0) {
            System.out.println("Equal division not possible");
            return;
        }
        
        int eachPartLength = str.length() / noOfPart;
        for (int i = 0, j = 0; i < str.length(); i+= eachPartLength, j++) {
        	
        	strParts[j] = str.substring(i, i + eachPartLength);
        }
        
        System.out.print("String parts are: ");
        for (String strPart: strParts) {
        	System.out.print("\'" + strPart + "\' ");
        }
    }
    
    public List<String> getSubsets() {
    	
    	List<String> strSubsets = new ArrayList<>();
    	
    	for (int i = 0; i < getStrLength(); i++) {
    		for (int j = i + 1; j <= getStrLength(); j++) {
				strSubsets.add(str.substring(i, j));
			}
    	}
    	
    	return strSubsets;
    }
    
    public void printSubsets() {
    	System.out.println("All subsets of " + str + " is: ");
    	printSubstrings(getSubsets());
    }
    
    public String getStrWithoutSpaces() {
    	
    	StringBuilder strWithoutSpaces = new StringBuilder();
    	
    	for (char ch: str.toCharArray()) {
    		
    		if (ch == 32) {
    			continue;
    		}
    		
    		strWithoutSpaces.append(ch);
    	}
    	
    	return strWithoutSpaces.toString();
    }
    
    public boolean isPalindrome() {
    	return Palindrome.isPalindrome(str);
    }

    // ------

//    private void printSubstrings(String[] strArr) {
//        for (String str: strArr)
//            System.out.print(str + " ");
//    }
    
    private void printSubstrings(List<String> strList) {
    	for (String str: strList)
            System.out.print(str + "  ");
    }

    private String sort(String str) {
        List<Character> charStr = new ArrayList<>();

        for (char ch: str.toCharArray())
            charStr.add(ch);

        Collections.sort(charStr);

        return charStr.toString();
    }

    private boolean isNumber(char ch) {
        return ch >= 48 && ch <= 57;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    private boolean isConsonant(char ch) {
        return !isVowel(ch) && (ch >= 'a' && ch <= 'z');
    }

    private boolean isSpace(char ch) {
        return ch == 32;
    }

    private boolean isSpecialCharacter(char ch) {
        return !(isSpace(ch) || isNumber(ch) || isVowel(ch) || isConsonant(ch));
    }
}
