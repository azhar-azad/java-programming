package com.azad.java.learning.Matrix.matrixHelpers;

public class MatrixOperator {

    private Matrix matrixA;
    private Matrix matrixB;
    private Matrix matrixAdded;
    private Matrix matrixSubtracted;
    private Matrix matrixMultiplied;

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
        matrixSubtracted = new Matrix(matrixA.getRow(), matrixB.getColumn());
        matrixMultiplied = new Matrix(matrixA.getRow(), matrixB.getColumn());
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

    public void subtract() {

        if (!isAddSubtractPossible()) {
            System.out.println("Subtracting is not possible. Row/Column mismatch");
            return;
        }

        for (int i = 0; i < matrixA.getRow(); i++) {
            for (int j = 0; j < matrixB.getColumn(); j++) {
                matrixSubtracted.matrix[i][j] = matrixA.matrix[i][j] - matrixB.matrix[i][j];
            }
        }

        matrixSubtracted.printMatrix();
    }

    public void multiply() {

        if (!isMultiplyPossible()) {
            System.out.println("Multiplication is not possible. MatrixA column != MatrixB row");
            return;
        }

//        int row1 = matrixA.Matrix.length;
//        int row2 = matrixB.Matrix.length;
//        int col2 = matrixB.Matrix[0].length;

        for (int i = 0; i < matrixMultiplied.matrix.length; i++) {
            for (int j = 0; j < matrixMultiplied.matrix[i].length; j++) {
                matrixMultiplied.matrix[i][j] = multiplyMatricesCell(matrixA, matrixB, i, j);
            }
        }

        matrixMultiplied.printMatrix();
    }

    private int multiplyMatricesCell(Matrix matrixA, Matrix matrixB, int i, int j) {

        int cell = 0;
        for (int k = 0; i < matrixB.matrix.length; i++) {
            cell += matrixA.matrix[i][k] * matrixB.matrix[k][j];
        }
        return cell;
    }

    private boolean isAddSubtractPossible() {

        return (matrixA.getRow() == matrixB.getRow()) && (matrixA.getColumn() == matrixB.getColumn());
    }

    private boolean isMultiplyPossible() {
        return matrixA.getColumn() == matrixB.getRow();
    }

    public void printMatrixA() {
        matrixA.printMatrix();
    }

    public void printMatrixB() {
        matrixB.printMatrix();
    }

    public void reset() {
        this.matrixA.reset();
        this.matrixB.reset();
    }
}
