package com.azad.java.learning.Lambda;

public class HelloWorldTraditional implements HelloWorldInterface {
    @Override
    public String sayHelloWorld() {
        return "Hello World";
    }

    public static void main(String[] args) {

        HelloWorldTraditional helloWorldTraditional = new HelloWorldTraditional();
        System.out.println(helloWorldTraditional.sayHelloWorld());
    }
}
