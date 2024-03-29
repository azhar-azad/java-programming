package com.azad.java.learning.JavaCompleteRef.Jcr12EnumsAutoBoxingAnnotations.Enumerations;

// Use an enum constructor, instance variable and method.
enum Apple2 {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

    private int price; // price of each apple

    // Constructor
    Apple2(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }
}

class EnumDemo3 {

    public static void main(String[] args) {

        Apple2 ap;

        // Display price of Winesap.
        System.out.println("Winesap costs " + Apple2.Winesap.getPrice() + " cents.\n");

        // Display all apples and prices.
        System.out.println("All apple prices:");
        for (Apple2 a: Apple2.values())
            System.out.println(a + " costs " + a.getPrice() + " cents.");
    }
}

/**
     Winesap costs 15 cents.

     All apple prices:
     Jonathan costs 10 cents.
     GoldenDel costs 9 cents.
     RedDel costs 12 cents.
     Winesap costs 15 cents.
     Cortland costs 8 cents.
 * */
