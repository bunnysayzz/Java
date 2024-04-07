import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amt) {
        balance += amt;
        System.out.println("Amount deposited successfully. New balance: " + balance);
    }

    public double withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: ");
        double amt = scanner.nextDouble();
        
        if (amt > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
            return balance;
        } else {
            balance -= amt;
            System.out.println("Amount withdrawn successfully. New balance: " + balance);
            return balance;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        account.deposit(500.0);
        double newBalance = account.withdraw();
        System.out.println("Final balance: " + newBalance);
    }
}