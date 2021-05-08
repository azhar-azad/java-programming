package com.azad.practice.java.JavaCompleteRef.Jcr17StringHandling.StringConversionAndtoString;

// Override toString() for Box class.
class Box {
    double width;
    double height;
    double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public String toString() {
        return "Dimensions are " + width + " by " + depth + " by " + height + ".";
    }
}

public class toStringDemo {

    public static void main(String[] args) {

        Box b = new Box(10, 12, 14);
        String s = "Box b: " + b; // concatenate Box object

        System.out.println(b); // convert Box to string
        System.out.println(s);
    }
}

/**
     Dimensions are 10.0 by 14.0 by 12.0.
     Box b: Dimensions are 10.0 by 14.0 by 12.0.
 * */
