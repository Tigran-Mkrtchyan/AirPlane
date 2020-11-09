package main;

import model.Plane;
import service.PlaneService;

public class AirportTest {
    public static void main(String[] args) {
        PlaneService ps = new PlaneService();
        Plane plane1 = ps.create();
        Plane plane2 = ps.create();
        Plane plane3 = ps.create();


        System.out.println("Task 1 .................................................");
        ps.printAllInformationOfPlane(plane1);
        System.out.println("Task 2 .................................................");
        ps.printInfoDependAtMilitary(plane1);
        System.out.println("Task 3 .................................................");
        System.out.println(ps.getNewerPlain(plane1,plane3));
        System.out.println("Task 4 .................................................");
        System.out.println(ps.getPlainWithBiggerWingspan(plane1,plane2));
        System.out.println("Task 5 .................................................");
        System.out.println(ps.getPlainWithHighestCost(plane1,plane2,plane3));
        System.out.println("Task 6 .................................................");
        ps.printCountryOWithSmallestSeatsPlane(plane1,plane2,plane3);
        System.out.println("Task 7 .................................................");
        Plane[] planes = {plane1,plane2,plane3};
       ps.printNotMilitaryPlains(planes);

        System.out.println("Task 8 .................................................");
        ps.printMilitaryPlainsMoreThen100Hours(planes);
        System.out.println("Task 9 .................................................");
        ps.getWithSmallestWeightPlain(planes);
        System.out.println("Task 10 .................................................");
        System.out.println(ps.getWithMinCostPlain(planes));
        System.out.println("Task 11 .................................................");
        ps.sortWithYear(planes);
        System.out.println("Task 12 .................................................");
        ps.printNotMilitaryPlainsBySeatsDec(planes);

    }
}
