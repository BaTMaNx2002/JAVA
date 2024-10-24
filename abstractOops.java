abstract class Animal {
    // Abstract method
    abstract void sound();

    // Concrete method
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

public class abstractOops {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound(); // Output: Bark
        dog.eat(); // Output: This animal eats food.

        Animal cat = new Cat();
        cat.sound(); // Output: Meow
        cat.eat(); // Output: This animal eats food.
    }
}
