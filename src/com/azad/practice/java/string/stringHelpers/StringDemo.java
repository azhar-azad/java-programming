package com.azad.practice.java.string.stringHelpers;

import com.azad.practice.java.Utility;

public class StringDemo {

    private String str;

    public StringDemo() {
        str = new String();
    }

    public StringDemo(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    // ----

    public void init() {
        System.out.print("Enter a string: ");

        str = Utility.getStringInput();
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

    public int getVowelsCount() {

        int vowelsCount = 0;

        for (char ch: str.toLowerCase().toCharArray())
            vowelsCount += isVowel(ch) ? 1 : 0;

        return vowelsCount;
    }

    public int getConstantsCount() {

        int constantsCount = 0;

        for (char ch: str.toLowerCase().toCharArray())
            constantsCount += isConstant(ch) ? 1 : 0;

        return constantsCount;
    }

    private boolean isNumber(char ch) {
        return ch >= 48 && ch <= 57;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    private boolean isConstant(char ch) {
        return !isVowel(ch) && (ch >= 'a' && ch <= 'z');
    }

    private boolean isSpace(char ch) {
        return ch == 32;
    }

    private boolean isSpecialCharacter(char ch) {
        return !(isSpace(ch) || isNumber(ch) || isVowel(ch) || isConstant(ch));
    }
}
