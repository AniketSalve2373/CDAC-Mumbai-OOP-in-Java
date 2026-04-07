import java.util.*;

// Interface
interface BankService {
    void deposit(double amount);

    void withdraw(double amount);
}

// Base class
class Account {
    int accountNumber;
    String holderName;
    double balance;

    Account(int accNo, String name, String balanceStr) {
        this.accountNumber = accNo;
        this.holderName = name;
        this.balance = Double.parseDouble(balanceStr); // wrapper
    }

    String getDetails() {
        return accountNumber + " " + holderName;
    }
}

// Savings Account
class SavingsAccount extends Account implements BankService {

    SavingsAccount(int accNo, String name, String balance) {
        super(accNo, name, balance);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void deposit(double amount, double bonus) { // overloading
        balance += amount + bonus;
    }

    public void withdraw(double amount) {
        if (balance - amount < 0)
            throw new RuntimeException("Insufficient Balance");
        balance -= amount;
    }

    void displayAccountDetails() {
        System.out.println("Savings Account: " + getDetails());
    }
}

// Current Account
class CurrentAccount extends Account implements BankService {

    CurrentAccount(int accNo, String name, String balance) {
        super(accNo, name, balance);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void deposit(double amount, double bonus) {
        balance += amount + bonus;
    }

    public void withdraw(double amount) {
        if (balance - amount < 0)
            throw new RuntimeException("Insufficient Balance");
        balance -= amount;
    }

    void displayAccountDetails() {
        System.out.println("Current Account: " + getDetails());
    }
}

// Main class
public class _2_SmartBankingSystem {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Account Type (1.Savings 2.Current): ");
            int type = sc.nextInt();

            Account acc;

            if (type == 1)
                acc = new SavingsAccount(1, "Aniket", "5000");
            else
                acc = new CurrentAccount(2, "Rahul", "3000");

            BankService service = (BankService) acc;

            service.deposit(1000);
            service.withdraw(500);

            // display details
            if (acc instanceof SavingsAccount)
                ((SavingsAccount) acc).displayAccountDetails();
            else
                ((CurrentAccount) acc).displayAccountDetails();

            // summary using StringBuilder
            StringBuilder sb = new StringBuilder();
            sb.append("Account: ").append(acc.getDetails()).append("\n");
            sb.append("Balance: ").append(acc.balance);

            System.out.println(sb.toString());

        } catch (NumberFormatException e) {
            System.out.println("Invalid balance input");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}