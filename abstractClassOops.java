// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    abstract void makeSound();
    
    // Concrete method
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass that extends the abstract class
class Dog extends Animal {
    // Implementing the abstract method
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

// Another subclass
class Cat extends Animal {
    // Implementing the abstract method
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}

// Main class to test the abstract class
public class abstractClassOops {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        
        myDog.makeSound(); // Output: Woof!
        myCat.makeSound(); // Output: Meow!
        
        myDog.eat(); // Output: This animal eats food.
        myCat.eat(); // Output: This animal eats food.
    }
}

