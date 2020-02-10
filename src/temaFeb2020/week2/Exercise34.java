package temaFeb2020.week2;

import java.util.Scanner;

public class Exercise34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Up to what number?");
            int number = Integer.parseInt(scanner.nextLine());
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial is: " + factorial);
        }


    }
}
