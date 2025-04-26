class Student {
    String name;
    int age;
    
    // Compile time Polymorphism (Method Overloading)
    // Method Overloading: Same method name with different parameters
    public void displayInfo(String name) {
        System.out.println("Student Name: " + name);
    }

    public void displayInfo(int age) {
        System.out.println("Student Age: " + age);
    }

    public void displayInfo(String name, int age) {
        System.out.println("Student Name and Age: " + name + ", " + age);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Deepankar Malakar"; // Set the name property
        student.displayInfo(student.name); // Display name
        student.displayInfo(20); // Display age
        student.displayInfo("Deepankar Malakar", 20); // Display name and age
    }
}
