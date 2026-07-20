package Array.level2;

import java.util.Scanner;

class FriendDetails {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Taking input
        for (int i = 0; i < friends.length; i++) {

            System.out.println("\nEnter details for " + friends[i]);

            System.out.print("Age: ");
            ages[i] = input.nextInt();

            System.out.print("Height (cm): ");
            heights[i] = input.nextDouble();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        // Finding youngest and tallest
        for (int i = 1; i < friends.length; i++) {

            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }

            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("\nYoungest Friend: " + friends[youngestIndex]);
        System.out.println("Tallest Friend: " + friends[tallestIndex]);

        input.close();
    }
}