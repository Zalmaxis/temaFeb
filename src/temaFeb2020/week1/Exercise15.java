package temaFeb2020.week1;

import java.util.Scanner;

public class Exercise15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");
        int number = scanner.nextInt();

        if (number < 18){
            System.out.println("You have not reached the age of majority yet!");
        }else{
            System.out.println("You have reached the age of majority!");
        }
    }
}
