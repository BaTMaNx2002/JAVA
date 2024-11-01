// Abstract class
abstract class Animal {
    abstract void sound(); // Abstract method

    void sleep() { // Concrete method
        System.out.println("Sleeping...");
    }
}

// First interface
interface Swimmable {
    void swim(); // Abstract method
}

// Second interface
interface Flyable {
    void fly(); // Abstract method
}

// Class that extends an abstract class and implements multiple interfaces
class Duck extends Animal implements Swimmable, Flyable {
    @Override
    void sound() {
        System.out.println("Quack");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming.");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying.");
    }
}

// Main class to test the implementation
public class doubleInterface {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.sound(); // Quack
        duck.sleep(); // Sleeping...
        duck.swim(); // Duck is swimming.
        duck.fly(); // Duck is flying.
    }
}
