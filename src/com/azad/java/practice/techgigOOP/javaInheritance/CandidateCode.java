package com.azad.practice.javaprogramming2.practice.techgigOOP.javaInheritance;

import java.util.Scanner;

class Rectangle {
    protected int width;
    protected int length;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void display() {
        System.out.println(width + " " + length);
    }
}

class RectangleArea extends Rectangle {

    public RectangleArea() {
        String input = read_input();
        int indexOfSpace = input.indexOf("  ");
        int width = Integer.parseInt(input.substring(0, indexOfSpace));
        int length = Integer.parseInt(input.substring(indexOfSpace + 2));
        super.setWidth(width);
        super.setLength(length);
        super.display();
    }

    public String read_input() {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        return input;
    }

    public void display() {
        System.out.println(width * length);
    }
}

public class CandidateCode {

    public static void main(String args[] ) throws Exception {

        //Write code here
        RectangleArea rArea = new RectangleArea();
        rArea.display();
    }
}
