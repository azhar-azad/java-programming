package com.azad.practice.javaprogramming2.practice.techgigOOP.oneTwoThree;

class First {
    public void one() {
        System.out.println("This is base class.");
    }
}

class Second extends First {
    public void two() {
        System.out.println("This inherits class FIRST.");
    }
}

class Third extends Second {
    public void three() {
        System.out.println("This inherits class SECOND.");
    }
}

public class CandidateCode {
    public static void main(String args[] ) throws Exception {

        //Write code here
        Third third = new Third();
        third.one();
        third.two();
        third.three();
    }
}
