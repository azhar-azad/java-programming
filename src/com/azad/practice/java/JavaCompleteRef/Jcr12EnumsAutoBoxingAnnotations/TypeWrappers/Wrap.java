package com.azad.practice.java.JavaCompleteRef.Jcr12EnumsAutoBoxingAnnotations.TypeWrappers;

// Demonstrate a type wrapper.
class Wrap {

    public static void main(String[] args) {

        Integer iOb = Integer.valueOf(100);

        int i = iOb.intValue();

        System.out.println(i + " " + iOb); // displays 100 100
    }
}

/**
    100 100
 * */
