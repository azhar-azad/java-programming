package com.azad.java.practice.FactoryPattern.VehicleShowroom.Showroom;

import com.azad.java.practice.FactoryPattern.VehicleShowroom.Showroom.ShowroomService;
import com.azad.java.practice.FactoryPattern.VehicleShowroom.Showroom.ShowroomServiceImpl;
import com.azad.java.practice.FactoryPattern.VehicleShowroom.Utility;
import com.azad.java.practice.FactoryPattern.VehicleShowroom.Vehicle.Vehicle;
import com.azad.java.practice.FactoryPattern.VehicleShowroom.Vehicle.VehicleFactory;
import com.azad.java.practice.FactoryPattern.VehicleShowroom.Vehicle.VehicleType;

public class ShowroomController {

    private ShowroomService showroomService = new ShowroomServiceImpl();

    public void runProgram() {
        int menuChoice = getMenuChoice();



        Vehicle addedVehicle = addVehicle();
        System.out.println(addedVehicle);
    }

    public int getMenuChoice() {
        showPrompt();
        return Utility.getPositiveIntegerInput(4);
    }

    public Vehicle addVehicle() throws RuntimeException {
        System.out.println("Select the vehicle type you want to add: ");
        int serial = 0;
        for (VehicleType vehicleType: VehicleType.values()) {
            System.out.println("\t (Press " + ++serial + ") " + vehicleType);
        }
        int vehicleChoice = Utility.getPositiveIntegerInput(VehicleType.values().length);

        Vehicle vehicleToAdd = null;
        switch (vehicleChoice) {
            case 1:
                vehicleToAdd = VehicleFactory.getVehicleByType(VehicleType.NORMAL);
                break;
            case 2:
                vehicleToAdd = VehicleFactory.getVehicleByType(VehicleType.SPORTS);
                break;
            case 3:
                vehicleToAdd = VehicleFactory.getVehicleByType(VehicleType.HEAVY);
                break;
        }

        if (vehicleToAdd == null) {
            throw new RuntimeException("Invalid vehicle choice.");
        }

        Vehicle addedVehicle = showroomService.addVehicle(vehicleToAdd);

        return addedVehicle;
    }

    public Vehicle removeVehicle() {
        System.out.println("Enter the serial number of the vehicle to remove: ");
        showroomService.showVehicleListWithDetails();
        int userChoice = Utility.getPositiveIntegerInput(showroomService);

        return null;
    }

    public void showVehicleList() {

    }

    public void showPrompt() {
        System.out.println("Welcome to the Vehicle ShowroomService Program");
        System.out.println("\t(Press 1) Add any type of vehicle ");
        System.out.println("\t(Press 2) Remove a vehicle ");
        System.out.println("\t(Press 3) Get list of vehicles with expected visitor count ");
        System.out.println("\t(Press 4) Get list of vehicles with details ");
        System.out.print("Enter your choice: ");
    }
}
