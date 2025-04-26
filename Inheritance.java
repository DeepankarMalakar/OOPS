class Shape {
    String color;
}

// inheriting the Shape class
class Triangle extends Shape {
    public void draw() {
        System.out.println("Drawing a Triangle with color: " + color);
    }
}

// multilevel inheritance
class EquilateralTriangle extends Triangle {
    public void draw() {
        System.out.println("Drawing an equilateral triangle with color: " + color);
    }
}


class Circle extends Shape {
    public void info() {
        System.out.println("Color of a circle: " + color);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(); // Creating an object of the Triangle class
        t1.color = "Red"; // Setting the color property of the Triangle object
        t1.draw(); // Calling the draw method of the Triangle object

        // Creating an object of the EquilateralTriangle class
        EquilateralTriangle e1 = new EquilateralTriangle(); // Creating an object of the EquilateralTriangle class
        e1.color = "Blue";
        e1.draw(); // Calling the draw method of the EquilateralTriangle object

        // Creating an object of the Circle class
        Circle c1 = new Circle();
        c1.color = "Green"; // Setting the color property of the Circle object
        c1.info(); // Calling the info method of the Circle object
    }
}
