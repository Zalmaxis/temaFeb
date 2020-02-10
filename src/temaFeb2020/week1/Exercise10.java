package temaFeb2020.week1;

import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Exercise10 thing = new Exercise10();

        System.out.println("Type the radius: ");
        double radius = scanner.nextInt();
        System.out.println("The circumference is: " + thing.circumference() * radius);

    }

    public double circumference() {
        double circumferenceCircle = 2 * Math.PI;
        return circumferenceCircle;
    }
}
