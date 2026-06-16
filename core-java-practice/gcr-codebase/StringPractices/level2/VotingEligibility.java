package StringPractices.level2;

import java.util.Scanner;

class VotingEligibility {

    // generating random 2-digit ages for n students
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            // random age between 10 and 99
            ages[i] = (int)(Math.random() * 90) + 10;
        }
        return ages;
    }

    // checking voting eligibility for each student
    public static String[][] checkVoting(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "false"; // negative age is invalid
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }

    public static void displayTable(String[][] data) {
        System.out.println("\nStudent\t\tAge\t\tCan Vote?");
        System.out.println("----------------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Student " + (i + 1) + "\t" +
                    data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = generateAges(n);
        String[][] result = checkVoting(ages);
        displayTable(result);
    }
}
