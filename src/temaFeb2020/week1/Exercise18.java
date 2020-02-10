package temaFeb2020.week1;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Type the points [0 - 60]:");
        int number = scanner.nextInt();

        if (number <= 29) {
            System.out.println("You have failed me for time. GunShot to the Head Sound. ");
        } else if (number <= 34) {
            System.out.println("Your grade is 1");
        } else if (number <= 39) {
            System.out.println("Your grade is 2");
        } else if (number <= 44) {
            System.out.println("Your grade is 3");
        } else if (number <= 49) {
            System.out.println("Your grade is 4");
        } else if (number <= 60) {
            System.out.println("Your grade is 5");

        }
    }
}
