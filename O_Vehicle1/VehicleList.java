package O_Vehicle1;

import java.util.ArrayList;

public class VehicleList {

    ArrayList<Vehicle> vehicleList = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicle.addVehicle();
        vehicleList.add(vehicle);
        System.out.println("Added!");
    }

    public void updateVehicleByID(String id) {
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getId().equalsIgnoreCase(id)) {
                vehicle.updateVehicle();
                return;
            }
        }
        System.out.println("Not found ID: " + id);
    }

    public void deleteVehicleById(String id) {
        boolean remove = vehicleList.removeIf(vehicle -> vehicle.getId().equals(id));
        if (remove) {
            System.out.println("Delete Id: " + id);
        } else {
            System.out.println("Not found id: " + id);
        }
    }

    public Vehicle findVehicleById(String id) {
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getId().equalsIgnoreCase(id)) {
                return vehicle;
            }
        }
        System.out.println("Not found Id: " + id);
        return null;
    }

    public void displayAllVehicle() {
        if (vehicleList.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (Vehicle vehicle : vehicleList) {
                vehicle.displayVehicle();
            }
        }
    }
}
