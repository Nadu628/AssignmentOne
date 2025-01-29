package org.example;

public class Main {
    public static void main(String[] args) {
        //instance of car
        Car car1 = new Car(4, "silver", 23.5, "regular", "Honda Civic");
        car1.displayInfo();
        car1.honk();
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

class Car extends Vehicle{
    private String brand;

    Car(int numberOfWheels, String color, double engineSize, String fuelType, String brand) {
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void honk(){
        System.out.println("Honk, honk!");
    }

    public void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Number of Wheels: " + getNumberOfWheels());
        System.out.println("Color: " + getColor());
        System.out.println("Engine Size: " + getEngineSize() + " liters");
        System.out.println("Fuel Type: " + getFuelType());
    }
}