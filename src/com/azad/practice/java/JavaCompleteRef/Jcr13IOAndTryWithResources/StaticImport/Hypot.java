package com.azad.practice.java.JavaCompleteRef.Jcr13IOAndTryWithResources.StaticImport;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

// Use static import to bring sqrt() and pow() into view.
// Compute the hypotenuse of a right triangle.
class Hypot {

    public static void main(String[] args) {

        double side1, side2;
        double hypot;

        side1 = 3.0;
        side2 = 4.0;

        // Here, sqrt() and pow() can be called by themselves,
        // without their class name.
        hypot = sqrt(pow(side1, 2) + pow(side2, 2));

        System.out.println("Given sides of lengths " +
                            side1 + " and " + side2 +
                            " the hypotenuse is " + hypot);
    }
}

/**
     Given sides of lengths 3.0 and 4.0 the hypotenuse is 5.0
 * */
