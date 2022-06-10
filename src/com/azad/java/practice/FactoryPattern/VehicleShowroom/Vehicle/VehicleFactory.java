package com.azad.java.practice.FactoryPattern.VehicleShowroom.Vehicle;

public class VehicleFactory {

    public static Vehicle getVehicleByType(VehicleType type) {
        if (type.equals(VehicleType.NORMAL)) {
            return new NormalVehicle();
        }
        else if (type.equals(VehicleType.SPORTS)) {
            return new SportsVehicle();
        }
        else if (type.equals(VehicleType.HEAVY)) {
            return new HeavyVehicle();
        }
        else {
            return null;
        }
    }
}
