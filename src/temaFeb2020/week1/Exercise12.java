package temaFeb2020.week1;


import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Type your name: ");
        String name1 = scanner.nextLine();
        System.out.println("Type your age: ");
        int age1 = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Type your name: ");
        String name2 = scanner.nextLine();
        System.out.println("Type your age: ");
        int age2 = scanner.nextInt();

        int sumAge = age1 + age2;
        System.out.println("The sum of " + name1 + " and " + name2 + " Ages is: " + sumAge);
    }
}
