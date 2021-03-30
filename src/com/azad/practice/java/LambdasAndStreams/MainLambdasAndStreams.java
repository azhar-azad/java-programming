package com.azad.practice.java.LambdasAndStreams;

import com.azad.practice.java.LambdasAndStreams.IntStreamOperations.IntStreamOperations;
import com.azad.practice.java.LambdasAndStreams.StreamIntegerManipulations.ArraysAndStreams;
import com.azad.practice.java.LambdasAndStreams.StreamObjectManipulation.ProcessingEmployees;
import com.azad.practice.java.LambdasAndStreams.StreamStringManipulations.ArraysAndStreams2;
import com.azad.practice.java.LambdasAndStreams.StreamsOfRandomValues.RandomIntStream;

public class MainLambdasAndStreams {

    public static void main(String[] args) {

        IntStreamOperations.main(args);

        ArraysAndStreams.main(args);

        ArraysAndStreams2.main(args);

        ProcessingEmployees.main(args);

        RandomIntStream.main(args);

    }
}
