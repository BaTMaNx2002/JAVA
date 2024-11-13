public class TryCatchExample {
    public static void main(String[] args) {
        try {
            String text = null;
            System.out.println(text.length());  // This will throw a NullPointerException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred.");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred: Attempt to access method on null.");
        } catch (Exception e) {
            System.out.println("An unexpected exception occurred.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
