package com.azad.java.practice.FactoryPattern.VehicleShowroom.Showroom;

import com.azad.java.practice.FactoryPattern.VehicleShowroom.Vehicle.EngineType;
import com.azad.java.practice.FactoryPattern.VehicleShowroom.Utility;
import com.azad.java.practice.FactoryPattern.VehicleShowroom.Vehicle.HeavyVehicle;
import com.azad.java.practice.FactoryPattern.VehicleShowroom.Vehicle.NormalVehicle;
import com.azad.java.practice.FactoryPattern.VehicleShowroom.Vehicle.SportsVehicle;
import com.azad.java.practice.FactoryPattern.VehicleShowroom.Vehicle.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class ShowroomServiceImpl implements ShowroomService {

    public Showroom showroom = new Showroom();

    @Override
    public Vehicle addVehicle(Vehicle vehicle) throws RuntimeException {
        System.out.print("Enter the model number: ");
        vehicle.setModelNumber(Utility.getStringInput());

        if (vehicle instanceof NormalVehicle) {
            System.out.println("Select the engine type.");
            int serial = 0;
            for (EngineType engineType: EngineType.values()) {
                System.out.println("\t(Press " + ++serial + ") " + engineType);
            }
            int engineTypeChoice = Utility.getPositiveIntegerInput(EngineType.values().length);
            switch (engineTypeChoice) {
                case 1:
                    vehicle.setEngineType(EngineType.OIL);
                    break;
                case 2:
                    vehicle.setEngineType(EngineType.GAS);
                    break;
                case 3:
                    vehicle.setEngineType(EngineType.DIESEL);
                    break;
            }
        }
        else if (vehicle instanceof SportsVehicle) {
            vehicle.setEngineType(EngineType.OIL);
            System.out.print("Enter turbo: ");
            ((SportsVehicle) vehicle).setTurbo(Utility.getPositiveDoubleInput());
        }
        else if (vehicle instanceof HeavyVehicle) {
            vehicle.setEngineType(EngineType.DIESEL);
            System.out.print("Enter weight: ");
            ((HeavyVehicle) vehicle).setWeight(Utility.getPositiveDoubleInput());
        }
        else {
            throw new RuntimeException("Invalid Vehicle Type");
        }

        System.out.print("Enter engine power: ");
        vehicle.setEnginePower(Utility.getPositiveDoubleInput());

        System.out.print("Enter tire size: ");
        vehicle.setTireSize(Utility.getPositiveDoubleInput());

        showroom.incrementCount();
        showroom.getVehicleMap().put(showroom.getVehicleCount(), vehicle);

        return vehicle;
    }

    @Override
    public Vehicle removeVehicle(Vehicle vehicle) {



        return null;
    }

    @Override
    public int getExpectedVisitor() {
        return 0;
    }

    @Override
    public void increaseVisitorCount(int amount) {

    }

    @Override
    public void decreaseVisitorCount(int amount) {

    }

    @Override
    public void showVehicleListWithEV() {

    }

    @Override
    public void showVehicleListWithDetails() {

    }

    public Showroom getShowroom() {
        return showroom;
    }
}
