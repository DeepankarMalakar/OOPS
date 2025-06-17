// 1. Vehicle Management System 
// Problem Statement: 
// Design a Vehicle Management System where: 
//  Vehicle (Base class) contains attributes like brand, model, and year. 
//  Car (Intermediate class) inherits Vehicle and adds fuelType (Petrol/Diesel/Electric). 
//  LuxuryCar (Derived class) inherits Car and adds feature (Sunroof/Leather Seats/Autopilot). 
// Tasks:
// 1. Implement multilevel inheritance using the given classes. 
// 2. Create objects and demonstrate the working of constructors. 
// 3. Override a method in the child class to display details of LuxuryCar. 
// Expected Output Example:
// Brand: Tesla 
// Model: Model S 
// Year: 2023 
// Fuel Type: Electric 
// Feature: Autopilot
class Vehicle {
    String brandName;
    String model;
    int year;

    Vehicle(String brandName, String model, int year) {
        this.brandName = brandName;
        this.model = model;
        this.year = year;    
    }

    void displayDetails() {
        System.out.println("Brand:" + brandName);
        System.out.println("Model:" + model);
        System.out.println("Year:" + year);
    }
}

class Car extends Vehicle {
    String fuelType;

    Car(String brandName, String model, int year, String fuelType) {
        super(brandName, model, year);
        this.fuelType = fuelType;
    }

    void displayDetails() {
            super.displayDetails();
            System.out.println("Fuel Type: " + fuelType);
    }
}

class LuxuryCar extends Car {
    String feature;

    LuxuryCar(String brandName, String model, int year, String fuelType, String feature) {
        super(brandName, model, year, fuelType);
        this.feature = feature;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Feature: " + feature);
    }
}

public class vehicle_management_system {
    public static void main(String [] args) {
        LuxuryCar luxuryCar = new LuxuryCar("Tesla", "Model S", 2023, "Electronic", "Autopilot");

        luxuryCar.displayDetails();
    }
}