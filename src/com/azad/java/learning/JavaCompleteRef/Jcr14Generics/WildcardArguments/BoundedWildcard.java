package com.azad.java.learning.JavaCompleteRef.Jcr14Generics.WildcardArguments;

// Bounded Wildcard arguments.
// Two-dimensional coordinates.
class TwoD {
    int x, y;

    TwoD(int a, int b) {
        x = a;
        y = b;
    }
}

// Three-dimensional coordinates.
class ThreeD extends TwoD {
    int z;

    ThreeD(int a, int b, int c) {
        super(a, b);
        z = c;
    }
}

// Four-dimensional coordinates
class FourD extends ThreeD {
    int t;

    FourD(int a, int b, int c, int d) {
        super(a, b, c);
        t = d;
    }
}

// This class holds an array of coordinate objects.
class Coords<T extends TwoD> {
    T[] coords;

    Coords(T[] o) {
        coords = o;
    }
}

// Demonstrate a bounded wildcard.
class BoundedWildcard {

    public static void main(String[] args) {

        TwoD[] td = {
                new TwoD(0, 0),
                new TwoD(7, 9),
                new TwoD(18, 4),
                new TwoD(-1, -23)
        };

        Coords<TwoD> tdlocs = new Coords<>(td);

        System.out.println("Contents of tdlocs.");
        showXY(tdlocs); // OK, is a TwoD
//        showXYZ(tdlocs); // Error, not a ThreeD
//        showAll(tdlocs); // Error, not a FourD

        // Now, create some FourD objects.
        FourD[] fd = {
                new FourD(1, 2, 3, 4),
                new FourD(6, 8, 14, 8),
                new FourD(22, 9, 4, 9),
                new FourD(3, -2, -23, 17)
        };

        Coords<FourD> fdlocs = new Coords<>(fd);

        // These are all OK
        System.out.println("Contents of fdlocs.");
        showXY(fdlocs);
        showXYZ(fdlocs);
        showAll(fdlocs);
    }

    static void showXY(Coords<?> c) {
        System.out.println("X Y Coordinates:");
        for (int i = 0; i < c.coords.length; i++)
            System.out.println(c.coords[i].x + " " + c.coords[i].y);

        System.out.println();
    }

    static void showXYZ(Coords<? extends ThreeD> c) {
        System.out.println("X Y Z Coordinates:");
        for (int i = 0; i < c.coords.length; i++)
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);

        System.out.println();
    }

    static void showAll(Coords<? extends FourD> c) {
        System.out.println("X Y Z T Coordinates:");
        for (int i = 0; i < c.coords.length; i++)
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z + " " + c.coords[i].t);

        System.out.println();
    }
}

/**
     Contents of tdlocs.
     X Y Coordinates:
     0 0
     7 9
     18 4
     -1 -23

     Contents of fdlocs.
     X Y Coordinates:
     1 2
     6 8
     22 9
     3 -2

     X Y Z Coordinates:
     1 2 3
     6 8 14
     22 9 4
     3 -2 -23

     X Y Z T Coordinates:
     1 2 3 4
     6 8 14 8
     22 9 4 9
     3 -2 -23 17
 * */
