public class TryCatchExample {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = 10 / 0;  // This will throw an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("Error: Cannot divide by zero!");
            e.printStackTrace();  // Prints the stack trace for debugging
        } finally {
            // Optional block that always executes (whether or not an exception occurs)
            System.out.println("This is the finally block.");
        }
    }
}
