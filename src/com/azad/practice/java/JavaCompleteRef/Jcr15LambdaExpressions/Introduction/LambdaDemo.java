package com.azad.practice.java.JavaCompleteRef.Jcr15LambdaExpressions.Introduction;

// Demonstrate a simple lambda expression.

// A functional interface.
interface MyNumber {
    double getValue();
}

class LambdaDemo {

    public static void main(String[] args) {

        MyNumber myNum; // declare an interface reference

        // Here, the lambda expression is simply a constant expression.
        // When it is assigned to myNum, a class instance is
        // constructed in which the lambda expression implements
        // the getValue() method in MyNumber.
        myNum = () -> 123.45;

        // Call getValue(), which is provided by the previously assigned
        // lambda expression.
        System.out.println("A fixed value: " + myNum.getValue());

        // Here, a more complex expression is used.
        myNum = () -> Math.random() * 100;

        // These call the lambda expression in the previous line.
        System.out.println("A random valule: " + myNum.getValue());
        System.out.println("Another random valule: " + myNum.getValue());

        // A lambda expression must be compatible with the method
        // defined by the functional interface. Therefore, this won't work.
//        myNum = () -> "123.45"; // Error!
    }
}

/**
     A fixed value: 123.45
     A random valule: 43.61456072524328
     Another random valule: 52.4275511990316
 * */
