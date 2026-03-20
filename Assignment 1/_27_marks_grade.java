import java.util.Scanner;

public class _27_marks_grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        for (int i = 1; i <= 5; i++) {
            total += sc.nextInt();
        }

        double percentage = total / 5.0;
        System.out.println("Percentage: " + percentage);

        if (percentage >= 80)
            System.out.println("Grade A");
        else if (percentage >= 60)
            System.out.println("Grade B");
        else
            System.out.println("Fail");

        sc.close();
    }
}