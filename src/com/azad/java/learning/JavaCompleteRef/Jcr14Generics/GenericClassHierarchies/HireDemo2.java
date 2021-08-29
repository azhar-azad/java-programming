package com.azad.java.learning.JavaCompleteRef.Jcr14Generics.GenericClassHierarchies;

// A non-generic class can be the superclass
// of a generic subclass.

// A non-generic class.
class NonGen {
    int num;

    NonGen(int i) {
        num = i;
    }

    int getNum() {
        return num;
    }
}

// A subclass can add its own type parameters.
class Gen3<T> extends NonGen {
    T ob; // declare an object of type T

    // Pass the constructor of type T
    // an object of type T.
    Gen3(T o, int i) {
        super(i);
        ob = o;
    }

    // Return ob.
    T getOb() {
        return ob;
    }
}

class HireDemo2 {

    public static void main(String[] args) {

        // Create a Gen object for String.
        Gen3<String> w = new Gen3<>("Hello", 47);

        System.out.print(w.getOb() + " ");
        System.out.println(w.getNum());
    }
}

/**
     Hello 47
 * */
