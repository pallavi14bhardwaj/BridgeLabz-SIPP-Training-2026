package MethodsPractices.level2;

import java.util.Scanner;

public class StudentVoteChecker {

    public static boolean canStudentVote(int age) {
        if (age < 0) return false;   // invalid age
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        System.out.println("Enter ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        System.out.println("\n--- Voting Eligibility Results ---");
        for (int i = 0; i < ages.length; i++) {
            boolean eligible = canStudentVote(ages[i]);
            System.out.println("Student " + (i + 1) +
                    " (Age: " + ages[i] + ") → " +
                    (eligible ? "Can Vote ✓" : "Cannot Vote ✗"));
        }

        sc.close();
    }
}