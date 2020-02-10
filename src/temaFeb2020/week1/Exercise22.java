package temaFeb2020.week1;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
           while (true){
            System.out.println("Type the password: ");
            String password = scanner.nextLine();
            if (password.equals("carrot")){
                System.out.println("Correct!");
                System.out.println("Secret message is inserted here.");

                break;
            }
            System.out.println("Wrong.");
        }



    }

}

