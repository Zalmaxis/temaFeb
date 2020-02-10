package temaFeb2020.week1;

import nhlstats.NHLStatistics;


import java.util.Scanner;

public class Exercise24 {

    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.println("NHL statistics service");
        while (true) {
            System.out.println("");
            System.out.println("command (points, goals, assists, penalties, player, club, quit): ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                break;
            }

            if (command.equals("points")) {
                NHLStatistics.top(10);
            } else if (command.equals("goals")) {
                NHLStatistics.top(10);
            } else if (command.equals("assists")) {
                NHLStatistics.top(10);
            } else if (command.equals("penalties")) {
                NHLStatistics.top(10);
            } else if (command.equals("player")) {
                NHLStatistics.top(10);
            } else if (command.equals("club")) {
                System.out.println("Type the abbreviation of the club:");
                NHLStatistics.sortByPoints();
                NHLStatistics.teamStatistics(reader.nextLine());

                // ask the user for the club abbreviation and print the statistics for the club
                // note: the statistics should be sorted by points
                //     (players with the most points are first)
            }
        }
    }
}
