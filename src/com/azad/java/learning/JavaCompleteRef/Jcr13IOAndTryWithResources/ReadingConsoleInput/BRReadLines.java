package com.azad.java.learning.JavaCompleteRef.Jcr13IOAndTryWithResources.ReadingConsoleInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Read a string from console using a BufferedReader.
class BRReadLines {

    public static void main(String[] args) throws IOException {

        // create a BufferedReader using System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'stop' to quit.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("stop"));
    }
}

/**
     Enter lines of text.
     Enter 'stop' to quit.
     I am not just a kid.
     I am not just a kid.
     I am not alone in this world.
     I am not alone in this world.
     stop
     stop
 * */
