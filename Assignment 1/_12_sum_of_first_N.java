import java.util.Scanner;

public class _12_sum_of_first_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number n : ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("first n natural number sum is : " + sum);
        sc.close();
    }
}
