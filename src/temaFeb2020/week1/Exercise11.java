package temaFeb2020.week1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a number: ");
        int number = scanner.nextInt();
        System.out.println("Type another number: ");
        int number2 = scanner.nextInt();

        System.out.println("This is the bigger number: " + Math.max(number,number2));

        /*if (number > number2) {
            System.out.println("This is the bigger number: " + number);
        } else if (number < number2) {
            System.out.println("This is the bigger number: " + number2);
        }*/
    }

}
