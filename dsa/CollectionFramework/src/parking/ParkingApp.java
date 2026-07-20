package parking;

public class ParkingApp {
    public static void main(String[] args) {
        ParkingManager manager = new ParkingManager();
        
        // testing logic
        manager.enterVehicle("TN-01-AB-1234");
        manager.enterVehicle("MH-12-CD-5678");
        manager.displayVehicles();
        
        manager.searchVehicle("TN-01-AB-1234");
        manager.searchVehicle("KA-05-EF-9999");
        
        manager.exitVehicle("TN-01-AB-1234");
        manager.displayVehicles();
    }
}
