package com.azad.java.learning.Generic;

import com.azad.java.learning.Generic.GenericClasses.StackTest;
import com.azad.java.learning.Generic.GenericClasses.StackTest2;
import com.azad.java.learning.Generic.GenericMethods.GenericMethodTest;
import com.azad.java.learning.Generic.GenericMethods.MaximumTest;
import com.azad.java.learning.Generic.RawTypes.RawTypeTest;
import com.azad.java.learning.Generic.WhyGeneric.OverloadedMethods;
import com.azad.java.learning.Generic.Wildcards.TotalNumbers;
import com.azad.java.learning.Generic.Wildcards.WildcardTest;

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
