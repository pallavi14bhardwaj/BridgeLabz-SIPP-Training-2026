package parking;

import java.util.ArrayList;
import java.util.List;

public class ParkingManager {
    // using ArrayList to store registration numbers
    private List<String> parkedVehicles = new ArrayList<>();

    // 1. Add a vehicle when it enters
    public void enterVehicle(String regNo) {
        if (parkedVehicles.contains(regNo)) {
            System.out.println("Vehicle " + regNo + " is already in the parking lot.");
        } else {
            parkedVehicles.add(regNo);
            System.out.println("Vehicle " + regNo + " has entered.");
        }
    }

    // 2. Remove a vehicle when it exits
    public void exitVehicle(String regNo) {
        if (parkedVehicles.remove(regNo)) {
            System.out.println("Vehicle " + regNo + " has exited.");
        } else {
            System.out.println("Vehicle " + regNo + " not found!");
        }
    }

    // 3. Search for a vehicle
    public void searchVehicle(String regNo) {
        if (parkedVehicles.contains(regNo)) {
            System.out.println("Yes, vehicle " + regNo + " is currently parked.");
        } else {
            System.out.println("No, vehicle " + regNo + " is not here.");
        }
    }

    // 4. Display all parked vehicles and total count
    public void displayVehicles() {
        System.out.println("\n--- Current Parked Vehicles ---");
        if (parkedVehicles.isEmpty()) {
            System.out.println("Parking lot is empty.");
        } else {
            for (String regNo : parkedVehicles) {
                System.out.println(regNo);
            }
        }
        System.out.println("Total occupied slots: " + parkedVehicles.size());
        System.out.println("-------------------------------\n");
    }
}
