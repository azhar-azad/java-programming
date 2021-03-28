package com.azad.practice.java.Lambda;

import com.azad.practice.java.Lambda.callable.SumOfNumbersUsingCallable;
import com.azad.practice.java.Lambda.runnable.RunnableExample;

public class MainLambda {

    public static void main(String[] args)  {

        HelloWorldTraditional.main(args);
        HelloWorldLambda.main(args);

        IncrementByFiveTraditional.main(args);
        IncrementByFiveLambda.main(args);

        ConcatenateTraditional.main(args);
        ConcatenateLambda.main(args);

        RunnableExample.main(args);

        SumOfNumbersUsingCallable.main(args);
    }
}
