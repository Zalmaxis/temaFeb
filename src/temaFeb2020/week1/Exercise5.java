package temaFeb2020.week1;

public class Exercise5 {

    public long secInYear(){
        long totalSecInYear = 365 * 86400;
        return totalSecInYear;
    }

    public static void main(String[] args) {
       Exercise5 thing = new Exercise5();
       thing.secInYear();
        System.out.println("There are " + thing.secInYear() + " seconds in an year");
    }

}
