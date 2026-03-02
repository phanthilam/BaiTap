package O_Vehicle;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VehicleList vehicleList = new VehicleList();

        while (true) {
            System.out.println("0. Exit"
                    + "\n1. Add new vehicle"
                    + "\n2. Update vehicle by ID"
                    + "\n3. Delete vehicle by ID"
                    + "\n4. Find vehicle by ID"
                    + "\n5. Display all Vehicles");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0://exit 
                    System.out.println("Exit program!");
                    sc.close();
                    return;

                case 1://add new vehicle
                    System.out.println("Choose vehicle type: \n1. Car \n2. Truck");
                    int vehicleType = sc.nextInt();
                    sc.nextLine();

                    if (vehicleType == 1) {
                        Car car = new Car();
                        vehicleList.addVehicle(car);
                    } else if (vehicleType == 2) {
                        Truck truck = new Truck();
                        vehicleList.addVehicle(truck);
                    } else {
                        System.out.println("Invalid option");
                    }
                    break;

                case 2://update 
                    System.out.print("Enter vehicle ID to update: ");
                    String updated = sc.nextLine();
                    vehicleList.updateVehicleById(updated);
                    break;

                case 3: //delete
                    System.out.print("Enter vehicle ID to delete: ");
                    String deletId = sc.nextLine();
                    vehicleList.deleteVehicleById(deletId);
                    break;

                case 4: //find
                    System.out.print("Enter vehicle ID to find: ");
                    String findId = sc.nextLine();
                    Vehicle foundVehicle = vehicleList.findVehicleById(findId);
                    if (foundVehicle != null) {
                        foundVehicle.displayVehicle();
                    }
                    break;
                case 5: //display
                    vehicleList.displayVehicle();
                    break;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }
}
