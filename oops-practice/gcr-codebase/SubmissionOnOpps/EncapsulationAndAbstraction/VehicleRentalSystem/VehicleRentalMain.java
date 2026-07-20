package oppsPracticeProblem.EncapsulationAndAbstraction.VehicleRentalSystem;

public class VehicleRentalMain {

    public static void main(String[] args) {

        Car car = new Car();
        car.setVehicleNumber("CAR101");
        car.setVehicleType("Car");
        car.setDailyRate(1500);

        Bike bike = new Bike();
        bike.setVehicleNumber("BIKE101");
        bike.setVehicleType("Bike");
        bike.setDailyRate(500);

        Truck truck = new Truck();
        truck.setVehicleNumber("TRUCK101");
        truck.setVehicleType("Truck");
        truck.setDailyRate(3000);
        truck.setLoadingCharge(1000);

        int days = 5;

        car.displayVehicleInfo();
        System.out.println("Rental Cost: " + car.calculateRentalCost(days));

        System.out.println();

        bike.displayVehicleInfo();
        System.out.println("Rental Cost: " + bike.calculateRentalCost(days));

        System.out.println();

        truck.displayVehicleInfo();
        System.out.println("Rental Cost: " + truck.calculateRentalCost(days));
    }
}