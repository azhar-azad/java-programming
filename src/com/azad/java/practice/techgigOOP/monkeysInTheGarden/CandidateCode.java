package com.azad.practice.javaprogramming2.practice.techgigOOP.monkeysInTheGarden;

import java.util.Scanner;

public class CandidateCode {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numOfTrees = scanner.nextInt();
        int[] listOfHeights = new int[numOfTrees];
        for (int i = 0; i < numOfTrees; i++) {
            listOfHeights[i] = scanner.nextInt();
        }

        System.out.println(max(0, listOfHeights, listOfHeights.length));
    }

    public static int max(int max, int[] listOfHeights, int orgArrayLength) {
        int length = listOfHeights.length;
        if (length == 1) {
            return Math.max(max, listOfHeights[0]);
        }
        int tempMax;
        int startIndex = 0;
        int[] tempArrayList = new int[length-1];
        for(int index = 1; index < length; ++index) {
            tempMax = listOfHeights[startIndex] +
                    listOfHeights[index] +
                    Math.min(index, orgArrayLength-index);
            max = Math.max(tempMax, max);
            tempArrayList[index-1] = listOfHeights[index];
        }
        return max(max, tempArrayList, orgArrayLength);
    }
}
