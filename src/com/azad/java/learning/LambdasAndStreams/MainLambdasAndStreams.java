package com.azad.java.learning.LambdasAndStreams;

import com.azad.java.learning.LambdasAndStreams.IntStreamOperations.IntStreamOperations;
import com.azad.java.learning.LambdasAndStreams.StreamIntegerManipulations.ArraysAndStreams;
import com.azad.java.learning.LambdasAndStreams.StreamObjectManipulation.ProcessingEmployees;
import com.azad.java.learning.LambdasAndStreams.StreamStringManipulations.ArraysAndStreams2;
import com.azad.java.learning.LambdasAndStreams.StreamsOfRandomValues.RandomIntStream;

public class MainLambdasAndStreams {

    public static void main(String[] args) {

        IntStreamOperations.main(args);

        ArraysAndStreams.main(args);

        ArraysAndStreams2.main(args);

        ProcessingEmployees.main(args);

        RandomIntStream.main(args);

    }
}
