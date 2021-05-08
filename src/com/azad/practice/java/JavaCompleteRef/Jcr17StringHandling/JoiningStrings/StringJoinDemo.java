package com.azad.practice.java.JavaCompleteRef.Jcr17StringHandling.JoiningStrings;

// Demonstrate the join() method defined by String.
public class StringJoinDemo {

    public static void main(String[] args) {

        String result = String.join(" ", "Alpha", "Beta", "Gamma");
        System.out.println(result);

        result = String.join(", ", "John", "ID#: 569", "E-mail: john@herbschildt.com");
        System.out.println(result);
    }
}

/**
     Alpha Beta Gamma
     John, ID#: 569, E-mail: john@herbschildt.com
 * */
