package com.azad.practice.java.JavaCompleteRef.Jcr7MethodsAndClasses.OverloadinMethods;

// Here, Box defines three constructors to initialize
// the dimensions of a box various ways.
class Box {
    double width;
    double height;
    double depth;

    // constructor used when all dimensions specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // constructor used when no dimensions specified
    Box() {
        width = -1; // use -1 to indicate
        height = -1; // an uninitialized
        depth = -1; // box
    }

    // constructor used when cube is created
    Box(double len) {
        width = height = depth = len;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}

class OverloadedConstructor {

    public static void main(String[] args) {

        // create boxes using the various constructors
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mybox3 = new Box(7);

        double vol;

        // get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);

        // get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);

        // get volume of cube
        vol = mybox3.volume();
        System.out.println("Volume of cube is " + vol);
    }
}

/**
     Volume of mybox1 is 3000.0
     Volume of mybox2 is -1.0
     Volume of cube is 343.0
 * */
