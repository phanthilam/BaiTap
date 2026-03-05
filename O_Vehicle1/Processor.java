package O_Vehicle1;

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
                    + "\n4. Find vehicle by id"
                    + "\n5. Display all vehicles");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0://thoat
                    System.out.println("Exit program");
                    sc.close();
                    return;
                case 1://them
                    System.out.println("Choose a type: \n1. Car \n2. Truck");
                    int vehicleType = sc.nextInt();
                    sc.nextLine();

                    if (vehicleType == 1) {
                        Car car = new Car();
                        vehicleList.addVehicle(car);
                    } else if (vehicleType == 2) {
                        Truck truck = new Truck();
                        vehicleList.addVehicle(truck);
                    } else {
                        System.out.println("Invalid option ");
                    }
                    break;
                case 2://cap nhat
                    System.out.print("Enter vehicle ID to update: ");
                    String updated = sc.nextLine();
                    vehicleList.updateVehicleByID(updated);
                    break;
                case 3://xoa
                    System.out.print("Enter vehicle ID to delete: ");
                    String deleted = sc.nextLine();
                    vehicleList.deleteVehicleById(deleted);
                    break;
                case 4: // tim
                    System.out.println("Enter vehicle id to find: ");
                    String findId = sc.nextLine();
                    Vehicle foundVehicle = vehicleList.findVehicleById(findId);
                    if (foundVehicle != null) {
                        foundVehicle.displayVehicle();
                    }
                    break;
                case 5: // hine thi
                    vehicleList.displayAllVehicle();
                    break;
                default:
                    System.out.println("Invalid choice. Try again");
            }
        }
    }
}
