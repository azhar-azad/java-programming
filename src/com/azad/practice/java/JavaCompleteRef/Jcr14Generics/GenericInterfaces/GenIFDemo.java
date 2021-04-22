package com.azad.practice.java.JavaCompleteRef.Jcr14Generics.GenericInterfaces;

// A generic interface example.

// A Min/Max interface.
interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}

// Now, implement MinMax
class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] vals;

    MyClass(T[] o) {
        vals = o;
    }

    // Return the minimum value in vals.
    public T min() {
        T min = vals[0];

        for (T item: vals)
            if (item.compareTo(min) < 0)
                min = item;

        return min;
    }

    // Return the maximum value in vals.
    public T max() {
        T max = vals[0];

        for (T item: vals)
            if (item.compareTo(max) > 0)
                max = item;

        return max;
    }
}

class GenIFDemo {

    public static void main(String[] args) {

        Integer[] iNums = { 3, 6, 2, 8, 6 };
        Character[] chs = { 'b', 'r', 'p', 'w' };

        MyClass<Integer> iOb = new MyClass<>(iNums);
        MyClass<Character> cOb = new MyClass<>(chs);

        System.out.println("Max value in iNums: " + iOb.max());
        System.out.println("Min value in iNums: " + iOb.min());

        System.out.println("Max value in chs: " + cOb.max());
        System.out.println("Min value in chs: " + cOb.min());
    }
}

/**
     Max value in iNums: 8
     Min value in iNums: 2
     Max value in chs: w
     Min value in chs: b
 * */
