package temaFeb2020.week2;

public class Exercise39 {

    public static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
    }

    public static void printSquare(int sideSize) {
        int i = 0;
        while (i < sideSize) {
            printStars(sideSize);
            i++;
        }
    }

    public static void printRectangle(int width, int height) {
        printSquare(width);
        printStars(height);
    }

    public static void main(String[] args) {
//        printStars(5);
//        printStars(3);
//        printStars(9);


        printSquare(4);

        // printRectangle(17,3);
    }
}
