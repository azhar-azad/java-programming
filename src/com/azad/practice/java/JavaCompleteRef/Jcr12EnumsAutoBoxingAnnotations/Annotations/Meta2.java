package com.azad.practice.java.JavaCompleteRef.Jcr12EnumsAutoBoxingAnnotations.Annotations;

// Show all annotations for a class and a method.

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface WhatIsThis {
    String description();
}

@WhatIsThis(description = "An annotation test class")
@MyAnno(str = "Meta2", val = 99)
class Meta2 {

    public static void main(String[] args) {

        myMeth();
    }

    @WhatIsThis(description = "An annotation test method")
    @MyAnno(str = "Testing", val = 100)
    public static void myMeth() {
        Meta2 ob = new Meta2();

        // Display all annotations for myMeth
        try {
            Annotation[] annos = ob.getClass().getAnnotations();

            // Display all annotations for Meta2
            System.out.println("All annotations for Meta2:");
            for (Annotation a: annos)
                System.out.println(a);

            System.out.println();

            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();

            System.out.println("All annotations for myMeth:");
            for (Annotation a: annos)
                System.out.println(a);

        } catch (NoSuchMethodException e) {
            System.out.println("Method Not Found.");
        }
    }
}

/**
 All annotations for Meta2:
 @What(description="An annotation test class")
 @MyAnno(str="Meta2", val=99)

 All annotations for myMeth:
 @What(description="An annotation test method")
 @MyAnno(str="Testing", val=100)
 * */
