package com.azad.practice.javaprogramming2.practice.techgigOOP.ritikTheDayDreamer;

import java.util.Scanner;

public class CandidateCode {

    int M, N;

    public static void main(String args[] ) throws Exception {

        //Write code here
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] grid = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        for (int row[]: grid) {
            for (int cell: row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }

        /*
            00 01 02
            10 11 12
            20 21 22
            move up = i-1, j
            move down = i+1, j
            move right = i, j+1
            move left = i, j-1
         */

        boolean reached = false;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                
            }
        }
    }

    public boolean canMoveUp(int i) {
        if (i - 1 < 0)
            return false;
        return true;
    }

    public boolean canMoveDown(int i) {
        if (i + 1 >= M)
            return false;
        return true;
    }

    public boolean canMoveRight(int j) {
        if (j + 1 >= N)
            return false;
        return true;
    }

    public boolean canMoveLeft(int j) {
        if (j - 1 < 0)
            return false;
        return true;
    }
}
