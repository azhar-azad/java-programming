package com.azad.java.learning.JavaCompleteRef.Jcr14Generics.GenericClassHierarchies;

// Overriding a generic method in a generic class.
class Gen6<T> {
    T ob; // declare an object of type T

    // Pass the constructor a reference to
    // an object of type T.
    Gen6(T o) {
        ob = o;
    }

    // Return ob.
    T getOb() {
        System.out.print("Gen6's getOb(): ");
        return ob;
    }
}

// A subclass of Gen6 that overrides getOb().
class Gen7<T> extends Gen6<T> {
    Gen7(T o) {
        super(o);
    }

    // Override getOb().
    T getOb() {
        System.out.print("Gen7's getOb(): ");
        return ob;
    }
}

// Demonstrate generic method override.
class OverrideDemo {

    public static void main(String[] args) {

        // Create a Gen6 object for Integers
        Gen6<Integer> iOb = new Gen6<>(88);

        // Create a Gen7 object for Integers.
        Gen7<Integer> iOb2 = new Gen7<>(99);

        // Create a Gen7 object for Strings.
        Gen7<String> strOb = new Gen7<>("Generics Test");

        System.out.println(iOb.getOb());
        System.out.println(iOb2.getOb());
        System.out.println(strOb.getOb());
    }
}

/**
     Gen6's getOb(): 88
     Gen7's getOb(): 99
     Gen7's getOb(): Generics Test
 * */
