package com.azad.practice.java.JavaCompleteRef.Jcr6IntroducingClass.Constructors;

// Here, Box uses a constructor to initialize the
// dimensions of a box
class Box {
    double width;
    double height;
    double depth;

    // This is the constructor for Box.
    Box() {
        System.out.println("Constructing Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    // compute volume of a box and return
    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo6 {

    public static void main(String[] args) {

        // declare, allocate, and initialize Box objects.
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double vol;

        // get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        // get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}

/**
     Constructing Box
     Constructing Box
     Volume is 1000.0
     Volume is 1000.0
 * */
