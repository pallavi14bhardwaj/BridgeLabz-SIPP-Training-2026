package JavaInputOutput.level1;
import java.util.Scanner;

public class NumberOfOneBits {

    public static int countBits(int number) {

        int count = 0;

        while (number != 0) {

            if ((number & 1) == 1) {
                count++;
            }

            number = number >> 1;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.println("Number of 1 Bits = " + countBits(number));

        sc.close();
    }
}