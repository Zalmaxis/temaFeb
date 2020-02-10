package temaFeb2020.week2;

import java.util.Scanner;

public class Exercise36 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       /* while (true) {
            System.out.println("Type number:");
            int sum = 0;
            int counter = 0;
            int evenCounter = 0;
            int oddCounter = 0;
            for (int i = 0; i < 4; i++) {
                int number = Integer.parseInt(scanner.nextLine());
                sum += number;
                counter++;
                if (number == -1) {
                    System.out.println("Thank you and see you later!");
                    counter--;
                }else if (number % 2 == 0){
                    evenCounter++;
                }else if( number %2 != 0){
                    oddCounter++;
                }

            }

            double average = sum / counter;
            System.out.println("Sum is: " + sum);
            System.out.println("Total number typed in: " + counter);
            System.out.println("Average of the numbers is: " + average);
            System.out.println("Even numbers typed: " + evenCounter);
            System.out.println("Odd numbers typed: " + oddCounter);
            break;
        }*/

        System.out.println("Type numbers: ");

        int i = 0;
        int counter = 0;
        int sum = 0;
        int even = 0;
        int odd = 0;
        double average = 0.0;
        while (true){
            i = scanner.nextInt();
            if(i == -1){
                System.out.println("Thank you and see you later!");
                break;
            } else {

                sum = sum + i;
                counter = counter + 1;

                if(i % 2 == 0){
                    even++;
                } else {
                    odd++;
                }
            }

        }

        //sum++;
        //counter--;

        average = (double)sum/counter;


        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + counter);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}




