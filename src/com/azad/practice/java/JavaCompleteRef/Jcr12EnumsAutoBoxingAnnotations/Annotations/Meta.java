package com.azad.practice.java.JavaCompleteRef.Jcr12EnumsAutoBoxingAnnotations.Annotations;

import java.lang.reflect.Method;

class Meta {

    public static void main(String[] args) {

        myMeth();
        myMeth("Two Parameters", 19);
    }

    // Annotate a method.
    @MyAnno(str = "Annotation Example", val = 100)
    public static void myMeth() {
        Meta ob = new Meta();

        // Obtain the annotation for this method
        // and display the values of the members.
        try {
            // First, get a Class object that represents
            // this class.
            Class<?> c = ob.getClass();

            // Now, get a Method object that represents
            // this method.
            Method m = c.getMethod("myMeth");

            // Next, get the annotation for this class.
            MyAnno anno = m.getAnnotation(MyAnno.class);

            // Finally, display the values.
            System.out.println(anno.str() + " " + anno.val());

        } catch (NoSuchMethodException e) {
            System.out.println("Method Not Fouond.");
        }
    }

    // myMeth now has two arguments.
    @MyAnno(str = "Two Parameters", val = 19)
    public static void myMeth(String str, int i) {
        Meta ob = new Meta();

        try {
            Class<?> c = ob.getClass();

            // Here, the parameter types are specified.
            Method m = c.getMethod("myMeth", String.class, int.class);

            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.val());

        } catch (NoSuchMethodException e) {
            System.out.println("Method Not Fouond.");
        }
    }
}

/**
     Annotation Example 100
     Two Parameters 19
 * */
