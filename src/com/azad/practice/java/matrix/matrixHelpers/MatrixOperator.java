package com.azad.practice.java.matrix.matrixHelpers;

public class MatrixOperator {

    private Matrix matrixA;
    private Matrix matrixB;
    private Matrix matrixAdded;

    public MatrixOperator() {
        matrixA = new Matrix();
        matrixB = new Matrix();
    }

    public MatrixOperator(Matrix matrixA, Matrix matrixB) {
        this.matrixA = matrixA;
        this.matrixB = matrixB;
    }

    public void init() {
        System.out.println("MatrixA initialization: ");
        matrixA.matrixInitialization();

        System.out.println("MatrixB initialization: ");
        matrixB.matrixInitialization();

        matrixAdded = new Matrix(matrixA.getRow(), matrixB.getColumn());
    }

    public void add() {

        if (!isAddSubtractPossible()) {
            System.out.println("Adding is not possible. Row/Column mismatch");
            return;
        }

        for (int i = 0; i < matrixA.getRow(); i++) {
            for (int j = 0; j < matrixB.getColumn(); j++) {
                matrixAdded.matrix[i][j] = matrixA.matrix[i][j] + matrixB.matrix[i][j];
            }
        }

        matrixAdded.printMatrix();
    }

    private boolean isAddSubtractPossible() {

        return (matrixA.getRow() == matrixB.getRow()) && (matrixA.getColumn() == matrixB.getColumn());
    }
}
