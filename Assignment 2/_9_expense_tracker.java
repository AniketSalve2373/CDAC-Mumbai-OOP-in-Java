import java.util.*;

class _9_expense_tracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[7];
        int max = 0;

        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println("Highest expense: " + max);
    }
}