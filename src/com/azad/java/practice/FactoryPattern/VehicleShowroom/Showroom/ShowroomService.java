package com.azad.java.practice.FactoryPattern.VehicleShowroom.Showroom;

import com.azad.java.practice.FactoryPattern.VehicleShowroom.Vehicle.Vehicle;

public interface ShowroomService {

    Vehicle addVehicle(Vehicle vehicle);
    Vehicle removeVehicle(Vehicle vehicle);
    int getExpectedVisitor();
    void increaseVisitorCount(int amount);
    void decreaseVisitorCount(int amount);
    void showVehicleListWithEV();
    void showVehicleListWithDetails();
}
