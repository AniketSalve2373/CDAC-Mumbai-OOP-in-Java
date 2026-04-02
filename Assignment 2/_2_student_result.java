import java.util.*;

class _2_student_result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks of subject " + i + ": ");
            total += sc.nextInt();
        }

        double avg = total / 5.0;

        if (avg >= 90)
            System.out.println("Grade A");
        else if (avg >= 75)
            System.out.println("Grade B");
        else if (avg >= 60)
            System.out.println("Grade C");
        else if (avg >= 40)
            System.out.println("Grade D");
        else
            System.out.println("Fail");

        if (avg >= 40)
            System.out.println("Promoted");
        else
            System.out.println("Not Promoted");

    }
}