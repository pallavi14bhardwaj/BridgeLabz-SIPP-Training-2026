package oppsPracticeProblem.Inheritance.OnlineRetailOrderManagemen;

public class OrderManagement {

    public static void main(String[] args) {

        Order order = new Order(
                101,
                "24-06-2026");

        ShippedOrder shipped = new ShippedOrder(
                102,
                "23-06-2026",
                "TRK12345");

        DeliveredOrder delivered = new DeliveredOrder(
                103,
                "20-06-2026",
                "TRK67890",
                "24-06-2026");

        System.out.println("=== Order ===");
        order.display();
        System.out.println("Status: " + order.getOrderStatus());

        System.out.println();

        System.out.println("=== Shipped Order ===");
        shipped.display();
        System.out.println("Status: " + shipped.getOrderStatus());

        System.out.println();

        System.out.println("=== Delivered Order ===");
        delivered.display();
        System.out.println("Status: " + delivered.getOrderStatus());
    }
}