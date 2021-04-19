package com.azad.practice.java.JavaCompleteRef.Jcr12EnumsAutoBoxingAnnotations.Annotations;

// Demonstrate a repeated annotation.

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Make MyAnno repeatable
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface MyAnnoRepeatable {
    String str() default "Testing";
    int val() default 9000;
}

// This is the container annotation.
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos {
    MyAnnoRepeatable[] value();
}

class RepeatAnno {

    public static void main(String[] args) {

        myMeth("test", 10);
    }

    // Repeat MyAnnoRepeatable on myMeth().
    @MyAnnoRepeatable(str = "First annotation", val = -1)
    @MyAnnoRepeatable(str = "Second annotation", val = 100)
    public static void myMeth(String str, int i) {
        RepeatAnno ob = new RepeatAnno();

        try {
            Class<?> c = ob.getClass();

            // Obtain the annotations for myMet().
            Method m = c.getMethod("myMeth", String.class, int.class);

            // Display the repeated MyAnnoRepeatable annotations.
            Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);
            System.out.println(anno);

        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found.");
        }
    }
}

/**
    @MyRepeatedAnnos(value={@MyAnnoRepeatable(val=-1, str="First annotation"), @MyAnnoRepeatable(val=100, str="Second annotation")})
 * */
