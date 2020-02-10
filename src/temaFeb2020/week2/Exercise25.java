package temaFeb2020.week2;

import java.util.Scanner;

public class Exercise25 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;

        System.out.println("Type the first number: ");
        reader.nextLine();
        sum = sum + 3;
        System.out.println("Type the second number: ");
        reader.nextLine();
        sum = sum + 6;
        System.out.println("Type the third number: ");
        reader.nextLine();
        sum = sum + 12;


// WRITE YOUR PROGRAM HERE
// USE ONLY THE VARIABLES sum, reader AND read!

        System.out.println("Sum: " + sum);
    }
}
