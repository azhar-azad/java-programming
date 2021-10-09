package com.azad.java.learning.JavaCompleteRef.Jcr08Inheritance.MultilevelHierarchy;

// Extend BoxWeight to include shipping costs.
// Start with Box.
class Box {
    private double width;
    private double height;
    private double depth;

    // construct clone of an object
    Box(Box ob) { // pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // constructor used when all dimensions specified
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // constructor used when no dimensions specified
    public Box() {
        width = -1; // use -1 to indicate
        height = -1; // an uninitialized
        depth = -1; // box
    }

    // constructor used when cube is created
    public Box(double len) {
        width = height = depth = len;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}

// Add weight.
class BoxWeight extends Box {
    double weight; // weight of box

    // construct clone of an object
    BoxWeight(BoxWeight ob) { // pass object to constructor
        super(ob); // call superclass constructor
        weight = ob.weight;
    }

    // constructor when all parameters are specified
    public BoxWeight(double width, double height, double depth, double weight) {
        super(width, height, depth); // call superclass constructor
        this.weight = weight;
    }

    // default constructor
    BoxWeight() {
        super();
        weight = -1;
    }

    // constructor used when cube is created
    BoxWeight(double len, double weight) {
        super(len);
        this.weight = weight;
    }
}

// Add shipping consts.
class Shipment extends BoxWeight {
    double cost;

    // construct clone of an object
    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    // constructor when all parameters are specified
    Shipment(double width, double height, double depth, double weight, double cost) {
        super(width, height, depth, weight); // call superclass constructor
        this.cost = cost;
    }

    // default constructor
    Shipment() {
        super();
        cost = -1;
    }

    // constructor used when cube is created
    public Shipment(double len, double weight, double cost) {
        super(len, weight);
        this.cost = cost;
    }
}

public class DemoShipment {

    public static void main(String[] args) {

        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;

        vol = shipment1.volume();
        System.out.println("Volume of shipment1 is " + vol);
        System.out.println("Weight of shipment1 is " + shipment1.weight);
        System.out.println("Shipping cost: $" + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Volume of shipment2 is " + vol);
        System.out.println("Weight of shipment2 is " + shipment2.weight);
        System.out.println("Shipping cost: $" + shipment2.cost);
    }
}

/**
     Volume of shipment1 is 3000.0
     Weight of shipment1 is 10.0
     Shipping cost: $3.41

     Volume of shipment2 is 24.0
     Weight of shipment2 is 0.76
     Shipping cost: $1.28
 * */
