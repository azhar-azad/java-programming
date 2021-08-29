package com.azad.java.learning.JavaCompleteRef.Jcr17StringHandling.ModifyingAString;

// Substring replacement.
public class StringReplace {

    public static void main(String[] args) {

        String org = "This is a test. This is, too.";
        String search = "is";
        String sub = "was";
        String result = "";
        int i;

        do {
            // replace all matching substrings
            System.out.println(org);
            i = org.indexOf(search);
            if (i != -1) {
                result = org.substring(0, i);
                result += sub;
                result += org.substring(i + search.length());
                org = result;
            }
        } while (i != -1);
    }
}

/**
     This is a test. This is, too.
     Thwas is a test. This is, too.
     Thwas was a test. This is, too.
     Thwas was a test. Thwas is, too.
     Thwas was a test. Thwas was, too.
 * */
