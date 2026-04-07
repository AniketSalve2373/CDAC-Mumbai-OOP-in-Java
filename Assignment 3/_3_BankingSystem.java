class Account {
    static int count = 0;
    int accNo;
    String name;
    double balance;

    Account(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
        count++;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void deposit(double amt, String type) {
        System.out.println("Deposit via " + type);
        balance += amt;
    }

    void withdraw(double amt) {
        if (balance >= amt)
            balance -= amt;
        else
            System.out.println("Insufficient Balance");
    }

    void display() {
        System.out.println(accNo + " " + name + " Balance: " + balance);
    }
}

public class _3_BankingSystem {
    public static void main(String[] args) {
        Account a = new Account(1, "Aniket", 5000);
        a.deposit(1000);
        a.deposit(500, "Online");
        a.withdraw(2000);
        a.display();

        System.out.println("Total Accounts: " + Account.count);
    }
}