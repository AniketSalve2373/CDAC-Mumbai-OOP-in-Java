class Student {
    static int count = 0;

    Student() {
        count++;
    }

    static void show() {
        System.out.println("Total: " + count);
    }
}

class _12_student_counter {
    public static void main(String[] args) {
        new Student();
        new Student();
        Student.show();
    }
}