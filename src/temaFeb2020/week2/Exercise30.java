package temaFeb2020.week2;

import java.util.Scanner;

public class Exercise30 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Up to what number?");
            int number = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < number; i++) {
                System.out.println(i);
            }
            if (number == 0){
                break;
            }

        }




    }
}
