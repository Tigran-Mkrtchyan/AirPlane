package service;

import model.Plane;

import java.util.Scanner;

public class PlaneService {

    public Plane create() {
        Plane plane = new Plane();
        Scanner s = new Scanner(System.in);
        System.out.println(".................. Creating Plane ....................");
        System.out.println("Please enter model : ");
        String model = s.nextLine();
        plane.setModel(model);
        System.out.println("Please enter country : ");
        String country = s.nextLine();
        plane.setCountry(country);
        System.out.println("Please enter year : ");
        int year = s.nextInt();
        plane.setYear(year);
        System.out.println("Please enter hours : ");
        int hours = s.nextInt();
        plane.setHours(hours);
        System.out.println("Please enter is military : ");
        boolean isMilitary = s.nextBoolean();
        plane.setMilitary(isMilitary);
        System.out.println("Please enter engine type : ");
        String engineType = s.nextLine();
        plane.setEngineType(engineType);
        System.out.println("Please enter weight : ");
        int weight = s.nextInt();
        plane.setWeight(weight);
        System.out.println("Please enter wingspan: ");
        byte wingspan = s.nextByte();
        plane.setWingspan(wingspan);
        System.out.println("Please enter top speed : ");
        int topSpeed = s.nextInt();
        plane.setTopSpeed(topSpeed);
        System.out.println("Please enter seats : ");
        int seats = s.nextInt();
        plane.setSeats(seats);
        System.out.println("Please enter cost : ");
        double cost = s.nextDouble();
        plane.setCost(cost);
        System.out.println(".................................................");
        return plane;
    }
    public Plane[] createArray(){
        Scanner s = new Scanner(System.in);
        System.out.println("................... Creating array of planes .........................");
        System.out.println("Please enter count of Array : ");
        int size  = s.nextInt();
        Plane[] planes = new Plane[size];
        for (int i = 0; i <size ; i++) {
            planes[i]=create();
        }
        System.out.println(".................................................");
        return planes;
    }

    public void printAllInformationOfPlane(Plane plane) {
        System.out.println("Model: " + plane.getModel());
        System.out.println("Country: " + plane.getCountry());
        System.out.println("Year: " + plane.getYear());
        System.out.println("Hours: " + plane.getHours());
        System.out.println("Military: " + plane.isMilitary());
        System.out.println("engine type: " + plane.getEngineType());
        System.out.println("Weight: " + plane.getWeight());
        System.out.println("Wingspan: " + plane.getWingspan());
        System.out.println("Top speed: " + plane.getTopSpeed());
        System.out.println("Seats: " + plane.getSeats());
    }

    public void printInfoDependAtMilitary(Plane plane) {
        if (plane.isMilitary()) {
            System.out.println("Cost: " + plane.getCost() + ", top speed: " + plane.getTopSpeed());
        } else {
            System.out.println("Model: " + plane.getModel() + ", country: " + plane.getCountry());
        }
    }

    public Plane getNewerPlain(Plane plane1, Plane plane2) {
        return plane1.getYear() >= plane2.getYear() ? plane1 : plane2;
    }

    public Plane getPlainWithBiggerWingspan(Plane plane1, Plane plane2) {
        return plane1.getWingspan() > plane2.getWingspan() ? plane1 : plane2;
    }

    public Plane getPlainWithHighestCost(Plane plane1, Plane plane2, Plane plane3) {
        Plane withMaxCost = plane1;
        if (plane2.getCost() > withMaxCost.getCost()) {
            withMaxCost = plane2;
        }
        if (plane3.getCost() > withMaxCost.getCost()) {
            withMaxCost = plane3;
        }
        return withMaxCost;
    }

    public void printCountryOWithSmallestSeatsPlane(Plane plane1, Plane plane2, Plane plane3) {
        Plane withSmallestSeats = plane1;
        if (plane2.getCost() < withSmallestSeats.getCost()) {
            withSmallestSeats = plane2;
        }
        if (plane3.getCost() < withSmallestSeats.getCost()) {
            withSmallestSeats = plane3;
        }
        System.out.println("Country: " + withSmallestSeats.getCountry());
    }

    public void printNotMilitaryPlains(Plane[] planes) {
        for (Plane plane : planes) {
            if (plane.isMilitary()) continue;
            printAllInformationOfPlane(plane);
        }
    }

    public void printMilitaryPlainsMoreThen100Hours(Plane[] planes) {
        for (Plane plane : planes) {
            if (!plane.isMilitary()) continue;
            if (plane.getHours() > 100) {
                printAllInformationOfPlane(plane);
            }
        }
    }

    public Plane getWithSmallestWeightPlain(Plane[] planes) {
        Plane withMinWeight = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if (withMinWeight.getWeight() >= planes[i].getWeight()) {
                withMinWeight = planes[i];
            }
        }
        return withMinWeight;
    }

    public Plane getWithMinCostPlain(Plane[] planes) {
        Plane withMinCost = null;
        for (int i = 0; i < planes.length; i++) {
            if (withMinCost.getWeight() > planes[i].getWeight() && planes[i].isMilitary()) {
                withMinCost = planes[i];
            }
        }
        return withMinCost;
    }


    public void sortWithYear(Plane[] planes) {
        boolean isDoSomeChanges = true;
        int size = planes.length;
        while (isDoSomeChanges) {
            isDoSomeChanges = false;
            for (int i = 0; i < size - 1; i++) {
                if (planes[i].getYear() > planes[i + 1].getYear()) {
                    Plane temp = planes[i];
                    planes[i] = planes[i + 1];
                    planes[i + 1] = temp;
                    isDoSomeChanges = true;
                }
            }
            size--;
        }
    }

    public void printNotMilitaryPlainsBySeatsDec(Plane[] planes) {

        boolean isDoSomeChanges = true;
        int size = planes.length;
        while (isDoSomeChanges) {
            isDoSomeChanges = false;
            for (int i = 0; i < size - 1; i++) {
                if (planes[i].getSeats() > planes[i + 1].getSeats()) {
                    Plane temp = planes[i];
                    planes[i] = planes[i + 1];
                    planes[i + 1] = temp;
                    isDoSomeChanges = true;
                }
            }
            size--;
        }
        for (int i = planes.length - 1; i >= 0; i--) {
            if (planes[i].isMilitary()) continue;
            printAllInformationOfPlane(planes[i]);
        }
    }

}
