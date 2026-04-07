import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    double calculateSalary() {
        return salary;
    }

    double calculateSalary(double bonus) { // method overloading
        return salary + bonus;
    }

    void display() {
        System.out.println(id + " " + name + " Salary: " + salary);
    }
}

public class _7_EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1, "Aniket", 30000));
        list.add(new Employee(2, "Rahul", 25000));

        double total = 0;
        for (Employee e : list) {
            total += e.calculateSalary();
            e.display();
        }

        System.out.println("Total Employees: " + list.size());
        System.out.println("Average Salary: " + (total / list.size()));
    }
}