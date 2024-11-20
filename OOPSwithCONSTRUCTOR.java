// Class representing a generic Animal
class Animal {
    String name;
    int age;

    // Constructor 
    Animal(String name, int age) { 
        this.name = name;
        this.age = age;
    }

    void speak() {
        System.out.println(name + " makes a sound.");
    }
}

// Inheritance: Dog is a type of Animal
class Dog extends Animal {
    // Constructor
    Dog(String name, int age) {
        super(name, age); // Calling the parent constructor
    }

    @Override
    void speak() {
        System.out.println(name + " barks.");
    }
}

// Inheritance: Cat is a type of Animal
class Cat extends Animal {
    // Constructor
    Cat(String name, int age) {
        super(name, age); // Calling the parent constructor
    }

    @Override
    void speak() {
        System.out.println(name + " meows.");
    }
}

// Main class to test OOP concepts
public class OOPSwithCONSTRUCTOR {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy", 3);
        Animal cat = new Cat("Whiskers", 2);

        dog.speak(); // Output: Buddy barks.
        cat.speak(); // Output: Whiskers meows.

        System.out.println(dog.name + " is " + dog.age + " years old.");
        System.out.println(cat.name + " is " + cat.age + " years old.");
    }
}
