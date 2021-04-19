package com.azad.practice.java.JavaCompleteRef.Jcr12EnumsAutoBoxingAnnotations.Enumerations;

// Demonstrate ordinal(), compareTo() and equals().
class EnumDemo4 {

    public static void main(String[] args) {

        Apple ap, ap2, ap3;

        // Obtain all ordinal values using ordinal().
        System.out.println("Here are all apple constants and their ordinal values: ");
        for (Apple a: Apple.values())
            System.out.println(a + " " + a.ordinal());

        ap = Apple.RedDel;
        ap2 = Apple.GoldenDel;
        ap3 = Apple.RedDel;

        System.out.println();

        // Demonstrate compareTo() and equals()
        if (ap.compareTo(ap2) < 0)
            System.out.println(ap + " comes before " + ap2);

        if (ap.compareTo(ap2) > 0)
            System.out.println(ap2 + " comes before " + ap);

        if (ap.compareTo(ap3) == 0)
            System.out.println(ap + " equals " + ap3);

        System.out.println();

        if (ap.equals(ap2))
            System.out.println("Error!");

        if (ap.equals(ap3))
            System.out.println(ap + " equals " + ap3);

        if (ap == ap3)
            System.out.println(ap + " == " + ap3 );
    }
}

/**
     Here are all apple constants and their ordinal values:
     Jonathan 0
     GoldenDel 1
     RedDel 2
     Winesap 3
     Cortland 4

     GoldenDel comes before RedDel
     RedDel equals RedDel

     RedDel equals RedDel
     RedDel == RedDel
 * */
