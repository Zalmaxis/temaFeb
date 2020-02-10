package temaFeb2020.week1;

import temaFeb2020.libs.Graph;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Input number to be added to graph:");
            double temperature  = scanner.nextDouble();
          if ((temperature > - 30) && (temperature < 40)) {
              Graph.addNumber(temperature);
              break;
          }
            System.out.println("Invalid number.");
        }
    }
}
