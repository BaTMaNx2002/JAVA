// Encapsulation
// Encapsulation is the bundling of data (attributes) and methods (functions) that operate on the data into a single unit, 
// usually a class. It restricts direct access to some of the object's components.
class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class encapsulationOops {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(100);
        System.out.println("Balance: " + account.getBalance());
    }
}
