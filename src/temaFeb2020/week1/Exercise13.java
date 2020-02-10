package temaFeb2020.week1;

import nhlstats.NHLStatistics;

public class Exercise13 {


    public static void main(String[] args) {

        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println("============================");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println("============================");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        System.out.println("============================");
        NHLStatistics.teamStatistics("PHI");
        System.out.println("============================");
        System.out.println("The players of Anaheim Ducks are, ordered by points, :");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
    }

}
