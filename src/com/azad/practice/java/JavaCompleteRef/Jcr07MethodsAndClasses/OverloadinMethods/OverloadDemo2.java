package com.azad.practice.java.JavaCompleteRef.Jcr07MethodsAndClasses.OverloadinMethods;

// Automatic type conversions apply to overloading.
class Overload2 {

    void test() {
        System.out.println("No parameters");
    }

    // Overload test for two integer parameters.
    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    // Overload test for a double parameter
    void test(double a) {
        System.out.println("Inside test(double) a: " + a);
    }
}

class OverloadDemo2 {

    public static void main(String[] args) {

        Overload2 ob = new Overload2();
        int i = 88;

        ob.test();
        ob.test(10, 20);

        ob.test(i); // this will invoke test(double)
        ob.test(123.2); // this will invoke test(double)
    }
}

/**
     No parameters
     a and b: 10 20
     Inside test(double) a: 88.0
     Inside test(double) a: 123.2
 * */
