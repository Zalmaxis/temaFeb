package temaFeb2020.week2;

import java.util.Scanner;

public class Exercise32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Up to what number?");
            int number = Integer.parseInt(scanner.nextLine());
            int sum = 0;
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
            if (number == 0){
            break;
        }
            System.out.println("Sum is: " + sum);
        }


    }
}
