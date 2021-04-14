package com.azad.practice.java.JavaCompleteRef.Jcr10ExceptionHandling.Throw;

// Demonstrate throw.
class ThrowDemo {

    static void demoproc() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Caught inside demoproc.");
            throw e; // rethrow the exception
        }
    }

    public static void main(String[] args) {

        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Recaught: " + e);
        }
    }
}

/**
     Caught inside demoproc.
     Recaught: java.lang.NullPointerException: demo
 * */
