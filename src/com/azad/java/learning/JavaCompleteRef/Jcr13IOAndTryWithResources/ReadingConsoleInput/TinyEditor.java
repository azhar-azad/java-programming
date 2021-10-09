package com.azad.java.learning.JavaCompleteRef.Jcr13IOAndTryWithResources.ReadingConsoleInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// A tiny editor.
class TinyEditor {

    public static void main(String[] args) throws IOException {

        // create a BufferedReader using System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[100];
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'stop' to quit.");
        for (int i = 0; i < 100; i++) {
            str[i] = br.readLine();
            if (str[i].equals("stop"))
                break;
        }
        System.out.println("\nHere is your file: ");
        // display the lines
        for (int i = 0; i < 100; i++) {
            if (str[i].equals("stop"))
                break;
            System.out.println(str[i]);
        }
    }
}

/**
     Enter lines of text.
     Enter 'stop' to quit.
     This is line one.
     This is line two.
     Java makes working with strings easy.
     Just create String objects.
     stop

     Here is your file:
     This is line one.
     This is line two.
     Java makes working with strings easy.
     Just create String objects.
 * */
