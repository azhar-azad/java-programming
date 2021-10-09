package com.azad.java.learning.GenericCollections.CollectionsMethods.helperClasses;

import java.util.Comparator;

// Custom Comparator class that compares two Time objects
public class TimeComparator implements Comparator<Time> {

    @Override
    public int compare(Time time1, Time time2) {

        int hourDifference = time1.getHour() - time2.getHour();
        if (hourDifference != 0) // test the hour first
            return hourDifference;

        int minuteDifference = time1.getMinute() - time2.getMinute();
        if (minuteDifference != 0) // then test the minute
            return minuteDifference;

        int secondDifference = time1.getSecond() - time2.getSecond();
        return secondDifference;
    }
}
