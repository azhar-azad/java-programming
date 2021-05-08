package com.azad.practice.java.JavaCompleteRef.Jcr17StringHandling.StringBuffer;

// StringBuffer length vs. capacity.
public class StringBufferDemo {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        System.out.println("buffer = " + sb);
        System.out.println("length = " + sb.length());
        System.out.println("capacity = " + sb.capacity());
    }
}

/**
     buffer = Hello
     length = 5
     capacity = 21
 * */
