class Student {
    String name;
    int rollNo;
    
    public void displayInfo() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Roll No: " + this.rollNo);
    }

    // Non-parameterized constructor
    // Student() {
    //     System.out.println("Default constructor called");
    // }
    
    // Parameterized constructor - constructor with parameters
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Copy constructor - constructor that creates a new object as a copy of an existing object
    // Student(Student obj2) {
    //     this.name = obj2.name;
    //     this.rollNo = obj2.rollNo;
    // }
}

public class Constructors {
    public static void main(String[] args) {
        Student obj = new Student("Deepankar Malakar", 12345); // Using parameterized constructor
        // obj.name = "Deepankar Malakar";
        // obj.rollNo = 12345;

        // Student obj2 = new Student(obj); // Using copy constructor
        // obj2.displayInfo(); // Display copied values
        obj.displayInfo(); // Display values

    }
}
