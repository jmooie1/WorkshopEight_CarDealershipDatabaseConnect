package com.ps;

import java.util.List;

// Main class that runs the application
public class Main {
    public static void main(String[] args) {
        // Creates an instance of VehicleDao
        VehicleDao vehicleDao = new VehicleDao();

        // Creates a new vehicle
        Vehicle vehicle = new Vehicle();
        vehicle.setMake("Ford");
        vehicle.setModel("Fusion");
        vehicle.setYear(2016);
        vehicle.setColor("Red");
        vehicle.setMileage(103500);
        vehicle.setPrice(15000);
        vehicle.setVehicleType("Sedan");

        // Adds the new vehicle to the database
        vehicleDao.addVehicle(vehicle);

        // Searches for the vehicles by make and model
        List<Vehicle> vehicles = vehicleDao.searchByMakeModel("Ford", "Fusion");
        for (Vehicle v : vehicles) {
            System.out.println(v.getMake() + " " + v.getModel());
        }


        // Closes the DAO to have resources not leak out
        vehicleDao.close();
    }
}