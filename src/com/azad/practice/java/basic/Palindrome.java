package com.azad.practice.java.basic;

public class Palindrome {

    public static boolean isPalindrome(String string) {

        return string.equals(new StringBuilder(string).reverse().toString());
    }
}
