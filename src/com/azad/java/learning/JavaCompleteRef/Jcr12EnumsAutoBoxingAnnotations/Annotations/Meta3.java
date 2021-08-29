package com.azad.java.learning.JavaCompleteRef.Jcr12EnumsAutoBoxingAnnotations.Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// An annotation type declaration that includes defaults.
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnoDefault {
    String str() default "Testing";
    int val() default 9000;
}

class Meta3 {

    public static void main(String[] args) {

        myMeth();
    }

    // Annotate a method using the default values.
    @MyAnnoDefault()
    public static void myMeth() {
        Meta3 ob = new Meta3();

        // Obtain the annotation for this method
        // and display the values of the members.
        try {
            Class<?> c = ob.getClass();

            Method m = c.getMethod("myMeth");

            MyAnnoDefault anno = m.getAnnotation(MyAnnoDefault.class);

            System.out.println(anno.str() + " " + anno.val());

        } catch (NoSuchMethodException e) {
            System.out.println("Method Not Found.");
        }
    }
}

/**
     Testing 9000
 * */
