package temaFeb2020.week1;


import java.util.Scanner;

public class Exercise14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a number: ");
        int number = scanner.nextInt();

        if (number > 0){
            System.out.println("The number is positive");
        }else {
            System.out.println("The number is negative");
        }
    }



}
