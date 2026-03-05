package O_Vehicle2;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VehicleList vehicleList = new VehicleList();

        while (true) {
            System.out.println("0. Exit"
                    + "\n1. Add new vehicle"
                    + "\n2. Update vehicle by id"
                    + "\n3. Delete vehicle by id"
                    + "\n4. Find vehivle by id"
                    + "\n5. Display all vehicles");
            System.out.println("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Exit program");
                    sc.close();
                    return;
                case 1:
                    System.out.print("Enter vehicle type: \n1. Car \n2. Truck");
                    int vehicleType = sc.nextInt();
                    sc.nextLine();

                    if (vehicleType == 1) {
                        Car car = new Car();
                        vehicleList.addVehicle(car);
                    } else if (vehicleType == 2) {
                        Truck truck = new Truck();
                        vehicleList.addVehicle(truck);
                    }
                    break;
                case 2:
                    System.out.print("Enter vehicle id to update: ");
                    String updated = sc.nextLine();
                    vehicleList.updateVehicleById(updated);
                    break;
                case 3:
                    System.out.println("Enter vehicle id to delete: ");
                    String delete = sc.nextLine();
                    vehicleList.deleteVehicleById(delete);
                    break;
                case 4:
                    System.out.println("Enter vehicle id to find: ");
                    String findId = sc.nextLine();
                    Vehicle foundVehicle = vehicleList.findVehicleById(findId);
                    if (foundVehicle != null) {
                        vehicleList.displayAllVehicles();
                    }
                    break;
                case 5:
                    vehicleList.displayAllVehicles();
                    break;
                default:
                    System.out.println("Valid option");
            }
        }
    }
}
