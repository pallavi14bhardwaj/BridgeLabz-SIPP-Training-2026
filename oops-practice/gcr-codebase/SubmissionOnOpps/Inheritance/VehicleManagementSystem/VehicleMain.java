package oppsPracticeProblem.Inheritance.VehicleManagementSystem;

public class VehicleMain {

    public static void main(String[] args) {

        ElectricVehicle ev =
                new ElectricVehicle(
                        "Tesla Model 3",
                        250);

        PetrolVehicle pv =
                new PetrolVehicle(
                        "Honda City",
                        180);

        ev.displayVehicle();
        ev.charge();

        System.out.println();

        pv.displayVehicle();
        pv.refuel();
    }
}