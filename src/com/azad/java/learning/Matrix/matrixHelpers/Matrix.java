package com.azad.java.learning.Matrix.matrixHelpers;

import com.azad.java.Utility;

public class Matrix {

    private int row;
    private int column;
    int[][] matrix;

    public Matrix() {
    }

    public Matrix(int row, int column) {
        this.row = row;
        this.column = column;
        this.matrix = new int[row][column];
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void matrixInitialization() {

        System.out.print("Enter row count: ");
        this.row = Utility.getIntegerInput("Not Allowed");

        System.out.print("Enter column count: ");
        this.column = Utility.getIntegerInput("Not Allowed");

        this.matrix = new int[this.row][this.column];

        System.out.println("Enter the Matrix (start from 1st row and traverse from left to right of each row)");
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++)
                this.matrix[i][j] = Utility.getIntegerInput("Not Allowed");
    }

    public void matrixInitialization(int row, int column) {

        this.row = row;
        this.column = column;

        System.out.println("Enter the Matrix (start from 1st row and traverse from left to right of each row)");
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++)
                this.matrix[i][j] = Utility.getIntegerInput("Not Allowed");
    }

    public void printMatrix() {

        System.out.println("Matrix\n======");

        for (int i = 0; i < this.row; i++) {

            for (int j = 0; j < this.column; j++) {

                int toPrint = this.matrix[i][j];

                if (toPrint > 9999)
                    System.out.print(" " + toPrint);
                else if (toPrint > 999)
                    System.out.print("  " + toPrint);
                else if (toPrint > 99)
                    System.out.print("   " + toPrint);
                else if (toPrint > 9)
                    System.out.print("    " + toPrint);
                else if (toPrint >= 0)
                    System.out.print("     " + toPrint);
                else if (toPrint >= -9)
                    System.out.print("    " + toPrint);
                else if (toPrint >= -99)
                    System.out.print("   " + toPrint);
                else if (toPrint >= -999)
                    System.out.print("  " + toPrint);
                else if (toPrint >= -9999)
                    System.out.print(" " + toPrint);
                else
                    System.out.print(" " + toPrint);
            }
            System.out.println();
        }
    }

    public void reset() {
        this.row = 0;
        this.column = 0;
        this.matrix = null;
    }
}
