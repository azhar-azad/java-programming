package com.azad.practice.java.string;

import com.azad.practice.java.string.stringHelpers.StringDemo;

public class MainString {

    public static void main(String[] args) {

        StringDemo stringDemo = new StringDemo();

        /*
        STRING N:
         */

        /*
        END STRING N
         */

        /*
        STRING 1: Count the total number of characters in a string
         */
        stringDemo.init();

        System.out.println("The length of \'" + stringDemo.getStr() + "\' is " + stringDemo.getStrLength());
        /*
        END STRING 1
         */
    }
}
