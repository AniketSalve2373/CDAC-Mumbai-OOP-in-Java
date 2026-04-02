class Emp {
    static int count = 100;
    int id;

    Emp() {
        id = ++count;
    }

    void display() {
        System.out.println("ID: " + id);
    }
}

class _19_employee_id {
    public static void main(String[] args) {
        Emp e1 = new Emp();
        Emp e2 = new Emp();
        e1.display();
        e2.display();
    }
}