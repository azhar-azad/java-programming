package com.azad.practice.java.JavaCompleteRef.Jcr13IOAndTryWithResources.ReadingConsoleInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Use a BufferedReader to read characters from the console.
class BRRead {

    public static void main(String[] args) throws IOException {

        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter characters, 'q' to quit.");

        // read characters
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}

/**
     Enter characters, 'q' to quit.
     123abcq
     1
     2
     3
     a
     b
     c
     q
 * */
