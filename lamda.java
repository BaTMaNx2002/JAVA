interface Greeting {
    void sayHello();
}

public class Main {
    public static void main(String[] args) {
        // Lambda expression implementing the Greeting interface
        Greeting greeting = () -> System.out.println("Hello from the lambda expression!");

        greeting.sayHello();  // Output: Hello from the lambda expression!
    }
}
