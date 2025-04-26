abstract class Animal {
    abstract void walk(); // Abstract method (does not have a body)
    
    Animal() {
        System.out.println("Animal constructor called.");
    }

    public void eat() {
        System.out.println("Animal eats food.");
    }
}

class Horse extends Animal {

    Horse() {
        System.out.println("Horse constructor called.");
    }

    public void walk() {
        System.out.println("Horse walks on four legs.");
    }
}

class Chicken extends Animal {
    Chicken() {
        System.out.println("Chicken constructor called.");
    }

    public void walk() {
        System.out.println("Dog walks on two legs.");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse(); // Creating an object of the Horse class
        h.walk();
        Chicken c = new Chicken(); // Creating an object of the Chicken class
        c.walk();
        c.eat();
    }
}
