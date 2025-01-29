package org.example;

public class Main {
    public static void main(String[] args) {

    }
}

class Vehicle{
    private int numberOfWheels;
    private String color;
    private double engineSize;
    private String fuelType;

    Vehicle(int numberOfWheels, String color, double engineSize, String fuelType) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setFuelType(String fuelType){
        this.fuelType = fuelType;
    }

    public String getFuelType(){
        return fuelType;
    }
}