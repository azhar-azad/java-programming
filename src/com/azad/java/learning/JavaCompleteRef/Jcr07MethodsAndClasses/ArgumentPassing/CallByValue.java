package com.azad.java.learning.JavaCompleteRef.Jcr07MethodsAndClasses.ArgumentPassing;

// Primitive types are passed by value.
class Test {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
}

class CallByValue {

    public static void main(String[] args) {

        Test ob = new Test();

        int a = 15, b = 20;

        System.out.println("a and b before call: " + a + " " + b);

        ob.meth(a, b);

        System.out.println("a and b after call: " + a + " " + b);
    }
}

/**
     a and b before call: 15 20
     a and b after call: 15 20
 * */
