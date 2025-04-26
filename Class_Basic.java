class Pen {
    // Properties/Attributes
    String color;
    String brand;
    String type;

    // Methods/Functions
    public void write() {
        System.out.println("Writing something");
    }

    public void printColor() {
        System.out.println("The color of the pen is:" + this.color);
    }
}

// Creating another class Student
class Student {
    String name;

    public void displayName() {
        System.out.println("Student name is: " + this.name);
    }
}


public class Class_Basic {
    public static void main(String[] args) {
        Pen myPen1 = new Pen(); // Create an object of the Pen class
        myPen1.color = "Blue"; // Set the color property
        myPen1.brand = "Parker"; // Set the brand property
        myPen1.type = "Ballpoint"; // Set the type property
        myPen1.write(); // Call the write method
        myPen1.printColor(); // Call the printColor method
        
        // Create another object of the Pen class
        // This is a new object with different properties
        Pen myPen2 = new Pen(); // Create another object of the Pen class
        myPen2.color = "Red"; // Set the color property
        myPen2.brand = "Reynolds"; // Set the brand property
        myPen2.type = "Gel"; // Set the type property
        myPen2.write(); // Call the write method
        myPen2.printColor(); // Call the printColor method


        // Creating an object of the Student class
        Student student1 = new Student(); // Create an object of the Student class
        student1.name = "Deepankar Malakar"; // Set the name property
        student1.displayName(); // Call the displayName method
    }
}
