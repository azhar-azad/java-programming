package com.azad.java.learning.JavaCompleteRef.Jcr07MethodsAndClasses.OverloadinMethods;

// Demonstrate method overloading.
class Overload {

    void test() {
        System.out.println("No parameters");
    }

    // Overload test for one integer parameter.
    void test(int a) {
        System.out.println("a: " + a);
    }

    // Overload test for two integer parameters.
    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    // Overload test for a double parameter
    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}

class OverloadDemo {

    public static void main(String[] args) {

        Overload ob = new Overload();
        double result;

        // call all versions of test()
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.45);
        System.out.println("Result of ob.test(123.45): " + result);
    }
}

/**
     No parameters
     a: 10
     a and b: 10 20
     double a: 123.45
     Result of ob.test(123.45): 15239.9025
 * */
