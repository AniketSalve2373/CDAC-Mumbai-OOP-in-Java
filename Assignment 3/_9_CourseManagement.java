import java.util.*;

class Course {
    int id;
    String name;
    double fees;

    Course(int id, String name, double fees) {
        this.id = id;
        this.name = name;
        this.fees = fees;
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enroll(Course c) {
        courses.add(c);
    }

    void display() {
        System.out.println("Student: " + name);
        for (Course c : courses) {
            System.out.println(" - " + c.name);
        }
    }
}

public class _9_CourseManagement {
    public static void main(String[] args) {
        Course c1 = new Course(1, "Java", 5000);
        Course c2 = new Course(2, "DBMS", 4000);

        Student s = new Student("Aniket");
        s.enroll(c1);
        s.enroll(c2);

        s.display();

        System.out.println("Total Courses: 2");
    }
}