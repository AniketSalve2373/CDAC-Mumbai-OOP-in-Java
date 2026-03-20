import java.util.Scanner;

public class _29_menu_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add\n2. Subtract\n3. Exit");
            choice = sc.nextInt();

            if (choice == 1) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Sum: " + (a + b));
            } else if (choice == 2) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Difference: " + (a - b));
            }

        } while (choice != 3);

        sc.close();
    }
}