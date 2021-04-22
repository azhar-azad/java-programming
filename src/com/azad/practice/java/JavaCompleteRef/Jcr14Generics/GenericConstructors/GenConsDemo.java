package com.azad.practice.java.JavaCompleteRef.Jcr14Generics.GenericConstructors;

// Use a generic constructor.
class GenCons {
    private double val;

    <T extends Number> GenCons(T arg) {
        val = arg.doubleValue();
    }

    void showval() {
        System.out.println("val: " + val);
    }
}

class GenConsDemo {

    public static void main(String[] args) {

        GenCons test = new GenCons(100);
        GenCons test2 = new GenCons(123.5F);

        test.showval();
        test2.showval();
    }
}

/**
     val: 100.0
     val: 123.5
 * */
