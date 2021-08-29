package com.azad.java.learning.JavaCompleteRef.Jcr17StringHandling.StringBuffer;

// Demonstrate charAt() and setCharAt().
public class setCharAtDemo {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("buffer before = " + sb);
        System.out.println("charAt(1) before = " + sb.charAt(1));

        sb.setCharAt(1, 'i');
        sb.setLength(2);
        System.out.println("buffer after = " + sb);
        System.out.println("charAt(1) after = " + sb.charAt(1));
    }
}

/**
     buffer before = Hello
     charAt(1) before = e
     buffer after = Hi
     charAt(1) after = i
 * */
