package com.azad.practice.java.lambda;

public class ConcatenateLambda {

    public static void main(String[] args) {
        ConcatenateInterface concatenateInterface = (str1, str2) -> str1 + " " + str2;
        System.out.println(concatenateInterface.stringConcat("Azhar", "Azad"));
    }
}
