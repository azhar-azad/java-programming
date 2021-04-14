package com.azad.practice.java.JavaCompleteRef.Jcr04Operators.Bitwise;

// Left shifting a byte value.
class ByteShift {

    public static void main(String[] args) {

        byte a = 64;
        byte b;
        int i;

        i = a << 2;
        b = (byte) (a << 2);

        System.out.println("Original value of a: " + a);
        System.out.println("i and b: " + i + " " + b);
    }
}

/**
     Original value of a: 64
     i and b: 256 0
 * */
