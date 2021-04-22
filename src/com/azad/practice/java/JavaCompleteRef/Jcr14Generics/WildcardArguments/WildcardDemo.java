package com.azad.practice.java.JavaCompleteRef.Jcr14Generics.WildcardArguments;

// Use a wildcard.
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

    // Determine if two averages are the same.
    // Notice the use of the wildcard.
    boolean sameAvg(Stats<?> ob) {
        if (average() == ob.average())
            return true;
        return false;
    }
}

// Demonstrate wildcard.
class WildcardDemo {

    public static void main(String[] args) {

        Integer[] iNums = { 1, 2, 3, 4, 5 };
        Stats<Integer> iOb = new Stats<>(iNums);
        double v = iOb.average();
        System.out.println("iOb average is " + v);

        Double[] dNums = { 1.1, 2.2, 3.3, 4.4, 5.4 };
        Stats<Double> dOb = new Stats<>(dNums);
        double w = dOb.average();
        System.out.println("dOb average is " + w);

        Float[] fNums = { 1.0F, 2.0F, 3.0F, 4.0F, 5.0F };
        Stats<Float> fOb = new Stats<>(fNums);
        double x = fOb.average();
        System.out.println("dOb average is " + x);

        // See which arrays have same average.
        System.out.print("Averages of iOb and dOb ");
        if (iOb.sameAvg(dOb))
            System.out.println("are the same.");
        else
            System.out.println("differ.");

        System.out.print("Averages of iOb and fOb ");
        if (iOb.sameAvg(fOb))
            System.out.println("are the same.");
        else
            System.out.println("differ.");
    }
}

/**
     iOb average is 3.0
     dOb average is 3.28
     dOb average is 3.0
     Averages of iOb and dOb differ.
     Averages of iOb and fOb are the same.
 * */
