package JavaInputOutput.level1;
import java.util.Scanner;

public class ThirdMaximum {

    public static int thirdMax(int[] arr) {

        Integer first = null;
        Integer second = null;
        Integer third = null;

        for (int num : arr) {

            if ((first != null && num == first) ||
                    (second != null && num == second) ||
                    (third != null && num == third)) {
                continue;
            }

            if (first == null || num > first) {

                third = second;
                second = first;
                first = num;

            } else if (second == null || num > second) {

                third = second;
                second = num;

            } else if (third == null || num > third) {

                third = num;
            }
        }

        if (third == null) {
            return first;
        }

        return third;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Third Maximum = " + thirdMax(arr));

        sc.close();
    }
}