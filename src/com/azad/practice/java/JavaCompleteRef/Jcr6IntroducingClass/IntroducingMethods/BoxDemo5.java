package com.azad.practice.java.JavaCompleteRef.Jcr6IntroducingClass.IntroducingMethods;

// This program uses a parameterized method
class Box3 {
    double width;
    double height;
    double depth;

    // compute volume of a box and return
    double volume() {
        return width * height * depth;
    }

    // sets dimensions of box
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

public class BoxDemo5 {

    public static void main(String[] args) {

        Box3 mybox1 = new Box3();
        Box3 mybox2 = new Box3();
        double vol;

        // initialize each box
        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);

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
