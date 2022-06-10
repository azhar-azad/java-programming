package com.azad.java.practice.FactoryPattern.VehicleShowroom.Vehicle;

public class NormalVehicle extends Vehicle {

    private VehicleType type;

    public NormalVehicle() {
    }

    public NormalVehicle(String modelNumber, EngineType engineType, Double enginePower, Double tireSize) {
        super(modelNumber, engineType, enginePower, tireSize);
    }
}
