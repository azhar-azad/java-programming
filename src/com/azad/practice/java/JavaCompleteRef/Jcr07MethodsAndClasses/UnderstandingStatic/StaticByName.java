package com.azad.practice.java.JavaCompleteRef.Jcr07MethodsAndClasses.UnderstandingStatic;

class StaticDemo {
    static int a = 42;
    static int b = 99;

    static void callme() {
        System.out.println("a = " + a);
    }
}

public class StaticByName {

    public static void main(String[] args) {

        StaticDemo.callme();
        System.out.println("b = " + StaticDemo.b);
    }
}

/**
     a = 42
     b = 99
 * */
