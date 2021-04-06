package com.azad.practice.java.JavaCompleteRef.Jcr6IntroducingClass.IntroducingMethods;

// Now, volume() returns the volume of a box.
class Box2 {
    double width;
    double height;
    double depth;

    // compute volume of a box and return
    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo4 {

    public static void main(String[] args) {

        Box2 mybox1 = new Box2();
        Box2 mybox2 = new Box2();
        double vol;

        // assign values to mybox1's instance variables
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        // assign values to mybox2's instance variables
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        // get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}

/**
     Volume is 3000.0
     Volume is 162.0
 * */
