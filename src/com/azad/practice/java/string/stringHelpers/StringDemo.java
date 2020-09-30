package com.azad.practice.java.string.stringHelpers;

import com.azad.practice.java.Utility;

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

        return sort(str.toLowerCase()).equals(sort(str2.toLowerCase()));
    }

    // ------

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
