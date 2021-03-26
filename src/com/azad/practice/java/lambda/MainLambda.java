package com.azad.practice.java.lambda;

import com.azad.practice.java.lambda.callable.SumOfNumbersUsingCallable;
import com.azad.practice.java.lambda.runnable.RunnableExample;

import java.util.concurrent.ExecutionException;

public class MainLambda {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

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
