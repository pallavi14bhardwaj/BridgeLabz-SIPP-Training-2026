package ExceptionHandling.level1;
import java.util.Scanner;

public class MultipleCatchDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Change this to null if you want to test NullPointerException
        int[] arr = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter index: ");
            int index = sc.nextInt();

            System.out.println("Value at index " + index + ": " + arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            // Index is outside the array
            System.out.println("Invalid index!");

        } catch (NullPointerException e) {
            // Array is not initialized
            System.out.println("Array is not initialized!");
        }

        sc.close();
    }
}