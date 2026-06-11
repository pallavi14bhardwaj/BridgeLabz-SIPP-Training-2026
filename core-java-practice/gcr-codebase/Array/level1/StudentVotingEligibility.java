package Array.level1;

import java.util.Scanner;

class StudentVotingEligibility {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array to store ages of 10 students
        int[] ages = new int[10];

        // Taking age input
        System.out.println("Enter ages of 10 students:");

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
        }

        // Checking voting eligibility
        System.out.println("\nVoting Eligibility:");

        for (int i = 0; i < ages.length; i++) {

            if (ages[i] < 0) {
                System.out.println("Invalid age: " + ages[i]);
            } else if (ages[i] >= 18) {
                System.out.println("Student with age " + ages[i] + " can vote.");
            } else {
                System.out.println("Student with age " + ages[i] + " cannot vote.");
            }
        }

        input.close();
    }
}