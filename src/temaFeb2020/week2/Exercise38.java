package temaFeb2020.week2;

import java.util.Scanner;

public class Exercise38 {

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times? ");
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            printText();
        }
    }
}
