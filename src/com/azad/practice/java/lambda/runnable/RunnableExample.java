package com.azad.practice.java.lambda.runnable;

public class RunnableExample {

    public static void main(String[] args) {

        // Runnable Traditional example
        Runnable runnableTraditional = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 0; i < 10; i++)
                    sum += (i + 1);
                System.out.println("Traditional sum: " + sum);
            }
        };
        new Thread(runnableTraditional).start();


        // Runnable using Lambda
        Runnable runnableLambda = () -> {
            int sum = 0;
            for (int i = 0; i < 10; i++)
                sum += (i + 1);
            System.out.println("Lambda sum: " + sum);
        };
        new Thread(runnableLambda).start();


        // Implement using Thread with Lambda
        new Thread(() -> {
            int sum = 0;
            for (int i = 0; i < 10; i++)
                sum += (i + 1);
            System.out.println("Thread with Lambda sum: " + sum);
        }).start();
    }
}
