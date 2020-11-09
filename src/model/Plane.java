package model;

public class Plane {
    private String model;
    private String country;
    private int year;
    private int hours;
    private boolean isMilitary;
    private String engineType;
    private int weight;
    private byte wingspan;
    private int topSpeed;
    private int seats;
    private double cost;

    public String getModel() {
        return model;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public int getHours() {
        return hours;
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public String getEngineType() {
        return engineType;
    }

    public int getWeight() {
        return weight;
    }

    public byte getWingspan() {
        return wingspan;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public int getSeats() {
        return seats;
    }

    public double getCost() {
        return cost;
    }

    public void setModel(String model) {
        if (model != "") {
            this.model = model;
        }
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setYear(int year) {
        if (year >= 1903 && year <= 2020) {
            this.year = year;
        }
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours <= 10_000) {
            this.hours = hours;
        }
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }

    public void setEngineType(String engineType) {
        if (engineType != "") {
            this.engineType = engineType;
        }
    }

    public void setWeight(int weight) {
        if (weight >= 1000 && weight <= 160_000) {
            this.weight = weight;
        }
    }

    public void setWingspan(byte wingspan) {
        if (wingspan >= 10 && wingspan <= 45) {
            this.wingspan = wingspan;
        }
    }

    public void setTopSpeed(int topSpeed) {
        if (topSpeed >= 0 && topSpeed <= 1000) {
            this.topSpeed = topSpeed;
        }
    }

    public void setSeats(int seats) {
        if (seats >= 0) {
            this.seats = seats;
        }
    }

    public void setCost(double cost) {
        if (cost >= 0) {
            this.cost = cost;
        }
    }


}
