package com.azad.practice.java.JavaCompleteRef.Jcr12EnumsAutoBoxingAnnotations.Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// An annotation type declaration.
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}
