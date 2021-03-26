package com.azad.practice.java.lambda;

public class ConcatenateTraditional implements ConcatenateInterface {
    @Override
    public String stringConcat(String str1, String str2) {
        return str1 + " " + str2;
    }

    public static void main(String[] args) {
        ConcatenateTraditional concatenateTraditional = new ConcatenateTraditional();
        System.out.println(concatenateTraditional.stringConcat("Azhar", "Azad"));
    }
}
