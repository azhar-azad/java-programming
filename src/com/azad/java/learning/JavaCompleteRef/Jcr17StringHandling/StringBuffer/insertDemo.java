package com.azad.java.learning.JavaCompleteRef.Jcr17StringHandling.StringBuffer;

// Demonstrate insert().
public class insertDemo {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("I Java!");

        sb.insert(2, "like ");
        System.out.println(sb);
    }
}

/**
    I like Java!
 * */
