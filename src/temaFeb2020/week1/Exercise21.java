package temaFeb2020.week1;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a year: ");
        int number = scanner.nextInt();

        if (number % 4 == 0 || ((number / 100 == 0) && (number / 400 == 0))){
            System.out.println("The year is a leap year.");
        }else{
            System.out.println("The year is not a leap year.");
        }
    }
}
