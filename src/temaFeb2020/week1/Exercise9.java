package temaFeb2020.week1;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a number: ");
        int number = scanner.nextInt();

        System.out.println("Type another number: ");
        int number2 = scanner.nextInt();

        double restult = (double) number / number2;
        System.out.println("The Sum of the numbers is: " + restult);
    }
}
