package com.azad.java.learning.JavaCompleteRef.Jcr07MethodsAndClasses.Recursions;

// Another example that uses recursion.
class RecTest {
    int values[];

    RecTest(int i) {
        values = new int[i];
    }

    // display array -- recursively
    void printArray(int i) {
        if (i == 0)
            return;
        else
            printArray(i - 1);
        System.out.println("[" + (i - 1) + "] " + values[i - 1]);
    }
}

class Recursion2 {

    public static void main(String[] args) {

        RecTest ob = new RecTest(10);

        for (int i = 0; i < 10; i++)
            ob.values[i] = i;

        ob.printArray(ob.values.length);
    }
}

/**
     [0] 0
     [1] 1
     [2] 2
     [3] 3
     [4] 4
     [5] 5
     [6] 6
     [7] 7
     [8] 8
     [9] 9
 * */
