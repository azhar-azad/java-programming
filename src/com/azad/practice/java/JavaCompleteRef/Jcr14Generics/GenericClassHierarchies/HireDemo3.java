package com.azad.practice.java.JavaCompleteRef.Jcr14Generics.GenericClassHierarchies;

// Use the instanceof operator with a generic class hierarchy.
class Gen4<T> {
    T ob;

    Gen4(T o) {
        ob = o;
    }

    // Return ob.
    T getOb() {
        return ob;
    }
}

// A subclass of Gen4.
class Gen5<T> extends Gen4<T> {
    Gen5(T o) {
        super(o);
    }
}

// Demonstrate run-time type ID implications of generic
// class hierarchy.
class HireDemo3 {

    public static void main(String[] args) {

        // Create a Gen4 object for Integers.
        Gen4<Integer> iOb = new Gen4<>(88);

        // Create a Gen5 object for Integers.
        Gen5<Integer> iOb2 = new Gen5<>(99);

        // Create a Gen5 object for Strings.
        Gen5<String> strOb2 = new Gen5<>("Generics Test");

        // See if iOb2 is some form of Gen5.
        if (iOb2 instanceof Gen5<?>)
            System.out.println("iOb2 is instance of Gen5");

        // See if iOb2 is some form of Gen4.
        if (iOb2 instanceof Gen4<?>)
            System.out.println("iOb2 is instance of Gen4");

        System.out.println();

        // See if strOb2 is a Gen5.
        if (strOb2 instanceof Gen5<?>)
            System.out.println("strOb2 is instance of Gen5");

        // See if strOb2 is a Gen4.
        if (strOb2 instanceof Gen4<?>)
            System.out.println("strOb2 is instance of Gen4");

        System.out.println();

        // See if iOb is an instance of Gen5, which it is not.
        if (iOb instanceof Gen5<?>)
            System.out.println("iOb is instance of Gen5");

        // See if iOb is an instance of Gen4, which it is.
        if (iOb instanceof Gen4<?>)
            System.out.println("iOb is instance of Gen4");

        // The following can't be compiled because
        // generic type info does not exist at run time.
//        if (iOb2 instanceof Gen5<Integer>)
//            System.out.println("iOb2 is instance of Gen5<Integer>");
    }
}

/**
     iOb2 is instance of Gen5
     iOb2 is instance of Gen4

     strOb2 is instance of Gen5
     strOb2 is instance of Gen4

     iOb is instance of Gen4
 * */
