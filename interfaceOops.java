// Interfaces
// Interfaces define a contract that classes can implement. They can contain method signatures but no implementation.


interface Animal {
    void sound();
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class interfaceOops {
    public static void main(String[] args) {
        Animal myCat = new Cat();
        myCat.sound(); // Outputs: Cat meows
    }
}