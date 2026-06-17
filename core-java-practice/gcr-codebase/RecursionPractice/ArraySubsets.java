package RecursionPractice;

import java.util.Scanner;

public class ArraySubsets {

    // Generate subsets recursively
    static void subsets(int[] arr, int index, String current) {

        if (index == arr.length) {
            System.out.println("[" + current + "]");
            return;
        }

        subsets(arr, index + 1, current);

        if (current.equals(""))
            subsets(arr, index + 1, current + arr[index]);
        else
            subsets(arr, index + 1, current + "," + arr[index]);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Subsets:");

        subsets(arr, 0, "");

        sc.close();
    }
}