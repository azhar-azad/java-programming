package com.azad.java.practice.FactoryPattern.VehicleShowroom.Vehicle;

public class HeavyVehicle extends Vehicle {

    private Double weight;

    public HeavyVehicle() {
    }

    public HeavyVehicle(String modelNumber, EngineType engineType, Double enginePower, Double tireSize, Double weight) {
        super(modelNumber, engineType, enginePower, tireSize);
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyVehicle{" +
                "modelNumber='" + modelNumber + '\'' +
                ", engineType=" + engineType +
                ", enginePower=" + enginePower +
                ", tireSize=" + tireSize +
                ", weight=" + weight +
                '}';
    }
}
