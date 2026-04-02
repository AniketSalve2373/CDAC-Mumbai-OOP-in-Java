import java.util.*;

class _6_bus_booking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean seats[] = new boolean[10];

        while (true) {
            System.out.println("1.View 2.Book 3.Cancel 4.Exit");
            int ch = sc.nextInt();

            if (ch == 1) {
                for (int i = 0; i < 10; i++)
                    System.out.println("Seat " + i + ": " + (seats[i] ? "Booked" : "Free"));
            } else if (ch == 2) {
                int s = sc.nextInt();
                if (!seats[s])
                    seats[s] = true;
                else
                    System.out.println("Already booked");
            } else if (ch == 3) {
                int s = sc.nextInt();
                seats[s] = false;
            } else
                break;
        }

    }
}