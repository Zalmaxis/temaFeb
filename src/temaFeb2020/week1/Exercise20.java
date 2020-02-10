package temaFeb2020.week1;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your username:");
        String username = scanner.nextLine();
        System.out.println("Type your password:");
        String password = scanner.nextLine();


        if ((username.equalsIgnoreCase("alex")) && (password.equalsIgnoreCase("mightyducks"))){
            System.out.println("You are now logged into the system!");
        }else if ((username.equalsIgnoreCase("emily")) && (password.equalsIgnoreCase("cat"))){
            System.out.println("You are now logged into the system!");
        }else{
            System.out.println("Your username or password was invalid!");
        }
    }
}
