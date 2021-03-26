package com.azad.practice.java.lambda;

public class HelloWorldLambda {

    public static void main(String[] args) {

        // implementing sayHelloWorld using Lambda
        HelloWorldInterface helloWorldInterface = () -> "Hello World";

        System.out.println(helloWorldInterface.sayHelloWorld());
    }
}
