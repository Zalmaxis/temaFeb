package temaFeb2020.week2;

import java.util.Scanner;

public class Exercise31 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("First number: ");
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println("Second number: ");
            int number2 = Integer.parseInt(scanner.nextLine());
            for (int i = number; i < number2; i++) {
                System.out.println(i);
            }
            if (number > number2){
                break;
            }

        }
    }
}
