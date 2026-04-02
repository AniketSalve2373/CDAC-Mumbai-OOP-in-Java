import java.util.*;

class _3_atm_simulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 10000;

        while (true) {
            System.out.println("\n1. Balance\n2. Deposit\n3. Withdraw\n4. Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Balance: " + balance);
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    balance += sc.nextDouble();
                    break;
                case 3:
                    System.out.print("Enter amount: ");
                    double amt = sc.nextDouble();
                    if (amt <= balance)
                        balance -= amt;
                    else
                        System.out.println("Insufficient Balance");
                    break;
                case 4:
                    sc.close();
                    return;
            }
        }

    }

}