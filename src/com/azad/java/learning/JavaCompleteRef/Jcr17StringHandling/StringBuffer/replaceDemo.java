package com.azad.java.learning.JavaCompleteRef.Jcr17StringHandling.StringBuffer;

// Demonstrate replace()
public class replaceDemo {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("This is a test.");

        sb.replace(5, 7, "was");
        System.out.println("After replace: " + sb);
    }
}

/**
     After replace: This was a test.
 * */
