package O_Vehicle;

import java.util.ArrayList;

public class VehicleList {

    ArrayList<Vehicle> vehicleList = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicle.addVehicle();
        vehicleList.add(vehicle);
        System.out.println("Added");
    }

    public void updateVehicleById(String id) {
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getId().equalsIgnoreCase(id)) {
                vehicle.updateVehicle(id);
                return;
            }
        }
        System.out.println("Not found ID: " + id);
    }

    public void deleteVehicleById(String id) {
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getId().equalsIgnoreCase(id)) {
                vehicleList.remove(vehicle);
                System.out.println("Delete ID: " + id);
                return;
            }
        }
        System.out.println("Not found ID: " + id);
    }

    public Vehicle findVehicleById(String id) {
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getId().equalsIgnoreCase(id)) {
                return vehicle;
            }
        }
        System.out.println("Not found ID: " + id);
        return null;
    }

    public void displayVehicle() {
        if (vehicleList.isEmpty()) {
            System.out.println("Empty!");
        } else {
            for (Vehicle vehicle : vehicleList) {
                vehicle.displayVehicle();
            }
        }
    }
}
