package com.azad.practice.java.JavaCompleteRef.Jcr6IntroducingClass.Constructors;

// Here, Box2 uses a parameterized constructor to
// initialize the dimensions of a box.
class Box2 {
    double width;
    double height;
    double depth;

    // This is the constructor for Box.
    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // compute volume of a box and return
    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo7 {

    public static void main(String[] args) {

        // declare, allocate, and initialize Box objects.
        Box2 mybox1 = new Box2(10, 20, 15);
        Box2 mybox2 = new Box2(3, 6, 9);

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
     Volume is 3000.0
     Volume is 162.0
 * */
