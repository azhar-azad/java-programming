package com.azad.java.practice.FactoryPattern.VehicleShowroom.Showroom;

import com.azad.java.practice.FactoryPattern.VehicleShowroom.Vehicle.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class Showroom {

    public static Map<Integer, Vehicle> VEHICLE_MAP;
    private static int VEHICLES_COUNT;

    public Showroom() {
        VEHICLE_MAP = new HashMap<>();
        VEHICLES_COUNT = 0;
    }

    public Map<Integer, Vehicle> getVehicleMap() {
        return VEHICLE_MAP;
    }

    public int getVehicleCount() {
        return VEHICLES_COUNT;
    }

    public void incrementCount() {
        ++VEHICLES_COUNT;
    }
}
