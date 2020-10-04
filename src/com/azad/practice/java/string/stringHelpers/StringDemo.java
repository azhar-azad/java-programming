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
    private int[] strCharFrequency;
    private char[] strCharDuplicates;
    private String[] strWordArray;
    private int[] strWordFrequency;
    private String[] strWordDuplicates;

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
    
    public void setStrCharFrequency() {
    	
    	for (int i = 0; i < strCharFrequency.length; i++)
    		strCharFrequency[i] = -1;
    	
    	for (int i = 0; i < strCharFrequency.length; i++) {
    		if (str.charAt(i) == ' ') {
				continue;
			}
    		
    		int freq = 1;
    		if (strCharFrequency[i] == 0) {
				freq = 0;
				continue;
			}
    		
    		for (int j = i + 1; j < str.length(); j++) {
    			
    			if (str.charAt(i) == str.charAt(j)) {
    				freq++;
    				strCharFrequency[j] = 0;
    			}
    		}
    		strCharFrequency[i] = freq;
    	}
    	
//    	for (int i = 0; i < strFrequency.length; i++) {
//    		if (strFrequency[i] <= 0) {
//    			continue;
//    		}
//    		System.out.print(str.charAt(i) + ": " + strFrequency[i] + "\n");
//    	}
    }
    
    public void setStrCharDuplicates() {
    	
    	List<Character> duplicates = new ArrayList<>();
    	
    	for (int i = 0; i < strCharFrequency.length; i++) {
    		if (strCharFrequency[i] > 1) {
    			duplicates.add(str.charAt(i));
    		}
    	}
    	
    	strCharDuplicates = new char[duplicates.size()];
    	
    	for (int i = 0; i < duplicates.size(); i++) {
    		strCharDuplicates[i] = duplicates.get(i);
    	}
    }
    
    public void setStrWordArray() {
    	
    	StringBuilder strToBuild = new StringBuilder();
    	for (int i = 0, j = 0; i < str.length(); i++) {
    		char charToAdd = str.charAt(i);
    		if (charToAdd == ' ') {
				strWordArray[j] = strToBuild.toString();
				j++;
				strToBuild = new StringBuilder();
				continue;
			}
    		strToBuild.append(charToAdd);
    	}
    	
    	if (str.charAt(str.length() - 1) != ' ') 
    		strWordArray[strWordArray.length - 1] = strToBuild.toString();
    }
    
    public void setStrWordFrequency() {
    	
    	for (int i = 0; i < strWordFrequency.length; i++)
    		strWordFrequency[i] = -1;
    	
    	for (int i = 0; i < strWordFrequency.length; i++) {
    		
    		int freq = 1;
    		if (strWordFrequency[i] == 0) {
				freq = 0;
				continue;
			}
    		
    		for (int j = i + 1; j < strWordArray.length; j++) {
    			
    			if (strWordArray[i].equalsIgnoreCase(strWordArray[j])) {
    				freq++;
    				strWordFrequency[j] = 0;
    			}
    		}
    		strWordFrequency[i] = freq;
    	}
    	
//    	for (int i = 0; i < strWordFrequency.length; i++) {
//    		if (strWordFrequency[i] <= 0) {
//    			continue;
//    		}
//    		System.out.print(wordArray[i] + ": " + strWordFrequency[i] + "\n");
//    	}
    }
    
    public void setStrWordDuplicates() {
    	
    	List<String> duplicates = new ArrayList<>();
    	
    	for (int i = 0; i < strWordFrequency.length; i++) {
    		if (strWordFrequency[i] > 1) {
    			duplicates.add(strWordArray[i]);
    		}
    	}
    	
    	strWordDuplicates = new String[duplicates.size()];
    	
    	for (int i = 0; i < duplicates.size(); i++) {
    		strWordDuplicates[i] = duplicates.get(i);
    	}
    }
    
    public String[] getWordArray() {
    	
    	return strWordArray;
    }

    // ----

    public void init() {
        System.out.print("Enter a string: ");
        str = Utility.getStringInput();
        strCharFrequency = new int[getStrLength()];
        strWordFrequency = new int[getWordCount()];
        strWordArray = new String[getWordCount()];
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

        for (char ch: str.toCharArray())
            vowelsCount += isVowel(ch) ? 1 : 0;

        return vowelsCount;
    }

    public int getConsonantCount() {

        int constantsCount = 0;

        for (char ch: str.toCharArray())
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
    		
    		if (ch == ' ') {
    			continue;
    		}
    		
    		strWithoutSpaces.append(ch);
    	}
    	
    	return strWithoutSpaces.toString();
    }
    
    public String getToggleCases() {
    	
    	StringBuilder toggleStr = new StringBuilder();
    	
    	for (char ch: str.toCharArray()) {
    		if (isSpecialCharacter(ch) || isNumber(ch) || isSpace(ch)) {
    			toggleStr.append(ch);
    		}
    		else {
    			toggleStr.append(Character.isLowerCase(ch) ? Character.toUpperCase(ch) : Character.toLowerCase(ch));
    		}
    	}
    	
    	return toggleStr.toString();
    }
    
    public String getSpaceReplaced(char charToReplace) {
    	
    	StringBuilder replacedStr = new StringBuilder();
    	
    	for (char ch: str.toCharArray()) {
    		
    		if (ch == ' ') {
    			replacedStr.append(charToReplace);
    			continue;
    		}
    		
    		replacedStr.append(ch);
    	}
    	
    	return replacedStr.toString();
    }
    
    public boolean isPalindrome() {
    	return Palindrome.isPalindrome(str);
    }
    
    public boolean isRotation() {
    	return (str + str).contains(str2);
    }
    
    public void getMaxFreqCharacter() {
    	
    	List<String> maxFreqChars = new ArrayList<>();
    	char maxFreqChar;
    	int maxFreq = -9;
    	
    	for (int i = 0; i < strCharFrequency.length; i++) {
    		if (strCharFrequency[i] < maxFreq) {
				continue;
			}
    		else if (strCharFrequency[i] > maxFreq) {
    			maxFreq = strCharFrequency[i];
    			maxFreqChar = str.charAt(i);
    			maxFreqChars.clear();
    			maxFreqChars.add(maxFreqChar + " ");
    		}
    		else {
    			maxFreqChar = str.charAt(i);
    			maxFreqChars.add(maxFreqChar + " ");
    		}
    	}
    	
    	printSubstrings(maxFreqChars);
    }
    
    public void getMinFreqCharacter() {
    	
    	List<String> minFreqChars = new ArrayList<>();
    	char minFreqChar;
    	int minFreq = 100;
    	
    	for (int i = 0; i < strCharFrequency.length; i++) {
    		
    		if (strCharFrequency[i] > minFreq || strCharFrequency[i] <= 0) {
				continue;
			}
    		else if (strCharFrequency[i] < minFreq) {
    			minFreq = strCharFrequency[i];
    			minFreqChar = str.charAt(i);
    			minFreqChars.clear();
    			minFreqChars.add(minFreqChar + " ");
    		}
    		else {
    			minFreqChar = str.charAt(i);
    			minFreqChars.add(minFreqChar + " ");
    		}
    	}
    	
    	printSubstrings(minFreqChars);
    }
    
    public String reverseStr() {
    	
    	return new StringBuilder(str).reverse().toString();
    }
    
    public void printDuplicateChars() {
    	
    	for (char ch: strCharDuplicates) {
    		System.out.print(ch + " ");
    	}
    }
    
    public void printDuplicateWords() {
    	
    	for (String str: strWordDuplicates) {
    		System.out.print(str + " ");
    	}
    }

    // ------
    
    private int getCountOf(char ch) {
    	int charCount = 0;
    	for (char c: str.toCharArray()) 
    		if (c == ch) 
    			charCount++;
    	return charCount;
    }
    
    private int getWordCount() {
    	
    	return getCountOf(' ') + 1;
    }
    
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
        return ch >= '0' && ch <= '9';
    }

    private boolean isVowel(char ch) {
    	ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    private boolean isConsonant(char ch) {
    	ch = Character.toLowerCase(ch);
        return !isVowel(ch) && (ch >= 'a' && ch <= 'z');
    }

    private boolean isSpace(char ch) {
        return ch == ' ';
    }

    private boolean isSpecialCharacter(char ch) {
        return !(isSpace(ch) || isNumber(ch) || isVowel(ch) || isConsonant(ch));
    }
}
