package com.azad.java.learning.JavaCompleteRef.Jcr10ExceptionHandling.AdditionalExceptionFeatures;

// Demonstrate the multi-catch feature
class MultiCatch {

    public static void main(String[] args) {

        int a = 10, b = 0;
        int[] vals = { 1, 2, 3 };

        try {
            int result = a / b; // generate an ArithmeticException

             vals[10] = 19; // generate an ArrayIndexOutOfBoundsException

            // This catch clause catches both exceptions.
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }

        System.out.println("After multi-catch");
    }
}

/**
     Exception caught: java.lang.ArithmeticException: / by zero
     After multi-catch

     Exception caught: java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3
     After multi-catch
 * */
