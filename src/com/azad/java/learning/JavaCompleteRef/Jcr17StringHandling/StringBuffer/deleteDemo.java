package com.azad.java.learning.JavaCompleteRef.Jcr17StringHandling.StringBuffer;

// Demonstrate delete() and deleteCharAt().
public class deleteDemo {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("This is a test.");

        sb.delete(4, 7);
        System.out.println("After delete: " + sb);

        sb.deleteCharAt(0);
        System.out.println("After deleteCharAt: " + sb);
    }
}

/**
     After delete: This a test.
     After deleteCharAt: his a test.
 * */
