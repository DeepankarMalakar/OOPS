abstract class Animal {
    abstract void sound();
    abstract void colour();
    void eat() {
        System.out.println("Animal eats food.");
    }
}

class Dog extends Animal {
    void sound(){
        System.out.println("Barks");
    }
    
    void colour(){
        System.out.println("Brown");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meows");
    }
    
    void colour(){
        System.out.println("Grey");
    }
}

class AbstractClass {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
        dog.colour();
        
        Animal cat = new Cat();
        cat.sound();
        cat.colour();
        cat.eat();
    }
}