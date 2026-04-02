class Bank {
    int acc;
    String name;
    double bal;

    Bank() {
        acc = 0;
        name = "NA";
        bal = 0;
    }

    Bank(int a, String n, double b) {
        acc = a;
        name = n;
        bal = b;
    }

    void display() {
        System.out.println(acc + " " + name + " " + bal);
    }
}

class _13_bank_account {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        Bank b2 = new Bank(101, "Aniket", 5000);
        b1.display();
        b2.display();
    }
}