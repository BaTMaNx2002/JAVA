interface Greeting {
    void sayHello();
}

public class Main {
    public static void main(String[] args) {
        // Anonymous class implementing the Greeting interface
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from the anonymous class!");
            }
        };

        greeting.sayHello();  // Output: Hello from the anonymous class!
    }
}
