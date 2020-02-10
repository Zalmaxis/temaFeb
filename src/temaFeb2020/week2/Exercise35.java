package temaFeb2020.week2;

import java.util.Scanner;

public class Exercise35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* while (true) {
            System.out.println("What power?");
            int power = Integer.parseInt(scanner.nextLine());
            int number = 2;
            int sum = 0;
            for (int i = 0; i < power; i++)  {
                sum += (int)Math.pow(number,i);
            }
            System.out.println("Sum of powers is: " + sum);
        }*/
//DE PE NET
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number:");
        int power=Integer.parseInt(reader.nextLine());
        int number=2;
        int i=0;
        int result=0;
        while (power>=i) {
            result += (int)Math.pow(number, i);
            i++;
        }
        System.out.println("The result is "+result);




    }
}
