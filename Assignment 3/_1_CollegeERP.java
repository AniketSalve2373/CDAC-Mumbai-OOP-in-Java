import java.util.*;

class Student {
    int rollNo;
    String name;
    List<String> subjects;
    String phone, email;
    double marks;

    Student(int rollNo, String name, List<String> subjects, String phone, String email, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.subjects = subjects;
        this.phone = phone;
        this.email = email;
        this.marks = marks;
    }
}

public class _1_CollegeERP {
    static List<Student> students = new ArrayList<>();

    static void addStudent(Student s) {
        students.add(s);
    }

    static double averageMarks() {
        double sum = 0;
        for (Student s : students)
            sum += s.marks;
        return sum / students.size();
    }

    static void displayTopper() {
        Student top = Collections.max(students, Comparator.comparingDouble(s -> s.marks));
        System.out.println("Topper: " + top.name);
    }

    public static void main(String[] args) {
        addStudent(new Student(1, "Aniket", Arrays.asList("Math", "Java"), "123", "a@mail.com", 85));
        addStudent(new Student(2, "Rahul", Arrays.asList("DB", "OS"), "456", "b@mail.com", 90));

        System.out.println("Average Marks: " + averageMarks());
        displayTopper();
    }
}