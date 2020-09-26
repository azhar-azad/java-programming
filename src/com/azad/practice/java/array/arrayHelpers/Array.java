package com.azad.practice.java.array.arrayHelpers;

import com.azad.practice.java.Utility;

import java.util.ArrayList;
import java.util.List;

public class Array {

    private List<String> elements;
    private List<Integer> frequencies;
    private List<String> duplicates;
    private List<String> elementsReversed;
    private Integer elementArrayLength;

    public Array() {
        this.elements = new ArrayList<>();
        this.frequencies = new ArrayList<>();
        this.duplicates = new ArrayList<>();
        this.elementsReversed = new ArrayList<>();
        this.elementArrayLength = 0;
    }

    public void setElementArray() {
        System.out.println("Enter the elements (if finished, type ! and press enter): ");

        for (;;) {
            String userInput = Utility.getStringInput();

            if (userInput.equals("!"))
                break;

            elements.add(userInput);
            frequencies.add(0);
        }

        setElementArrayLength();
    }

    public void setFreqArray() {

        int visited = -1;

        for (int i = 0; i < elementArrayLength; i++) {

            if (frequencies.get(i) == visited)
                continue;

            int count = 1;

            for (int j = i + 1; j < elementArrayLength; j++) {
                if (elements.get(i).equals(elements.get(j))) {
                    count++;
                    frequencies.set(j, visited);
                }
            }

            frequencies.set(i, count);
        }
    }

    public void setDuplicatesArray() {

        for (int i = 0; i < elementArrayLength; i++) {
            if (frequencies.get(i) > 1)
                duplicates.add(elements.get(i));
        }
    }

    public void setElementsReversed() {

        for (int i = elementArrayLength - 1; i >= 0; i--)
            elementsReversed.add(elements.get(i));
    }

    public void setElementArrayLength() {
        this.elementArrayLength = elements.size();
    }

    public void showFrequencies() {

        System.out.println("---------------------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------------------------");

        for (int i = 0; i < elementArrayLength; i++) {

            if (frequencies.get(i) != -1)
                System.out.println("    " + elements.get(i) + "    |    " + frequencies.get(i));
        }

        System.out.println("----------------------------------------");
    }

    private void show(List<String> list) {

        for (String item: list)
            System.out.print(item + " ");
    }

    public void showElements() {
        System.out.println("Elements of the array: ");

        show(elements);
    }

    public void showDuplicates() {
        System.out.println("Duplicate elements of array: ");

        show(duplicates);
    }

    public void showElementsReversed() {
        System.out.println("Elements of the array in reverse order: ");

        show(elementsReversed);
    }

    public void reset() {
        this.elements.clear();
        this.frequencies.clear();
        this.elementArrayLength = 0;
    }
}
