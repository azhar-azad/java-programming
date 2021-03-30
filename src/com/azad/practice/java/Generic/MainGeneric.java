package com.azad.practice.java.Generic;

import com.azad.practice.java.Generic.GenericClasses.StackTest;
import com.azad.practice.java.Generic.GenericClasses.StackTest2;
import com.azad.practice.java.Generic.GenericMethods.GenericMethodTest;
import com.azad.practice.java.Generic.GenericMethods.MaximumTest;
import com.azad.practice.java.Generic.RawTypes.RawTypeTest;
import com.azad.practice.java.Generic.WhyGeneric.OverloadedMethods;
import com.azad.practice.java.Generic.Wildcards.TotalNumbers;
import com.azad.practice.java.Generic.Wildcards.WildcardTest;

public class MainGeneric {

    public static void main(String[] args) {

        OverloadedMethods.main(args);

        GenericMethodTest.main(args);

        MaximumTest.main(args);

        StackTest.main(args);

        StackTest2.main(args);

        RawTypeTest.main(args);

        TotalNumbers.main(args);

        WildcardTest.main(args);

    }
}
