package com.azad.practice.java.array.arrayHelpers;

import com.azad.practice.java.Utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array {

    private List<String> elements;
    private List<Integer> frequencies;
    private List<String> duplicates;
    private List<String> elementsReversed;
    private List<String> elementsSorted;
    private Integer elementArrayLength;
 
    public Array() {
        this.elements = new ArrayList<>();
        this.frequencies = new ArrayList<>();
        this.duplicates = new ArrayList<>();
        this.elementsReversed = new ArrayList<>();
        this.elementsSorted = new ArrayList<>();
        this.elementArrayLength = 0;
    }

    public void setElements(String type) {

        System.out.println("Enter the elements (if finished, type ! and press enter): ");

        if (type.equals("ALL")) {

            for (;;) {
                String userInput = Utility.getStringInput();

                if (userInput.equals("!"))
                    break;

                elements.add(userInput);
                frequencies.add(0);
            }
        }
        else if (type.equals("NUMBER")) {

            for (;;) {
                String userInput = Utility.getStringInput();

                if (userInput.equals("!"))
                    break;

                if (!Utility.isInteger(userInput)) {
                    System.out.println("Not Allowed");
                    continue;
                }

                elements.add(userInput);
                frequencies.add(0);
            }
        }
        else {
            System.out.println("Add if clause for type " + type);
        }

        setElementArrayLength();
    }

    public void setFrequencies() {

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

    public void setDuplicates() {

        for (int i = 0; i < elementArrayLength; i++) {
            if (frequencies.get(i) > 1)
                duplicates.add(elements.get(i));
        }
    }

    public void setElementsReversed() {

        for (int i = elementArrayLength - 1; i >= 0; i--)
            elementsReversed.add(elements.get(i));
    }

    public void setElementsSorted(String order) {

        elementsSorted = elements;

        if (order.equals("asc"))
            Collections.sort(elementsSorted);
        else if (order.equals("desc"))
            Collections.sort(elementsSorted, Collections.reverseOrder());
        else
            System.out.println("Add if clause for new order " + order);
    }

    public void setElementArrayLength() {
        this.elementArrayLength = elements.size();
    }

    public Integer getElementArrayLength() {
        return elementArrayLength;
    }

    public String getLargest() {

        setElementsSorted("desc");
        return getElement(1);
    }

    public String getSmallest() {

        setElementsSorted("asc");
        return getElement(1);
    }

    public int getSum() {

        int sum = 0;

        for (String element: elements)
            sum += Integer.parseInt(element);

        return sum;
    }

    public String getElement(int n) {

        if (n <= 0 || getElementArrayLength() < n)
            return "ERROR: " + n + "th element is not present";

        return elementsSorted.get(n-1);
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

    public void showElementsSorted() {
        System.out.println("Elements of the array sorted (ascending): ");

        show(elementsSorted);
    }

    private void show(List<String> list) {

        for (String item: list)
            System.out.print(item + " ");
    }

    public void reset() {
        this.elements.clear();
        this.frequencies.clear();
        this.duplicates.clear();
        this.elementsReversed.clear();
        this.elementsSorted.clear();
        this.elementArrayLength = 0;
    }
}
