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
}
