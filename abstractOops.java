// Abstraction
// Abstraction is the concept of hiding complex implementation details and showing only the essential features of an object.
//  This can be achieved using abstract classes and interfaces.

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class abstractOops {
    public static void main(String[] args) {
        Shape myShape = new Circle();
        myShape.draw(); // Outputs: Drawing Circle
    }
}