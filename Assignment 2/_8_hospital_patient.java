class Patient {
    int id;
    String name;
    int age;

    Patient(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
        if (age >= 60)
            System.out.println("Senior Citizen");
    }
}

class _8_hospital_patient {
    public static void main(String[] args) {
        Patient p = new Patient(1, "Amit", 65);
        p.display();
    }
}