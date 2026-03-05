package O_Vehicle2;

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
                vehicle.updateVehicle();
                return;
            }
        }
        System.out.println("Not found id: " + id);
    }

    public void deleteVehicleById(String id) {
        boolean delete = vehicleList.removeIf(vehicle -> vehicle.getId().equalsIgnoreCase(id));
        if (delete) {
            System.out.println("Delete the id" + id);
        } else {
            System.out.println("Not found id" + id);
        }
    }

    public Vehicle findVehicleById(String id) {
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getId().equalsIgnoreCase(id)) {
                return vehicle;
            }
        }
        System.out.println("Not found id: " + id);
        return null;
    }

    public void displayAllVehicles() {
        if (vehicleList.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (Vehicle vehicle : vehicleList) {
                vehicle.displayVehicle();
            }
        }
    }
}
