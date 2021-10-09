package com.azad.java.learning.JavaCompleteRef.Jcr14Generics.BoundedTypes;

// Stats attempts (unsuccessfully) to
// create a generic class that can compute
// the average of any array of numbers of
// any given type.
/**
 * The class contains an error!
 * */
/**
     class Stats<T> {
         T[] nums;

         Stats(T[] o) {
            nums = o;
         }

         double average() {
             double sum = 0.0;
             for (int i = 0; i < nums.length; i++) {
                sum += nums[i].doubleValue(); // Error!
            }

            return sum / nums.length;
         }
     }
 * */

// In this version of Stats, the type argument for
// T must be either Number, or a class derived
// from Number.
class Stats<T extends Number> {
    T[] nums; // array of Number or subclass

    // Pass the constructor a reference to
    // an array of type Number or subclass.
    Stats(T[] o) {
        nums = o;
    }

    // Return type double in all cases.
    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }

        return sum / nums.length;
    }
}

// Demonstrate Stats.
class BoundsDemo {

    public static void main(String[] args) {

        Integer[] iNums = { 1, 2, 3, 4, 5 };
        Stats<Integer> iOb = new Stats<>(iNums);
        double v = iOb.average();
        System.out.println("iOb average is " + v);

        Double[] dNums = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Stats<Double> dOb = new Stats<>(dNums);
        double w = dOb.average();
        System.out.println("dOb average is " + w);

        // This won't compile because String is not a
        // subclass o Number
//        String[] strNums = { };
//        Stats<String> strOb = new Stats<String>(strNums); // Error!
    }
}

/**
     iOb average is 3.0
     dOb average is 3.3
 * */
