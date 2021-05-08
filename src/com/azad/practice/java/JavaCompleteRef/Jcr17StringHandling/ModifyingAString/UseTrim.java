package com.azad.practice.java.JavaCompleteRef.Jcr17StringHandling.ModifyingAString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Using trim() to process commands.
public class UseTrim {

    public static void main(String[] args) throws IOException {

        // create a BufferedReader using System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        System.out.println("Enter 'stop' to quit.");
        System.out.println("Enter State: ");
        do {
            str = br.readLine();
            str = str.trim(); // remove whitespace

            if (str.equals("Illinois"))
                System.out.println("Capital is Springfield.");
            else if (str.equals("Missouri"))
                System.out.println("Capital is Jefferson City.");
            else if (str.equals("California"))
                System.out.println("Capital is Sacramento.");
            else if (str.equals("Washington"))
                System.out.println("Capital is Olympia.");
        } while (!str.equals("stop"));
    }
}
