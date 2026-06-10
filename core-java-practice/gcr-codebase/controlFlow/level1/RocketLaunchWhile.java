package controlFlow.level1;

import java.util.Scanner;

public class RocketLaunchWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("counter");
        int counter = sc.nextInt();

        while (counter >= 1) {

            System.out.println(counter);
            counter--;
        }

        System.out.println("Rocket Launch!");

        sc.close();
    }
}