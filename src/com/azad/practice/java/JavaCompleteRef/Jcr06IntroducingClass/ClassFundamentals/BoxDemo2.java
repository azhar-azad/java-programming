package com.azad.practice.java.JavaCompleteRef.Jcr06IntroducingClass.ClassFundamentals;

// This program declares two Box objects.
class Box2 {
    double width;
    double height;
    double depth;
}

class BoxDemo2 {

    public static void main(String[] args) {

        Box2 mybox1 = new Box2();
        Box2 mybox2 = new Box2();
        double vol;

        // assign values to mybox1's instance variables
        mybox1.width = 10;
        mybox1.height = 10;
        mybox1.depth = 10;

        // assign different values to mybox2's instance variables
        mybox2.width = 3;
        mybox2.height = 4;
        mybox2.depth = 6;

        // compute volume of first box
        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Volume is " + vol);

        // compute volume of second box
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Volume is " + vol);
    }
}

/**
     Volume is 1000.0
     Volume is 72.0
 * */
