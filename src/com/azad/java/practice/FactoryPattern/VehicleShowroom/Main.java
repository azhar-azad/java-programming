package com.azad.java.practice.FactoryPattern.VehicleShowroom;

import com.azad.java.practice.FactoryPattern.VehicleShowroom.Showroom.ShowroomController;

public class Main {

    private static ShowroomController controller = new ShowroomController();

    public static void main(String[] args) {

        controller.runProgram();

    }
}
