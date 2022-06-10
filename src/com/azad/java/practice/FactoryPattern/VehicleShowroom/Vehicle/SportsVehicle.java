package com.azad.java.practice.FactoryPattern.VehicleShowroom.Vehicle;

public class SportsVehicle extends Vehicle {

    private Double turbo;

    public SportsVehicle() {
    }

    public SportsVehicle(String modelNumber, EngineType engineType, Double enginePower, Double tireSize, Double turbo) {
        super(modelNumber, engineType, enginePower, tireSize);
        this.turbo = turbo;
    }

    public Double getTurbo() {
        return turbo;
    }

    public void setTurbo(Double turbo) {
        this.turbo = turbo;
    }

    @Override
    public String toString() {
        return "SportsVehicle{" +
                "modelNumber='" + modelNumber + '\'' +
                ", engineType=" + engineType +
                ", enginePower=" + enginePower +
                ", tireSize=" + tireSize +
                ", turbo=" + turbo +
                '}';
    }
}
