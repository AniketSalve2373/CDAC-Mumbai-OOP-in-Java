import java.util.*;

class _10_restaurant_order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;

        while (true) {
            System.out.println("1.Pizza 200 2.Burger 100 3.Exit");
            int ch = sc.nextInt();

            if (ch == 1)
                total += 200;
            else if (ch == 2)
                total += 100;
            else
                break;
        }

        total += total * 0.05;
        System.out.println("Final Bill: " + total);

    }
}