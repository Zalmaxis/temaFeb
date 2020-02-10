package temaFeb2020.week1;

import java.util.Scanner;

public class Exercise17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the first number: ");
        int number = scanner.nextInt();
        System.out.println("Type the second number: ");
        int number2 = scanner.nextInt();

        if (number > number2){
            System.out.println("Greater number: " + number);
        } else if (number2 > number) {
            System.out.println("Greater number: " + number2);
        }else{
            System.out.println("The numbers are equal");
        }
    }
}
