// 2. Online Shopping System 
// Problem Statement: 
// Develop an Online Shopping System with: 
//  Product (Base class) containing productName and price. 
//  Electronics (Intermediate class) inheriting Product and adding warrantyPeriod. 
//  Smartphone (Derived class) inheriting Electronics and adding batteryLife. 
// Tasks: 
// 1. Implement multilevel inheritance. 
// 2. Create a method to display product details. 
// 3. Demonstrate object instantiation and display the product hierarchy. 
// Expected Output Example:
// Product Name: iPhone 14 
// Price: $999 
// Warranty: 1 year 
// Battery Life: 20 hours

class Product {
    String productName;
    double price;
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }
}

class Electronics extends Product {
    String warrantyPeriod;
    Electronics(String productName, double price, String warrantyPeriod) {
        super(productName, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Warranty: " + warrantyPeriod);
    }
}

class Smartphone extends Electronics {
    String batteryLife;
    Smartphone(String productName, double price, String warrantyPeriod, String batteryLife) {
        super(productName, price, warrantyPeriod);
        this.batteryLife = batteryLife;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Life: " + batteryLife);
    }
}

public class Online_Shopping_System {
    public static void main(String [] args) {
        Smartphone myPhone = new Smartphone("Iphone", 199, "3 years", "4 hours");
        myPhone.displayDetails();
    }
}