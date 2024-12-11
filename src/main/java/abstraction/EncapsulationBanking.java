package abstraction;

public class EncapsulationBanking {
    // Private instance variable to store the current balance
    private int balance;

    // Constructor to initialize the balance
    public void openingBalance(int initialBalance) { 
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
    }

    // Public method to deposit money into the account
    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount. Please deposit a positive amount.");
        }
    }

    // Public method to withdraw money from the account
    public void withdraw(int amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    // Public method to get the current balance
    public int  getBalance() {
        return this.balance;
    }

    public static void main(String[] args) {
        // Create a BankAccount object with an initial balance of $1000
        EncapsulationBanking obj = new EncapsulationBanking();
        
        // Opening Balance
        obj.openingBalance(1000);
        
        // Deposit $500
        obj.deposit(500);

        // Withdraw $200
        obj.withdraw(200);

        // Try to withdraw an invalid or excessive amount
        obj.withdraw(-1000);
        obj.withdraw(1500);

        // Display the final balance
        System.out.println("Current Balance: $" + obj.getBalance());
    }
}

/*
 * In this example:
 * 
 * The balance variable is private, so it cannot be accessed directly from
 * outside the class. The deposit and withdraw methods perform checks to ensure
 * that the amount is valid and that the balance stays within limits. The
 * getBalance method provides a way to retrieve the current balance without
 * directly accessing the balance variable. This ensures that interactions with
 * the bank account are controlled through the provided methods, promoting
 * encapsulation and maintaining the integrity of the account's state.
 */