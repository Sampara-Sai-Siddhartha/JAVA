// BankAccount class
class BankAccount {
    // Properties
    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}

// SavingsAccount subclass extending BankAccount
class SavingsAccount extends BankAccount {
    // Constructor
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    // Override withdraw method to prevent withdrawals below 100
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance() - 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal not allowed. Insufficient funds or below minimum balance.");
        }
    }
}

public class AccountTest {
    public static void main(String[] args) {
        // Create an instance of BankAccount
        BankAccount myAccount = new BankAccount(500);

        // Deposit and withdraw from BankAccount
        System.out.println("Bank Account Actions:");
        myAccount.deposit(200);
        myAccount.withdraw(100);

        // Create an instance of SavingsAccount
        SavingsAccount mySavingsAccount = new SavingsAccount(500);

        // Deposit and withdraw from SavingsAccount
        System.out.println("\nSavings Account Actions:");
        mySavingsAccount.deposit(200);
        mySavingsAccount.withdraw(50);
        mySavingsAccount.withdraw(400);  // Attempting to withdraw more than allowed
    }
}
