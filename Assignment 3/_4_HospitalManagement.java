import java.util.*;

class ContactDetails {
    String phone;

    ContactDetails(String phone) {
        this.phone = phone;
    }
}

class Patient {
    int id, age;
    String name, disease;
    ContactDetails contact;

    Patient(int id, String name, int age, String disease, ContactDetails contact) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.contact = contact;
    }

    void display() {
        String status = age > 60 ? "Senior Citizen" : "Normal";
        System.out.println(name + " - " + status);
    }
}

public class _4_HospitalManagement {
    public static void main(String[] args) {
        List<Patient> list = new ArrayList<>();

        list.add(new Patient(1, "Aniket", 65, "Flu", new ContactDetails("123")));
        list.add(new Patient(2, "Rahul", 30, "Cold", new ContactDetails("456")));

        for (Patient p : list)
            p.display();
        System.out.println("Total Patients: " + list.size());
    }
}