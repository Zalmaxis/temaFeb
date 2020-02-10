package temaFeb2020.week2;

import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Type the first number");
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println("Type the second number");
            int number2 = Integer.parseInt(scanner.nextLine());
            int sum = 0;
            for (int i = number; i <= number2; i++) {
                sum += i;
            }
            if ((number2 < number) || (number == 0)){
                System.out.println("Invalid Request. Please Try again.");
                break;
            }
            System.out.println(sum);
        }
    }
}
