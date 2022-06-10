package com.azad.java.practice.FactoryPattern.VehicleShowroom.Vehicle;

public class Vehicle {

    protected String modelNumber;
    protected EngineType engineType;
    protected Double enginePower;
    protected Double tireSize;

    public Vehicle() {
    }

    public Vehicle(String modelNumber, EngineType engineType, Double enginePower, Double tireSize) {
        this.modelNumber = modelNumber;
        this.engineType = engineType;
        this.enginePower = enginePower;
        this.tireSize = tireSize;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public Double getEnginePower() {
        return enginePower;
    }

    public Double getTireSize() {
        return tireSize;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public void setEnginePower(Double enginePower) {
        this.enginePower = enginePower;
    }

    public void setTireSize(Double tireSize) {
        this.tireSize = tireSize;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "modelNumber='" + modelNumber + '\'' +
                ", engineType=" + engineType +
                ", enginePower=" + enginePower +
                ", tireSize=" + tireSize +
                '}';
    }
}
