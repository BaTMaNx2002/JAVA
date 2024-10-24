// Polymorphism
// Polymorphism allows methods to do different things based on the object that it is acting upon. It can be achieved through method overriding and method overloading.

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class polymorphismOops {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound(); // Outputs: Dog barks
    }
}