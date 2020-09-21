package com.azad.practice.java.array;

import com.azad.practice.java.Utility;

import java.util.ArrayList;
import java.util.List;

public class Array {

    private List<String> elementArray;
    private List<Integer> freqArray;
    private Integer elementArrayLength;

    public Array() {
        this.elementArray = new ArrayList<>();
        this.freqArray = new ArrayList<>();
        this.elementArrayLength = 0;
    }

    public List<String> getElementArray() {
        return elementArray;
    }

    public void setElementArray() {
        System.out.println("Enter the elements (if finished, type ! and press enter): ");

        for (;;) {
            String userInput = Utility.getStringInput();

            if (userInput.equals("!"))
                break;

            elementArray.add(userInput);
            freqArray.add(0);
        }

        setElementArrayLength();
    }

    public void setElementArray(List<String> elementArray) {
        this.elementArray = elementArray;
    }

    public List<Integer> getFreqArray() {
        return freqArray;
    }

    public void setFreqArray() {

        int visited = -1;

        for (int i = 0; i < elementArrayLength; i++) {

            if (freqArray.get(i) == visited)
                continue;

            int count = 1;

            for (int j = i + 1; j < elementArrayLength; j++) {
                if (elementArray.get(i).equals(elementArray.get(j))) {
                    count++;
                    freqArray.set(j, visited);
                }
            }

            freqArray.set(i, count);
        }
    }

    public void setFreqArray(List<Integer> freqArray) {
        this.freqArray = freqArray;
    }

    public Integer getElementArrayLength() {
        return elementArrayLength;
    }

    public void setElementArrayLength() {
        this.elementArrayLength = elementArray.size();
    }

    public void showFrequencies() {

        System.out.println("---------------------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------------------------");

        for (int i = 0; i < elementArrayLength; i++) {

            if (freqArray.get(i) != -1)
                System.out.println("    " + elementArray.get(i) + "    |    " + freqArray.get(i));
        }

        System.out.println("----------------------------------------");
    }
}
