import java.util.*;

class _4_grocery_bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter price: ");
            total += sc.nextDouble();
        }

        if (total > 3000)
            total *= 0.9;

        System.out.println("Final Bill: " + total);

    }
}