import java.util.*;

class _5_salary_slip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();

        double hra = basic * 0.2;
        double da = basic * 0.1;
        double tax = basic * 0.05;

        double salary = basic + hra + da - tax;

        System.out.println("Net Salary: " + salary);

    }
}