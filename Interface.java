interface Animal {
    void makeSound();
}

interface Hervibore {
    void eatGrass();
}


// Multiple inheritance using interfaces
class Horse implements Animal, Hervibore {
    public void makeSound() {
        System.out.println("Neigh");
    }

    public void eatGrass() {
        System.out.println("Horse eats grass.");
    }
}

public class Interface {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.makeSound();
        horse.eatGrass();
    }
}
