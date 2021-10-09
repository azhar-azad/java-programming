package com.azad.java.learning.Matrix;

import com.azad.java.learning.Matrix.matrixHelpers.MatrixOperator;

public class MainMatrix {

    public static void main(String[] args) {

        MatrixOperator matrixOperator = new MatrixOperator();

        /*
        MATRIX 1: Add two Matrices
         */
        System.out.println("\n\nMatrix Add Problem\n============================\n");

        matrixOperator.init();
        matrixOperator.add();

        matrixOperator.reset();
        /*
        END MATRIX 1
         */


        /*
        MATRIX 2: Subtract two Matrices
         */
        System.out.println("\n\nMatrix Subtract Problem\n============================\n");

        matrixOperator.init();
        matrixOperator.subtract();

        matrixOperator.reset();
        /*
        END MATRIX 1
         */


        /*
        MATRIX 2: Subtract two Matrices
         */
        System.out.println("\n\nMatrix Multiplication Problem\n============================\n");

        matrixOperator.init();
        matrixOperator.printMatrixA();
        matrixOperator.printMatrixB();

        matrixOperator.multiply();

        matrixOperator.reset();
        /*
        END MATRIX 1
         */
    }
}
